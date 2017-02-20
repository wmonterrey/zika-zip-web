package ni.org.ics.zip.service;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import ni.org.ics.zip.domain.audit.AuditTrail;
import ni.org.ics.zip.utils.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by FIRSTICT on 2/16/2017.
 * V1.0
 */
@Service("editarDatosService")
@Transactional
public class EditarDatosService {

    @Resource(name = "auditTrailService")
    private AuditTrailService auditTrailService;

    private static Connection getConnection() throws Exception{
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("zikazip");
        dataSource.setPassword("jeKAQudi");
        dataSource.setServerName("localhost");
        dataSource.setPort(3306);
        dataSource.setDatabaseName("zika_zip");

        return dataSource.getConnection();
    }

    public List<String> getTableMetaData(String tableName) throws Exception{
        Connection con = getConnection();
        List<String> columns = new ArrayList<String>();
        try {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet res = meta.getColumns(null, null, tableName, null);
            while (res.next()) {
                //excluir estos campos
                if (!res.getString("COLUMN_NAME").equalsIgnoreCase("identificador_equipo") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("end") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("estado") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("id_instancia") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("instance_path") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("PASIVO") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("phonenumber") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("FECHA_REGISTRO") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("USUARIO_REGISTRO") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("simserial") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("start") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("today") &&
                        !res.getString("COLUMN_NAME").equalsIgnoreCase("prescreen_id")
                        ) {
                    if (res.getString("COLUMN_NAME").equalsIgnoreCase("record_id") && !columns.isEmpty()) {
                        //el record_id siempre debe ser el primer campo
                        String columnaTmp = columns.get(0);
                        columns.set(0,res.getString("COLUMN_NAME"));
                        columns.add(columnaTmp);
                    }
                    else {
                        columns.add(res.getString("COLUMN_NAME"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (con !=null)
                con.close();
        }
        return columns;
    }

    public int getColumnType(String tableName, String columnName) throws Exception{
        Connection con = getConnection();
        int type = 0;
        try {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet res = meta.getColumns(null, null, tableName, null);
            while (res.next()) {
                    if (res.getString("COLUMN_NAME").equalsIgnoreCase(columnName)) {
                        //el record_id siempre debe ser el primer campo
                        type = res.getInt("DATA_TYPE");
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (con !=null)
                con.close();
        }
        return type;
    }

    public int updateProperty(String tabla, String evento, String id, String propiedad, String valor, boolean setNull, String actorId) throws Exception {
        Connection connection = getConnection();
        int registros = 0;
        int resultado = 0;
        StringBuilder stringBuilder = null;

        StringBuilder stringBuilder2 = new StringBuilder("select ");
        stringBuilder2.append(propiedad)
                .append(", redcap_event_name from ")
                .append(tabla)
                .append(" where ")
                .append(" record_id = '")
                .append(id).append("'");
        if (evento!=null)
            stringBuilder2.append(" and redcap_event_name = '")
                    .append(evento).append("'");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(stringBuilder2.toString());
        while(resultSet.next()) {
            stringBuilder = new StringBuilder("update ");
            stringBuilder.append(tabla)
                    .append(" set ")
                    .append(propiedad)
                    .append((setNull?" = null ":" = ? "))
                    .append(" where ")
                    .append(" record_id = '")
                    .append(id).append("'")
                    .append(" and redcap_event_name = '")
                    .append(resultSet.getString(2)).append("'");

            AuditTrail auditTrail = new AuditTrail();
            auditTrail.setEntityId(id+","+resultSet.getString(2));
            auditTrail.setEntityName(tabla);
            auditTrail.setEntityClass("editardatos." + tabla);
            auditTrail.setEntityProperty(propiedad);
            auditTrail.setEntityPropertyNewValue((setNull?null:valor));
            auditTrail.setEntityPropertyOldValue((resultSet.getObject(1)!=null?resultSet.getObject(1).toString():null));
            auditTrail.setOperationType("UPDATE");
            auditTrail.setOperationDate(new Date());
            auditTrail.setUsername(actorId);

            PreparedStatement pstm = connection.prepareStatement(stringBuilder.toString());

            if (!setNull) {
                int type = getColumnType(tabla, propiedad);
                if (type == Types.VARCHAR)
                    pstm.setString(1, valor);
                else if (type == Types.DATE) {
                    if (valor.trim().contains(" ")) {
                        pstm.setDate(1, new java.sql.Date(DateUtil.StringToDate(valor, "dd/MM/yyyy").getTime()));
                    }
                } else if (type == Types.TIMESTAMP) {
                    if (valor.trim().contains(" ")) {
                        pstm.setTimestamp(1, new Timestamp(DateUtil.StringToDate(valor, "dd/MM/yyyy HH:mm").getTime()));
                    } else {
                        pstm.setDate(1, new java.sql.Date(DateUtil.StringToDate(valor, "dd/MM/yyyy").getTime()));
                    }
                } else if (type == Types.INTEGER)
                    pstm.setInt(1, Integer.valueOf(valor));
                else if (type == Types.FLOAT || type == Types.REAL)
                    pstm.setFloat(1, Float.valueOf(valor));
            }

            resultado=pstm.executeUpdate();
            if (resultado>0){
                registros+=resultado;
                auditTrailService.saveAuditTrail(auditTrail);
            }
        }
        return registros;
    }

}
