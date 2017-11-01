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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>

<jsp:include page="../fragments/headTag.jsp" />
<!-- BEGIN PAGE LEVEL STYLES -->
<spring:url value="/resources/plugins/select2/select2_conquer.css"
	var="sel2css" />
<link rel="stylesheet" type="text/css" href="${sel2css}" />
<spring:url value="/resources/plugins/fullcalendar/fullcalendar/fullcalendar.css"
	var="calendar_css" />
<link rel="stylesheet" type="text/css" href="${calendar_css}" />



<spring:url value="/resources/plugins/jquery.qtip/jquery.qtip.min.css"
	var="qtip_css" />
<link rel="stylesheet" type="text/css" href="${qtip_css}" />

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
								<spring:message code="title" />
								<small><spring:message code="diary" /></small>
							</h3>
							<ul class="page-breadcrumb breadcrumb">
								<li><i class="fa fa-home"></i> <a
									href="<spring:url value="/" htmlEscape="true "/>"><spring:message
											code="home" /></a> <i class="fa fa-angle-right"></i> <spring:message
										code="pregnants" /> <i class="fa fa-angle-right"></i> <a
									href="#"><spring:message
											code="diary" /></a></li>
							</ul>
							<!-- END PAGE TITLE & BREADCRUMB-->
						</div>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					
					<!-- START ROW -->
					<div class="row">
						<div class="col-md-12">
							<!-- BEGIN TABLE PORTLET-->
							<div class="portlet">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-group"></i>
										<spring:message code="visits" />
									</div>
									<div class="tools">
										<a href="javascript:;" class="collapse"></a> <a
											href="javascript:;" class="remove"></a>
									</div>
								</div>
								<div class="portlet-body">
								 <ul class="nav nav-tabs"> 
									 	<li class="active">
										<a href="#tab_1_1" data-toggle="tab"><spring:message code="calendario" /></a>
										</li>
										<li class="">
											<a href="#tab_1_2" data-toggle="tab"><spring:message code="listado" /></a>
										</li>

								 	
									
								  </ul>
								  <div class="tab-content">
								  
									<div class="tab-pane fade active in"  id="tab_1_1">
										<!-- BEGIN CALENDAR PORTLET-->
											<div class="portlet calendar">
													<div class="portlet-title">
														<div class="caption">
															<i class="fa fa-reorder"></i>
														</div>
													</div>
													<div class="portlet-body light-grey">
														<div class="row">
															<div class="col-md-3 col-sm-12">
																<!-- BEGIN DRAGGABLE EVENTS PORTLET-->
																<h3 class="event-form-title"><spring:message code="filtrar" /></h3>
																<div id="external-events">
																	<form class="inline-form">
																	<!-- UNIDAD DE SALUD  -->
																			<p><spring:message	code="catalogsubjtype" /></p>
																		   <select name="tipo_agenda" id="tipo_agenda"
																			data-placeholder="<spring:message code="select" /> <spring:message code="catalogsubjtype" />"
																			class="form-control">
																			<option value="">Todos</option>
																			<c:forEach items="${tipoAgendas}" var="tipoAgenda">															
																			 <option value="${tipoAgenda.subjectType}">${tipoAgenda.subjectType}</option>
																				
																			</c:forEach>
																		   </select>
																	
																			<br/>
																			
																			<!--TIPO DE AGENDA-->
																			<p><spring:message	code="catalogcenter" /></p>
																		  <select
																			data-placeholder="<spring:message code="select" /> <spring:message code="catalogcenter" />"
																			name="unidadSalud" id="unidadSalud" class="form-control">
																			<option value="">Todos</option>
																			<c:forEach items="${centrosusuario}" var="centro">
																				<c:choose>
																					<c:when test="${centro.pasive=='0'.charAt(0)}">
																						<option value="${centro.userCenterId.center}">${centro.userCenterId.center}</option>
																					</c:when>															
																				</c:choose>
																			</c:forEach>
																		</select>
																		<hr/>
																		<div id="event_box">
																	</div>
																		<a href="<spring:url value="/agenda/newAppointment" htmlEscape="true "/>" class="btn btn-success" id="event_add" >
																		<i class="fa fa-plus"> </i><spring:message code="add" /></a>
																		
																	</form>
																	
																
																	<hr class="visible-xs"/>
																</div>
																<!-- END DRAGGABLE EVENTS PORTLET-->
															</div>
															<div class="col-md-9 col-sm-9">
																<div id="calendar" class="has-toolbar">
																</div>
															</div>
														</div>
														<!-- END CALENDAR PORTLET-->
													</div>
												</div>
										
									</div>
									<div class="tab-pane fade" id="tab_1_2">
								  	
								 <div class="table-toolbar">
									<spring:url value="/agenda/calendar/agenda" var="downloadUrl" />
	
									<div class="btn-group pull-right">
										<a onclick="downloadExcel();"
										class="btn btn-success"  >
											<i class="fa fa-file-excel-o"> </i>  Excel</a>
									<!--  <button type="button" class="btn btn-warning" onclick="downloadExcel();">Excel</button>  -->
									</div>
								</div>
									  <div class="table-responsive">
											<table class="table table-striped table-hover table-bordered"
												id="lista_agenda">
												<thead>
													<tr>												
														<th><spring:message code="catalogsubjtype" /></th>
														<th><spring:message code="subjectId" /></th>
														<th><spring:message code="diary.agreeddate" /></th>
														<th><spring:message code="diary.agreedtime" /></th>
														<th><spring:message code="catalogcenter" /></th>
														<th><spring:message code="provider" /></th>
														<th><spring:message code="speciality" /></th>
														<th><spring:message code="phone_number" /></th>
														<th><spring:message code="asistencia" /></th>
													</tr>
												</thead>
												</tbody>
												</tbody>
										<!-- 	<c:forEach items="${citas}" var="registro">
													<tr>
														<td><c:out value="${registro.subjectType}" /></td>
														<td><c:out value="${registro.recordId}" /></td>
														<td><fmt:formatDate value="${registro.appointmentDateTime}" pattern="dd/MM/yyyy"/></td>
														<td><fmt:formatDate value="${registro.appointmentDateTime}" pattern="hh:mm a"/></td>
														<td><c:out value="${registro.healtUnit}" /></td>
														<td><c:out value="${registro.provider}" /></td>
														<td><c:out value="${registro.specialityType}" /></td>
														<td><c:out value="${registro.phonenumber}" /></td>
														<td><c:out value="${registro.asistio}" /></td>
													</tr>
												</c:forEach> -->	
											</table>
										</div>
									
									</div>
									
								</div>
							</div>
							<!-- END TABLE PORTLET-->
						</div>
					</div>
					<!-- END ROW -->
					<!-- END PAGE CONTENT -->
				</div>
			</div>
								
							
		</div>
		<!-- END CONTENT -->
	</div>
	<!-- END CONTAINER -->
	</div>
	<!-- BEGIN FOOTER -->
	<jsp:include page="../fragments/bodyFooter.jsp" />
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<jsp:include page="../fragments/corePlugins.jsp" />
	<jsp:include page="../fragments/bodyUtils.jsp" />
	
	<!-- BEGIN PAGE LEVEL PLUGINS -->


	<!-- jquery-1.10.2.min -->
	<spring:url value="/resources/plugins/jquery-ui/jquery-ui-1.10.3.custom.js"
		var="jQuery1_10_2" />
	<script type="text/javascript" src="${jQuery1_10_2}"></script>
	<!-- DATA TABLE-->
	<c:choose>
		<c:when test="${cookie.zikaLang.value == null}">
			<c:set var="lenguaje" value="es" />
		</c:when>
		<c:otherwise>
			<c:set var="lenguaje" value="${cookie.zikaLang.value}" />
		</c:otherwise>
	</c:choose>
	<spring:url value="/resources/scripts/diary/process-agenda.js"
		var="agendaScript" />
		<script type="text/javascript" src="${agendaScript}"></script>	
		
	<spring:url value="/resources/plugins/data-tables/jquery.dataTables.js"
		var="jQueryDataTables" />
	<script type="text/javascript" src="${jQueryDataTables}"></script>
	

	<spring:url value="/resources/plugins/data-tables/DT_bootstrap.js"
		var="dataTablesBS" />
	<script type="text/javascript" src="${dataTablesBS}"></script>
	
	<spring:url	value="/resources/plugins/data-tables/TableTools/js/dataTables.tableTools.js"
		var="dataTablesTT" />
	<script type="text/javascript" src="${dataTablesTT}"></script>
	
	<spring:url
		value="/resources/plugins/data-tables/TableTools/swf/copy_csv_xls_pdf.swf"
		var="dataTablesTTSWF" />
	<spring:url
		value="/resources/plugins/data-tables/i18n/label_{language}.json"
		var="dataTablesLang">
		<spring:param name="language" value="${lenguaje}" />
	</spring:url>

	
	<!-- Select 2-->
	<spring:url value="/resources/plugins/select2/select2.min.js"
		var="Select2" />
	<script type="text/javascript" src="${Select2}"></script>
	<spring:url
		value="/resources/plugins/select2/select2_locale_{language}.js"
		var="Select2Loc">
		<spring:param name="language" value="${lenguaje}" />
	</spring:url>
	<script src="${Select2Loc}"></script>

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

	<!-- VALIDATOR-->
	<spring:url
		value="/resources/plugins/jquery-validation/dist/jquery.validate.min.js"
		var="jQValidation" />
	<script type="text/javascript" src="${jQValidation}"></script>
	<spring:url
		value="/resources/plugins/jquery-validation/dist/additional-methods.min.js"
		var="jQValidationAdd" />
	<script type="text/javascript" src="${jQValidationAdd}"></script>
	<spring:url
		value="/resources/plugins/jquery-validation/localization/messages_{language}.js"
		var="jQValidationLoc">
		<spring:param name="language" value="${lenguaje}" />
	</spring:url>
	<script src="${jQValidationLoc}"></script>
		<!-- CALENDAR-->
		<spring:url value="/resources/plugins/fullcalendar/fullcalendar/moment.js"
		var="momentScript" />
	<script src="${momentScript}" type="text/javascript"></script>
		
	<spring:url value="/resources/plugins/fullcalendar/fullcalendar/fullcalendar.min.js"
		var="calendarMinScript" />
	<script src="${calendarMinScript}" type="text/javascript"></script>
	
	<spring:url value="/resources/plugins/fullcalendar/fullcalendar/locale/es.js"
		var="translateScript" />
	<script src="${translateScript}" type="text/javascript"></script>
	
	
	<spring:url value="/resources/scripts/calendar.js"
		var="calendarScript" />
	<script src="${calendarScript}" type="text/javascript"></script>
	<!-- QTIP PLUGIN -->
	<spring:url value="/resources/plugins/jquery.qtip/jquery.qtip.min.js"
		var="qtipScript" />
	<script src="${qtipScript}" type="text/javascript"></script>
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
	<spring:url value="/resources/scripts/utils/handleDatePickers.js"
		var="handleDatePickers" />
	<script src="${handleDatePickers}" type="text/javascript"></script>
	<spring:url value="/resources/scripts/pregnants/process-diary.js"
		var="diaryScript" />
	<script src="${diaryScript}" type="text/javascript"></script>
	
	

	
	<spring:url value="/agenda/" var="diaryUrl" />
	
	<spring:url value="/agenda/calendar" var="eventosUrl" />
	
	<spring:url value="/agenda/saveState" var="saveCitaUrl" />
	
	
	<c:set var="successmessage">
		<spring:message code="process.success" />
	</c:set>
	<c:set var="errormessage">
		<spring:message code="process.errors" />
	</c:set>

	<!-- END PAGE LEVEL SCRIPTS -->
	<script>
    $(function () {
        $("li.pregnants").removeClass("open").addClass("active");
        $("li.diary").removeClass("diary").addClass("active");
    });
</script>
	<script>
	function RenderCalendar(ta,us) {
		
		$('#calendar').fullCalendar({
			locale :'${lenguaje}',				
			header: {
				left: 'prev,next today',
				center: 'title',
				right: 'month,agendaWeek,agendaDay'
			},
			defaultDate: '<fmt:formatDate value="${today}" pattern="yyyy/MM/dd"/>',
			navLinks: true, // can click day/week names to navigate views
			editable: false,
			businessHours: true,
			eventLimit: true, // allow "more" link when too many events
			
			eventSources: [
		        {
		            url: '${eventosUrl}',
		            type: 'POST',
		            dataType: "json",
		            data: {
		                tipoagenda: ta,
		                unidadsalud: us
		            },
		            error: function() {
		                alert('there was an error while fetching events!');
		            },
		         //   color: 'blue',   // a non-ajax option
		            textColor: 'black', // a non-ajax option
		            success: function(data){ 
		              //Mostrar datos obtenidos en la lista
		               $('#lista_agenda').DataTable().fnClearTable();
		         		
		         		$.each(data, function(index, obj) 
		         		{
		         		  var ckname = 'ck'+ obj.id.toString();
		         		  $('#lista_agenda').DataTable().fnAddData([
		         			
		         				obj.id.toString(),
		         				obj.numeroid,
		         				obj.fechacita,
		         				obj.horacita,
		         				obj.unidadsalud,
		         				obj.proveedor,
		         				obj.especialidad,
		         				obj.numerotelefono,
		         			    '<div class="make-switch switch-small"><input type="checkbox" '+(obj.asistio == 'S'?'checked':'')+' data-on-text="<spring:message code="yes"/>"  data-off-text="No"  data-checkbox="'+obj.id.toString()+'" class="alert-status" id = "'+ckname+'" /></div>'   	
		         			]		         						
		         			)	;
		         		  	if(obj.asistio == 'S'){
		         				$('#'+ckname).checked = true;
		         		
		         		  	}
		         		  	else{
		         		  		$('#'+ckname).checked = false; 
		         		  	}
		         	      
		         		 
		         		});
		         		$('.alert-status').bootstrapSwitch('state');


		         		$('.alert-status').on('switchChange.bootstrapSwitch', function (event, state) {												
								
		         		   // Prevenir el cambio de estado
		         		   var switchChange =   $(this);
		         		  // if(state == false){
		         			switchChange.bootstrapSwitch('state', !state, true);
		         		   
		         		   $('body').append('<div class="modal fade" id="confirm-dialog" data-backdrop="static">'
		         				   			+'<div class="modal-dialog modal-small"><div class="modal-content">'
		         				   			+'<div class="modal-header"><h4 class="modal-title"><spring:message	code="confirm"/>'
		         				   			+'</h4></div><div class="modal-body"><p><spring:message	code="confirmQuestion"/></p>'
		         				   			+'</div><div class="modal-footer"><button id="btn-dialog-default"'
		         				   			+'type="button" class="btn btn-default">No</button>'
		         				   			+'<button id="btn-dialog-confirm" type="button" class="btn btn-primary"'
		         				   			+'data-dismiss="modal"><spring:message	code="yes"/></button></div></div></div></div>');
		         	         
		         			  $('#confirm-dialog').modal('show');
		                     

		         			   $('#btn-dialog-confirm').on('click', function () { 
		                           $('#confirm-dialog').modal('hide');
		                           
		                           var parametros = {saveCitaUrl: "${saveCitaUrl}",
		               					successmessage: "${successmessage}",
		               					errormessage: "${errormessage}",
		               					citaid: switchChange.data('checkbox'),
		               					estado: !state,
		               					oSwitch: switchChange
		               					};
		                           
		                           procesarAsistencia.init(parametros);
		               		 
		                          // switchChange.bootstrapSwitch('state', state, true);
		                           $( ".modal fade" ).remove();
		                       });
			
		                       $('#btn-dialog-default').on('click', function () { 
		                           $('#confirm-dialog').modal('hide');
		                           $( ".modal fade" ).remove();
		                       });
		         		 //  }
							
		         		});

		         		
		            }
		        }		       

		    ],       
		    eventRender: function (event, element) {
		        element.qtip({    
		            content: {    
		                title: { text: event.title +' - ' + event.tipoAgenda},
		                text: '<span class="title"><spring:message	code="hora_inicio" />: </span>' + ($.fullCalendar.formatDate(event.start, 'hh:mmtt'))
		                + '<br><span class="title"><spring:message	code="hora_fin" />: </span>' + ($.fullCalendar.formatDate(event.end, 'hh:mmtt'))
		                + '<br><span class="title"><spring:message	code="catalogcenter" />: ' + event.unidadsalud
		                + '<br><span class="title"><spring:message	code="provider" />: ' + event.proveedor      
		                + '<br><span class="title"><spring:message	code="speciality" />: ' + event.especialidad
		            },
		            show: { solo: true },
		            //hide: { when: 'inactive', delay: 3000 }, 
		            style: { 
		                width: 200,
		                padding: 5,
		                color: 'black',
		                textAlign: 'left',
		                border: {
		                width: 1,
		                radius: 3
		             },
		                tip: 'topLeft',

		                classes: { 
		                    tooltip: 'ui-widget', 
		                    tip: 'ui-widget', 
		                    title: 'ui-widget-header', 
		                    content: 'ui-widget-content' 
		                } 
		            } 
		        })
		    }
		});
	}
	
	function downloadExcel(){
		     method =  "POST"; // Set method to post by default if not specified.

		    // The rest of this code assumes you are not using a library.
		    // It can be made less wordy if you use one.
		     var json = JSON.stringify($("#calendar").fullCalendar("clientEvents").map(function(e) {
				    var rv = {};
				    Object.keys(e)
				        .filter(function(k) {
				            return k != "source" && !k.startsWith("_");
				         })
				        .forEach(function(k) {
				            rv[k] = e[k];
				        });
				    return rv;
				}));
		     
		     
			 //  alert(json); 
			//     $.post("${downloadUrl}"
	    	 //       , { sources: json}
	    	            
	    	//			);
			       // Fin post   
			       
		    var form = document.createElement("form");
		    form.setAttribute("method", method);
		    form.setAttribute("action", "${downloadUrl}");
		    var hiddenField = document.createElement("input");
		    hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", "sources");
            hiddenField.setAttribute("value", json);
		    form.appendChild(hiddenField);    
		    document.body.appendChild(form);
		    form.submit();
		   
		    
	}
</script>
	<script>
	jQuery(document).ready(function() {
        console.log("app init");
        App.init();
        //Calendar.init();
        console.log("app fin");
		var parametros = {diaryUrl : "${diaryUrl}",
            dataTablesLang : "${dataTablesLang}"};

        Diary.init(parametros);

        handleDatePickers("${lenguaje}");
        
        
        var select = $('#tipo_agenda').select2();
        
		 select.change( function() { 
			 $('#calendar').fullCalendar('destroy');        	
			  RenderCalendar($(this).val(),$('#unidadSalud').val());
			       });
        var select2 = $('#unidadSalud').select2();
        
        select2.change( function() { 
        	 $('#calendar').fullCalendar('destroy');      
			  RenderCalendar($('#tipo_agenda').val(),$(this).val());
			       });
        
        
     
     
	    $.extend($.fn.dataTable.defaults, {
      	  dom: 'Bfrtip'
      	});
        var table  = $('#lista_agenda').DataTable({
        	"bFilter": false,
        	
        	 "aoColumns": [
       		  { "bVisible": false },
       		  { "bSortable": false },
       		  { "bSortable": false },
       		  { "bSortable": false },
       		  { "bSortable": false },
       		  { "bSortable": false },
       		  { "bSortable": false },
       		  { "bSortable": false },
       		  { "bSortable": false }
       		  ],
            "iDisplayLength": 50,
        	"aaSorting": [[ 0, "asc" ]],
            "oLanguage": {
    			"sUrl": "${dataTablesLang}"
            }
        });
		
        /// Calendario
         RenderCalendar('','')
        
     
        

	});
</script>

	<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>