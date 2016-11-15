INSERT INTO `roles` (`ROL`) VALUES ('ROLE_ADMIN');
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_ADD_RES');
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_EDIT_RES');
INSERT INTO `roles` (`ROL`) VALUES ('ROLE_DEL_RES');
INSERT INTO `users` (`NOMBRE_USUARIO`, `CUENTA_SINEXPIRAR`, `CUENTA_SINBLOQUEAR`, `DESCRIPCION`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`, `CREDENCIAL_SINEXPIRAR`, `CORREO_ELECTRONICO`, `HABILITADO`, `FECHA_ULTACC`, `FECHA_ULTMODCRED`, `FECHA_ULTMOD`, `USUARIO_ULTMOD`, `CONTRASENA`) VALUES ('admin', '', '', 'Administrador', '2014-09-20 08:31:00', 'admin', '', 'admincndr@minsa.gob.ni', '', '2014-11-16 10:05:40', NULL, '2014-11-13 17:58:06', 'admin', '6c36dc262b0e44be5811c2296669fc65643aec9dcaa4a76501e0a9508b633fd01ee59a207f8c6d68');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_ADMIN', 'admin', '0', '2016-06-07 10:47:12', 'admin');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_ADD_RES', 'admin', '0', '2016-06-07 10:47:12', 'admin');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_EDIT_RES', 'admin', '0', '2016-06-07 10:47:12', 'admin');
INSERT INTO `users_roles` (`ROL`, `NOMBRE_USUARIO`, `PASIVO`, `FECHA_REGISTRO`, `USUARIO_REGISTRO`) VALUES ('ROLE_DEL_RES', 'admin', '0', '2016-06-07 10:47:12', 'admin');
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

/*Men�*/
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'home', 'Inicio','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'results', 'Solicitudes','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'addres', 'Agregar Resultado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'editres', 'Editar Resultado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'del.res', 'Borrar Resultado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'admin', 'Administracion','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'adminusers', 'Usuarios','0');
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
/*forzar cambio contrase�a*/
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
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_ADD_RES', 'Agregar Resultado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_EDIT_RES', 'Editar Resultado','0');
INSERT INTO `messages` (`messageKey`, `es`, `catPasive`) VALUES ( 'ROLE_DEL_RES', 'Borrar Resultado','0');

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
INSERT INTO `zika_zip`.`messages` (`messageKey`, `en`, `catPasive`, `es`) VALUES ('form', 'Form', '0', 'Formulario');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjectId.start', '0', 'Codigo de Inicio');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('subjectId.end', '0', 'Código de Fin');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('run', '0', 'Ejecutar');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('lbl.query', '0', 'Consulta');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('consult', '0', 'Consultar');
INSERT INTO `zika_zip`.`messages` (`messageKey`, `catPasive`, `es`) VALUES ('query.help', '0', 'Favor especifar cada columna en el SELECT, no usar *');

/*etiquetas comunes*/
INSERT INTO `messages` (`messageKey`, `catPasive`, `es`) VALUES ('lbl.select', '0', 'Seleccione');
