INSERT INTO `roles` (`ROL`) VALUES ('ROLE_ADMIN');
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_MOVIL');
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_QC');
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_CATALOG');

INSERT INTO `centers` (`CS`) VALUES ('Socrates Flores');
INSERT INTO `centers` (`CS`) VALUES ('Francisco Buitrago');
INSERT INTO `centers` (`CS`) VALUES ('Villa Libertad');

INSERT INTO `users` (`NOMBRE_USUARIO`, `CUENTA_SINEXPIRAR`, `CUENTA_SINBLOQUEAR`, `DESCRIPCION`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`, `CREDENCIAL_SINEXPIRAR`, `CORREO_ELECTRONICO`, `HABILITADO`, `FECHA_ULTACC`, `FECHA_ULTMODCRED`, `FECHA_ULTMOD`, `USUARIO_ULTMOD`, `CONTRASENA`) VALUES ('admin', '', '', 'Administrador', '2014-09-20 08:31:00', 'admin', '', 'admincndr@minsa.gob.ni', '', '2014-11-16 10:05:40', NULL, '2014-11-13 17:58:06', 'admin', '6c36dc262b0e44be5811c2296669fc65643aec9dcaa4a76501e0a9508b633fd01ee59a207f8c6d68');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_ADMIN', 'admin', '0', '2016-06-07 10:47:12', 'admin');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_MOVIL', 'admin', '0', '2016-06-07 10:47:12', 'admin');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_QC', 'admin', '0', '2016-06-07 10:47:12', 'admin');
/*Pagina denegado*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( '403.denied', 'Acceso denegado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( '403.deniedmessage', 'Lo sentimos','0');
/*Pagina no encontrado*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( '404.notfound', 'No encontrado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( '404.notfoundmessage', 'Lo sentimos','0');
/*Acciones, todas las paginas*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'actions', 'Acciones','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'add', 'Agregar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'save', 'Guardar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'edit', 'Editar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'cancel', 'Cancelar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'disable', 'Deshabilitar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'enable', 'Habilitar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'end', 'Finalizar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'unlock', 'Desbloquear','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'lock', 'Bloquear','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'export', 'Exportar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ok', 'Aceptar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'search', 'Buscar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'confirm', 'Confirmar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'please.enter', 'Favor ingresar','0');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`, `en`) VALUES ('delete', '0', 'Eliminar', 'Delete');

/*Menu navegacion*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'home', 'Inicio','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'pregnants', 'Embarazadas','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'pregnantsdash', 'Panel de control','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ('diary', 'Agenda', '0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'admin', 'Administracion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'adminusers', 'Usuarios','0');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('lbl.query', '0', 'Consulta');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('editdata', '0', 'Editar datos');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'profile', 'Perfil','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'changepass', 'Cambiar contrasena..','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'logout', 'Salir','0');
/*Mensajes generales, todas las paginas*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'enabled', 'Habilitado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'locked', 'Bloqueado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'form.errors', 'Tiene errores en su formulario. Favor verificar!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'process.errors', 'Han ocurrido errores en el proceso!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'process.success', 'El proceso se ha completado exitosamente!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'date', 'Fecha','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'not', 'Notificacion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'notenabled', 'Deshabilitado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'notlocked', 'Desbloqueado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'seconds', 'segundos','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'session.expiring', 'Su sesion esta a punto de expirar!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'session.expiring.confirm', 'Quiere continuar con su sesion?','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'session.expiring.time', 'Su sesion se cerrara en','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'session.keep', 'Mantener sesion','0');
/*Metadata*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'createdBy', 'Creado por','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'dateCreated', 'Fecha creacion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'modifiedBy', 'Modificado por','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'dateModified', 'Fecha de modificacion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'active', 'Activo','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'addedBy', 'Agregado por','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'dateAdded', 'Fecha','0');

/*login*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login', 'Ingresar','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.accountExpired', 'Cuenta de usuario ha expirado!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.accountLocked', 'Cuenta de usuario esta bloqueada!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.accountNotLocked', 'Cuenta de usuario esta desbloqueada!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.badCredentials', 'Nombre de usuario o contrasena incorrectos!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.credentialsExpired', 'Credenciales de usuario han expirado!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.footer', 'Instituto de Ciencias Sostenibles','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.maxSessionsOut', 'Tiene una sesion activa! No puede crear otra!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.msg', 'Por favor ingresar su nombre de usuario y contrasena','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.page', 'Pagina de ingreso','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.password', 'Contrasena','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.userEnabled', 'Usuario esta activo!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.userDisabled', 'Usuario esta inactivo!','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'login.username', 'Nombre de usuario','0');
/*forzar cambio contraseï¿½a*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'credentials.expired', 'Su contrasena ha caducado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'pass.updated', 'Su contrasena ha sido actualizada','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'password.repeat', 'Repita la contrasena','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'Pattern.password.format', 'Al menos 8 caracteres combinando mayusculas, minusculas, numeros y caracteres especiales','0');
/*Plantilla*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'heading', 'Estudio ZIP','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'title', 'ZIP','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'footer', 'Instituto de Ciencias Sostenibles','0');
/*pagina principal*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'dashboard', 'Panel de control','0');
/*Usuarios*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'username', 'Usuario','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'userdesc', 'Descripcion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'useremail', 'Correo','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'userlock', 'Bloqueado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'usercred', 'Contrasena vencida','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'userexp', 'Cuenta vencida','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'userroles', 'Roles','0');

/*Accesos*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'access', 'Accesos de usuario','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'lastAccess', 'Ultimo acceso','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'dateCredentials', 'Ultimo cambio de contrasena','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'session', 'Id de sesion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ipaddress', 'Direccion IP','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'logindate', 'Fecha ingreso','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'logoutdate', 'Fecha salida','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'logouturl', 'URL salida','0');
/*Audit trail*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'audittrail', 'Bitacora de cambios','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'entityClass', 'Clase','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'entityName', 'Nombre','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'entityProperty', 'Propiedad','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'entityPropertyOldValue', 'Valor anterior','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'entityPropertyNewValue', 'Nuevo valor','0');


/*Roles*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_ADMIN', 'Administrador','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_QC', 'Usuario web','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_MOVIL', 'Usuario movil','0');

/*Catalogos*/
INSERT INTO `messages` (`messageKey`, `es`, `catKey`, `catPasive`) VALUES ( 'snd', 'Si, No, Desconocido',0,'0');
INSERT INTO `messages` (`messageKey`, `es`, `catKey`, `catPasive`) VALUES ( 'no', 'N',2,'0');
INSERT INTO `messages` (`messageKey`, `es`, `catKey`, `catPasive`) VALUES ( 'yes', 'S',1,'0');
INSERT INTO `messages` (`messageKey`, `es`, `catKey`, `catPasive`) VALUES ( 'unk', 'D',9,'0');


/*theme*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.blue', 'Azul','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.boxed', 'En caja','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.color', 'Color','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.dark', 'Negro','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.default', 'Movible','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.fixed', 'Fijo','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.fluid', 'Fuido','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.footer', 'Pie de pagina','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.grey', 'Gris','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.header', 'Encabezado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.layout', 'Diseno','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.left', 'Izquierda','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.light', 'Claro','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.red', 'Rojo','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.right', 'Derecha','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.sbposition', 'Posicion Barra lateral','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'theme.sidebar', 'Barra lateral','0');

/*exportar*/
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('download', '0', 'Descargar');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp00', '0', 'Formulario Zp00 Tamizaje');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp01AD', '0', 'Formulario Zp01 Ingreso Seccion A-D');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp01E', '0', 'Formulario Zp01 Ingreso Seccion E');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp01FK', '0', 'Formulario Zp01 Ingreso Seccion F-K');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp02', '0', 'Formulario Zp02 Muestras Biologicas');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp03', '0', 'Formulario Zp03 Visita Mensual');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp04AD', '0', 'Formulario Zp04 Visita Trimestral Seccion A-D');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp04E', '0', 'Formulario Zp04 Visita Trimestral Seccion E');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp04FH', '0', 'Formulario Zp04 Visita Trimestral Seccion F-H');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp05', '0', 'Formulario Zp05 Ultrasonido');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp06', '0', 'Formulario Zp06 Parto');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp08', '0', 'Formulario Zp08 Salida del estudio');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('allforms', '0', 'Todos');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `en`, `catPasive`, `es`) VALUES ('form', 'Form', '0', 'Formulario');
INSERT INTO `messages` (`messageKey`, `en`, `catPasive`, `es`) VALUES ('event', 'Event', '0', 'Evento');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjectId.start', '0', 'Codigo de Inicio');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjectId.end', '0', 'Codigo de Fin');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('screening_arm_1', '0', 'Tamizaje');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('entry_arm_1', '0', 'Ingreso');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('2_week_post_entry_arm_1', '0', '2 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('4_week_post_entry_arm_1', '0', '4 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('6_week_post_entry_arm_1', '0', '6 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('8_week_post_entry_arm_1', '0', '8 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('10_week_post_entry_arm_1', '0', '10 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('12_week_post_entry_arm_1', '0', '12 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('14_week_post_entry_arm_1', '0', '14 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('16_week_post_entry_arm_1', '0', '16 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('18_week_post_entry_arm_1', '0', '18 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('20_week_post_entry_arm_1', '0', '20 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('22_week_post_entry_arm_1', '0', '22 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('24_week_post_entry_arm_1', '0', '24 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('26_week_post_entry_arm_1', '0', '26 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('28_week_post_entry_arm_1', '0', '28 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('30_week_post_entry_arm_1', '0', '30 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('32_week_post_entry_arm_1', '0', '32 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('34_week_post_entry_arm_1', '0', '34 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('36_week_post_entry_arm_1', '0', '36 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('38_week_post_entry_arm_1', '0', '38 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('40_week_post_entry_arm_1', '0', '40 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('42_week_post_entry_arm_1', '0', '42 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('44_week_post_entry_arm_1', '0', '44 Semanas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('delivery_arm_1', '0', 'Parto');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('6_week_post_partum_arm_1', '0', 'Posparto');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('unscheduled_visit_arm_1', '0', 'Visita no programada 1');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('unscheduled_visit_arm_1b', '0', 'Visita no programada 2');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('unscheduled_visit_arm_1c', '0', 'Visita no programada 3');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('unscheduled_visit_arm_1d', '0', 'Visita no programada 4');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('unscheduled_visit_arm_1e', '0', 'Visita no programada 5');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('study_exit_arm_1', '0', 'Salida del estudio');

/*query*/
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('consult', '0', 'Consultar');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('query.help', '0', 'Favor especifar cada columna en el SELECT, no usar *');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('run', '0', 'Ejecutar');
/*etiquetas comunes*/
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('lbl.select', '0', 'Seleccione');
/*entidades*/
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('class ni.org.ics.zip.domain.relationships.UserCenter', '0', 'Centro del usuario');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('class ni.org.ics.zip.users.model.UserSistema', '0', 'Usuario');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('class ni.org.ics.zip.users.model.Authority', '0', 'Rol del usuario');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('class ni.org.ics.zip.domain.catalogs.Provider', '0', 'Proveedor');
/*Agenda*/
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjectId', '0', 'Codigo Participante');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('diary.registerdate', '0', 'Fecha Ingreso');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('diary.event', '0', 'Semana Cita');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('diary.scheduleddate', '0', 'Fecha Programada');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('diary.agreeddate', '0', 'Fecha Cita');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('visits', '0', 'Visitas');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('diary.agreedtime', '0', 'Hora Cita');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('diary.programmingdate', '0', 'Fecha de programacion de cita');

/*dashboard*/
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week2', '0', 'Semana 2');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week4', '0', 'Semana 4');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week6', '0', 'Semana 6');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week8', '0', 'Semana 8');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week10', '0', 'Semana 10');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week12', '0', 'Semana 12');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week14', '0', 'Semana 14');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week16', '0', 'Semana 16');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week18', '0', 'Semana 18');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week20', '0', 'Semana 20');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week22', '0', 'Semana 22');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week24', '0', 'Semana 24');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week26', '0', 'Semana 26');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week28', '0', 'Semana 28');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week30', '0', 'Semana 30');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week32', '0', 'Semana 32');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week34', '0', 'Semana 34');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week36', '0', 'Semana 36');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week38', '0', 'Semana 38');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week40', '0', 'Semana 40');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week42', '0', 'Semana 42');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('week44', '0', 'Semana 44');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('entry', '0', 'Ingreso');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('delivery', '0', 'Parto');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('postdeli', '0', 'Postparto');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('detail', '0', 'Detalle');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('realized', '0', 'Realizado');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('pending', '0', 'Pendiente');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('status', '0', 'Estado');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjects', '0', 'Participantes');

//Dashboard panel principal
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('change.date.range', '0', 'Cambiar el rango de fecha del panel');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('applyLabel', '0', 'Aplicar');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('fromLabel', '0', 'Desde');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('toLabel', '0', 'Hasta');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('customRangeLabel', '0', 'Personalizado');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('Su', '0', 'Do');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('Mo', '0', 'Lu');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('Tu', '0', 'Ma');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('We', '0', 'Mi');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('Th', '0', 'Ju');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('Fr', '0', 'Vi');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('Sa', '0', 'Sa');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('january', '0', 'Enero');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('february', '0', 'Febrero');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('march', '0', 'Marzo');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('april', '0', 'Abril');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('may', '0', 'Mayo');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('june', '0', 'Junio');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('july', '0', 'Julio');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('august', '0', 'Agosto');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('september', '0', 'Septiembre');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('october', '0', 'Octubre');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('november', '0', 'Noviembre');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('december', '0', 'Diciembre');

INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('screenxday', '0', 'Tamizajes por dia');
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('total', '0', 'Total');

/*INFANTE*/
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp07', '0', 'Formulario Zp07 Evaluacion del Infante');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('zp02d', '0', 'Formulario Zp02d Muestras Biologicas de Infante');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('birth_arm_2', '0', 'Nacimiento');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('3_months_arm_2', '0', '3 Meses');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('6_months_arm_2', '0', '6 Meses');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('12_months_arm_2', '0', '12 Meses');

/*Editar datos de formularios*/
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('setnull', '0', 'Establecer como Null');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('editdata.help', '0', 'Para campos tipo fecha usar formato dd/mm/yyyy. Para campos fecha y hora usar formato dd/mm/yyyy HH:mm (24 horas)');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('zpCR', '0', 'Recepcion de consentimientos');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('zpCS', '0', 'Salida de consentimientos');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('zpRRUS', '0', 'RecepciÃ³n de reportes US');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('zpSRUS', '0', 'Salida de reportes US');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('us_event_screening', '0', 'Ingreso');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('us_event_tri2', '0', '2do Trimestre');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('us_event_tri3', '0', '3er Trimestre');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('us_event_unsched', '0', 'No programado');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('lbl.any', '0', 'Nunguno');

/*Catalogos*/
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_CATALOG');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_CATALOG', 'Catálogos','0');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('catalog', '0', 'Catálogos');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('catalogcenter', '0', 'Unidad de Salud');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('centers', '0', 'Unidades de Salud');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('centerName', '0', 'Nombre Unidad de Salud');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('catalogsubjtype', '0', 'Tipo de agenda');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjtypes', '0', 'Tipos de agenda');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjtypeName', '0', 'Nombre Tipo de Agenda'); 
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('specialities', '0', 'Especialidades');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('speciality', '0', 'Especialidad');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('catalogspeciality', '0', 'Especialidades'); 
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('appointmentTypes', '0', 'Tipos de citas');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('appointmentType', '0', 'Tipo de cita');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('catalogapptype', '0', 'Tipos de citas'); 
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('catalogprovider', '0', 'Proveedores de salud');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('providers', '0', 'Proveedores');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('providername', '0', 'Nombre');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('providerus', '0', 'Unidad de salud');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('providersp', '0', 'Especialidad');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catKey`, `en`, `catPasive`, `es`) VALUES ('providerid', NULL, NULL, '0', 'Codigo Proveedor');
INSERT INTO `messages` (`messageKey`, `catKey`, `en`, `catPasive`, `es`) VALUES ('provider.enabled', NULL, NULL, '0', 'Proveedor habilitado');
INSERT INTO `messages` (`messageKey`, `catKey`, `en`, `catPasive`, `es`) VALUES ('provider.disabled', NULL, NULL, '0', 'Proveedor deshabilitado');
INSERT INTO `messages` (`messageKey`, `catKey`, `en`, `catPasive`, `es`) VALUES ('superstudies', NULL, NULL, '0', 'Especialidad');
INSERT INTO `zika_zip`.`Messages` (`messageKey`, `catPasive`, `es`) VALUES ('agenda_fecha', '0', 'Fecha de Cita');
INSERT INTO `zika_zip`.`Messages` (`messageKey`, `catPasive`, `es`) VALUES ('agenda_hora', '0', 'Hora de Cita');
INSERT INTO `zika_zip`.`Messages` (`messageKey`, `catPasive`,`es`) VALUES ('phone_number', '0', 'Número Teléfono');
INSERT INTO `zika_zip`.`Messages` (`messageKey`, `catPasive`,`es`) VALUES ('sms_number', '0', 'Número Mensaje');
INSERT INTO `zika_zip`.`Messages` (`messageKey`, `catPasive`,`es`) VALUES ('asistencia', '0', '¿Asistio?');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('provider', '0', 'Proveedor');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('newAppointment', '0', 'Nueva cita');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('additionalText', '0', 'Observaciones');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('hora_inicio', '0', 'Inicio');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('hora_fin', '0', 'Fin');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('confirmQuestion', '0', '¿Seguro de seguir con el proceso?');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('autoriaSMS', '0', 'Autoriza Envio Mesaje SMS');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('err_msg_participante_no_existe', '0', 'EL codigo de participante no existe');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('err_msg_participante_ya_agendado', '0', 'Ya se encuentra agendado un participante para esta fecha y hora.');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('horario_no_permitido', '0', 'Hora de cita no permitida.');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('listado', '0', 'Listado');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('calendario', '0', 'Calendario');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('filtrar', '0', 'Filtrar');


/*Parametros */
INSERT INTO `zika_zip`.`parameters` (`Name`, `Value`) VALUES ('agenda_HoraInicioAtencion', '8:00am');
INSERT INTO `zika_zip`.`parameters` (`Name`, `Value`) VALUES ('agenda_HoraFinAtencion', '5:00pm');
INSERT INTO `zika_zip`.`parameters` (`Name`, `Value`) VALUES ('agenda_tiempo_cita', '30');
INSERT INTO `zika_zip`.`parameters` (`Name`, `Value`) VALUES ('agenda_dias_semana_laborales', '[0,6]');
INSERT INTO `zika_zip`.`parameters` (`Name`, `Value`) VALUES ('agenda_dias_feriados', '[ {"dia":"1", "mes":"1"} ,{"dia":"14","mes":"9"},{"dia":"15" ,"mes":"9"},{"dia":"02","mes":"11"} ]');



