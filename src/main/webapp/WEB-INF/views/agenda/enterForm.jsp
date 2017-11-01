<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!--[if IE 8]> <html class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<jsp:include page="../fragments/headTag.jsp" />
<!-- BEGIN PAGE LEVEL STYLES -->
<spring:url value="/resources/plugins/select2/select2_conquer.css"
	var="sel2css" />
<link rel="stylesheet" type="text/css" href="${sel2css}" />
<spring:url
	value="/resources/plugins/jquery-multi-select/css/multi-select.css"
	var="jqmscss" />
<link rel="stylesheet" type="text/css" href="${jqmscss}" />

<spring:url
	value="/resources/plugins/bootstrap-timepicker/compiled/timepicker.css"
	var="timecss" />
<link rel="stylesheet" type="text/css" href="${timecss}" />
<spring:url
	value="/resources/plugins/bootstrap-datepicker/css/datepicker.css"
	var="datecss" />
<link rel="stylesheet" type="text/css" href="${datecss}" />
<spring:url
	value="/resources/plugins/clockface/css/clockface.css"
	var="clockcss" />
<link rel="stylesheet" type="text/css" href="${clockcss}" />


<spring:url value="/resources/plugins/bootstrap-switch/bootstrap-switch.css"
	var="switch_css" />
<link rel="stylesheet" type="text/css" href="${switch_css}" />

<spring:url value="/resources/plugins/bootstrap-switch/bootstrap-switch.min.css"
	var="switchMin_css" />
<link rel="stylesheet" type="text/css" href="${switchMin_css}" />



<!-- END PAGE LEVEL STYLES -->
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-sidebar-fixed page-footer-fixed">
	<!-- BEGIN HEADER -->
	<jsp:include page="../fragments/bodyHeader.jsp" />
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<jsp:include page="../fragments/bodyNavigation.jsp" />
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<div class="page-content-wrapper">
				<div class="page-content">
					<!-- BEGIN STYLE CUSTOMIZER -->
					<jsp:include page="../fragments/bodyCustomizer.jsp" />
					<!-- BEGIN PAGE HEADER-->
					<div class="row">
						<div class="col-md-12">
							<!-- BEGIN PAGE TITLE & BREADCRUMB-->
							<h3 class="page-title">
								<spring:message code="diary.programmingdate" />
							</h3>
							<ul class="page-breadcrumb breadcrumb">
								<li><i class="fa fa-home"></i> <a
									href="<spring:url value="/" htmlEscape="true "/>"><spring:message
											code="home" /></a> <i class="fa fa-angle-right"></i> <a
									href="<spring:url value="/agenda/" htmlEscape="true "/>"><spring:message
											code="diary" /></a> <i class="fa fa-angle-right"></i> <a
									href="<spring:url value="" htmlEscape="true "/>"><spring:message code="newAppointment" /></a>
								</li>
							</ul>
							<!-- END PAGE TITLE & BREADCRUMB-->
						</div>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<spring:url value="/agenda/" var="agendaUrl"></spring:url>
					
					<c:set var="providerCreated">
						<spring:message code="process.success" />
					</c:set>
					<c:set var="errorProcess">
						<spring:message code="process.errors" />
					</c:set>

					<div class="row">
						<div class="col-md-12">
							<div class="portlet">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-group"></i>
									</div>
									<div class="tools">
										<a href="javascript:;" class="collapse"></a> <a
											href="javascript:;" class="remove"></a>
									</div>
								</div>
								<div class="portlet-body form">
									<form action="#" autocomplete="off" id="add-agenda-form"
										class="form-horizontal">
										<div class="form-body">
											<div class="alert alert-danger display-hide">
												<button class="close" data-close="alert"></button>
												<spring:message code="form.errors" />
											</div>
											<div class="form-group" id="textid">
												<label class="control-label col-md-3"><spring:message
														code="providerid" /> <span class="required"> * </span> </label>
												<div class="col-md-5">
													<div class="input-group">
														<input value="${provider.id}" id="id" name="id" readonly
															type="text" placeholder="<spring:message code="id" />"
															class="form-control" /> <span class="input-group-addon">
															<i class="fa fa-keyboard-o"></i>
														</span>
													</div>
												</div>
											</div>
												<div class="form-group" >
												<label class="control-label col-md-3"><spring:message
														code="subjectId" /> <span class="required"> * </span> </label>
												<div class="col-md-5">
													<div class="input-group">
														<input  id="id" name="recordid"
															type="text" placeholder="<spring:message code="subjectId" />"
															class="form-control" /> <span class="input-group-addon">
															<i class="fa fa-keyboard-o"></i>
														</span>
													</div>
												</div>
											</div>
											<!--  SE CALCULARA SEGUN EL CODIGO DE PARTICIPANTE INGRESADO
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="catalogsubjtype" />
														 <span class="required"> * </span></label> 
												<div class="col-md-5">
													<select
														data-placeholder="<spring:message code="select" /> <spring:message code="catalogsubjtype" />"
														name="tipoAgenda" id="tipoAgenda" class="form-control">
												
														<c:forEach items="${tipoAgendas}" var="registro">
															<c:choose>
																<c:when test="${registro.subjectType eq provider.us}">
																	<option selected value="${centro.cs}">${centro.cs}</option>
																</c:when>
																<c:otherwise>
																	<option value="${registro.subjectType}">${registro.subjectType}</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
											</div>
											-->
										<div class="form-group">
														<label class="control-label col-md-3"><spring:message
																code="date" /> <span class="required"> * </span> </label>
														<div class="col-md-5">
															<div class="input-group">
																<input class="form-control date-picker" type="text"
																	name="diarydate" id="diarydate"
																	value="<fmt:formatDate value="${today}" pattern="dd/MM/yyyy" />" />
																<span class="input-group-addon"> <i
																	class="fa fa-calendar"></i>
																</span>
															</div>
														</div>
													</div>
													
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="agenda_hora" /> <span class="required"> * </span>
												</label>
												<div class="col-md-5">
													<div class="input-group bootstrap-timepicker"  id="divtimepicker">
														<input type="text" class="form-control timepicker-default" name="timepicker" id="timepicker"
														  value="<fmt:formatDate value="${today}" pattern="hh:MM" />" /> 
														<span class="input-group-btn">
															<button class="btn btn-default" type="button"><i class="fa fa-clock-o"></i></button>
														</span>
													</div>
												</div>
											</div>
											
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="appointmentType" />
														 <span class="required" > * </span></label> 
												<div class="col-md-5">
													<select
														data-placeholder="<spring:message code="select" /> <spring:message code="centerName" />"
														name="tipoCita" id="tipoCita" class="form-control">
														<option value=""></option>
														<c:forEach items="${tipoCitas}" var="registro">
															<c:choose>
																<c:when test="${registro.appointmentType eq zpAgendaEstudio.appointmentType}">
																	<option selected value="${registro.appointmentType}">${centro.appointmentType}</option>
																</c:when>
																<c:otherwise>
																	<option value="${registro.appointmentType}">${registro.appointmentType}</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
											</div>
											
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="provider" /> <span class="required"> * </span>
														</label>
												<div class="col-md-5">
												
													<select
														data-placeholder="<spring:message code="select" /> <spring:message code="providername" />"
														name="providerName" id="providerName" class="form-control">
														<option value=""></option>
														<c:forEach items="${proveedores}" var="proveedor">
															<c:choose>
																<c:when test="${proveedor.id eq zpAgendaEstudio.provider}">
																	<option selected value="${proveedor.name}">${proveedor.name}</option>
																</c:when>
																<c:otherwise>
																	<option value="${proveedor.name}">${proveedor.name}</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="catalogcenter" />
														 <span class="required"> * </span></label> 
												<div class="col-md-5">
													<select
														data-placeholder="<spring:message code="select" /> <spring:message code="centerName" />"
														name="unidadSalud" id="unidadSalud" class="form-control">
														<option value=""></option>
														<c:forEach items="${centrosusuario}" var="centro">
															<c:choose>
																<c:when test="${centro.pasive=='0'.charAt(0)}">
																	<option selected value="${centro.userCenterId.center}">${centro.userCenterId.center}</option>
																</c:when>															
															</c:choose>
														</c:forEach>
													</select>
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="superstudies" /><span class="required"> * </span> </label>
												<div class="col-md-5">
														<select
														data-placeholder="<spring:message code="select" /> <spring:message code="superstudies" />"
														name="tipoespecialidad" id="tipoespecialidad" class="form-control">
														<option value=""></option>
														<c:forEach items="${especialidades}" var="especialidad">
															<c:choose>
																<c:when test="${especialidad.speciality eq provider.speciality}">
																	<option selected value="${especialidad.speciality}">${especialidad.speciality}</option>
																</c:when>
																<c:otherwise>
																	<option value="${especialidad.speciality}">${especialidad.speciality}</option>
																</c:otherwise>
															</c:choose>
														</c:forEach>
													</select>
												</div>
											</div>
											
										
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="autoriaSMS" /> </label>
												<div class="col-md-5">
													
													<div class="make-switch switch-small">
														 <input type="checkbox" data-on-text="<spring:message code="yes"/>"  data-off-text="No"  
														 class="alert-status" id = "autorizaSms" name = "autorizaSms" />
														</div>
														
												</div>
											</div>
											<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="sms_number" />  <span class="required" style="visibility:hidden" id="requieresms"> * </span> </label>
												<div class="col-md-5">
														<input class="form-control" id="smsNumber" readonly name="smsNumber" type="text">
												</div>
											</div>
										</div>
										<div class="form-group">
												<label class="control-label col-md-3"><spring:message
														code="additionalText" /> </label>
												<div class="col-md-5">
														<textarea name="observacion" id="observacion" class="form-control" rows="3"></textarea>
												</div>
											</div>
										<div class="form-actions fluid">
											<div class="col-md-offset-6 col-md-6">
												<button id="guardar" type="submit" class="btn btn-success">
													<spring:message code="save" />
												</button>
												<a href="${fn:escapeXml(agendaUrl)}" class="btn btn-danger"><spring:message
														code="end" /></a>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!-- END PAGE CONTENT -->
				</div>
			</div>
		</div>
		<!-- END CONTENT -->
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<jsp:include page="../fragments/bodyFooter.jsp" />
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<jsp:include page="../fragments/corePlugins.jsp" />
	<jsp:include page="../fragments/bodyUtils.jsp" />
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<c:choose>
		<c:when test="${cookie.invLang.value == null}">
			<c:set var="lenguaje" value="es" />
		</c:when>
		<c:otherwise>
			<c:set var="lenguaje" value="${cookie.invLang.value}" />
		</c:otherwise>
	</c:choose>
	<spring:url value="/resources/plugins/select2/select2.min.js"
		var="Select2" />
	<script type="text/javascript" src="${Select2}"></script>
	
		<!-- bootstrap datepicker -->
	<spring:url
		value="/resources/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"
		var="datepickerPlugin" />
	<script src="${datepickerPlugin}"></script>
	<spring:url
		value="/resources/plugins/bootstrap-datepicker/js/locales/bootstrap-datepicker.{languagedt}.js"
		var="datePickerLoc">
		<spring:param name="languagedt" value="${lenguaje}" />
	</spring:url>
	<script src="${datePickerLoc}"></script>
	
	<spring:url
		value="/resources/plugins/bootstrap-timepicker/js/bootstrap-timepicker.js"
		var="bootsTimerPlugin" />
	<script src="${bootsTimerPlugin}"></script>
	

	<spring:url
		value="/resources/plugins/clockface/js/clockface.js"
		var="clockPlugin" />
	<script src="${clockPlugin}"></script>
	
	<spring:url
		value="/resources/plugins/moment.js"
		var="momentPlugin" />
	<script src="${momentPlugin}"></script>
	
	<spring:url
		value="/resources/plugins/jquery-multi-select/js/jquery.multi-select.js"
		var="jQueryMultiSelect" />
	<script type="text/javascript" src="${jQueryMultiSelect}"></script>
	<spring:url
		value="/resources/plugins/jquery-validation/dist/jquery.validate.min.js"
		var="jQValidation" />
	<script type="text/javascript" src="${jQValidation}"></script>
	<spring:url
		value="/resources/plugins/jquery-validation/dist/additional-methods.min.js"
		var="jQValidationAdd" />
	<script type="text/javascript" src="${jQValidationAdd}"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<spring:url value="/resources/plugins/bootstrap-switch/bootstrap-switch.js"
		var="switchScript" />
	<script src="${switchScript}" type="text/javascript"></script>
	
	<spring:url value="/resources/plugins/bootstrap-switch/bootstrap-switch.min.js"
		var="switchMinScript" />
	<script src="${switchMinScript}" type="text/javascript"></script>
	
	
	<spring:url value="/resources/scripts/app.js" var="App" />
	<script src="${App}" type="text/javascript"></script>
	<spring:url value="/resources/scripts/diary/process-agenda.js"
		var="agendaScript" />
	<script src="${agendaScript}" type="text/javascript"></script>
	<spring:url
		value="/resources/plugins/jquery-validation/localization/messages_{language}.js"
		var="jQValidationLoc">
		<spring:param name="language" value="${lenguaje}" />
	</spring:url>
	<spring:url value="/resources/scripts/utils/handleDatePickers.js"
		var="handleDatePickers" />
	<script src="${handleDatePickers}" type="text/javascript"></script>
	<script src="${jQValidationLoc}" /></script>
	<spring:url
		value="/resources/plugins/select2/select2_locale_{language}.js"
		var="Select2Loc">
		<spring:param name="language" value="${lenguaje}" />
	</spring:url>
	<script src="${Select2Loc}" /></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<spring:url value="/agenda/saveCita" var="saveCitaUrl" />
	<c:set var="successmessage">
		<spring:message code="process.success" />
	</c:set>
	<c:set var="errormessage">
		<spring:message code="process.errors" />
	</c:set>
	<c:set var="invalidTimeMessage">
		<spring:message code="horario_no_permitido" />
	</c:set>
	<script>
    $(function () {
    	$("li.super").removeClass("super").addClass("active");
        $("li.supercenters").removeClass("supercenters").addClass("active");
    });
</script>
	<script>
	jQuery(document).ready(function() {
		 App.init();
		 var picker= $('#timepicker').timepicker({
             minuteStep: '${agenda_tiempo_cita}'
            
         });
		
		 var test = '${agenda_tiempo_cita}';
		 if(test == '')// esta variable esta vacia
		 	alert("agenda_tiempo_cita = ''");
         var jsonObj  = ${agenda_tiempo_cita} ;
         test = '${agenda_dias_semana_nolaborales}';
         if(test == '')// esta variable esta vacia
 		 	alert("agenda_dias_semana_nolaborales = ''");
         
         var diasNoLab =  ${agenda_dias_semana_nolaborales} ;
         var fechas = [];
         var currentYear  = (new Date()).getFullYear();
        // desabilitar varios años
        for(k = -1 ; k < 5 ; k++){
	         for(i = 0 ; i < jsonObj.length; i++){
	        	 var date = new Date(currentYear + k ,parseInt(jsonObj[i].mes)-1 , parseInt(jsonObj[i].dia));
	        	 fechas.push(date);
	         }
         }
		 // Deshabiliar dias feriados
		 $('.date-picker').datepicker({
            language: '${lenguaje}',
            format:'dd/mm/yyyy',
            autoclose: true,
          //  daysOfWeekDisabled: [0, 6]
            beforeShowDay: function (currentDate) {
                var dayNr = currentDate.getDay();
                var dateNr = moment(currentDate.getDate()).format("DD-MM-YYYY");

                if (!diasNoLab.indexOf(dayNr)) {
                    return false;
                }

              //  if (dayNr == 0) {//Sabados
               //     return false;
               // }
                  if (fechas.length > 0) {
                        for (var i = 0; i < fechas.length; i++) {                        
                            if (moment(currentDate).unix()==moment(fechas[i],'DD.MM.YYYY').unix()){
                                return false;
                           }
                        }
                    }
                    return true;
                }
        });
		
		 var parametros = {saveCitaUrl: "${saveCitaUrl}",
					agendaUrl: "${agendaUrl}",
					successmessage: "${successmessage}",
					errormessage: "${errormessage}" ,
					beginningTime:  moment('${agenda_HoraInicioAtencion}', 'h:mma'),
					endTime: moment('${agenda_HoraFinAtencion}', 'h:mma') ,
					invalidTimeMessage:"${invalidTimeMessage}"
					} ;
		 procAgenda.init(parametros);
		 $('#textid').hide();		 
		
		 
		 $('.alert-status').bootstrapSwitch('state');
		 
		 
		 $('.alert-status').on('switchChange.bootstrapSwitch', function (event, state) {				
			 if(state){
				 document.getElementById("requieresms").style.visibility = "visible";
				 document.getElementById("smsNumber").readOnly  = false;
				 $('#smsNumber').rules('add',{required : true,  minlength: 8, maxlength: 8});
			 }
			 else{
			 	document.getElementById("requieresms").style.visibility = "hidden";
			 	 document.getElementById("smsNumber").readOnly  = true;
			 	 document.getElementById("smsNumber").value  = "";
			 	 $('#smsNumber').rules('add',{required : false});
			 }			
		 
		 });
		 
	});	
</script>
	<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>