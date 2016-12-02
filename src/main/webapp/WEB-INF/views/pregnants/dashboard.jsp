<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!--[if IE 8]> <html class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html>
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<jsp:include page="../fragments/headTag.jsp" />
<!-- BEGIN PAGE LEVEL STYLES -->
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
					<spring:message code="title" /> <small><spring:message code="pregnants" /> - <spring:message code="pregnantsdash" /></small>
					</h3>
					<ul class="page-breadcrumb breadcrumb">
						<li>
							<i class="fa fa-home"></i>
							<a href="<spring:url value="/" htmlEscape="true "/>"><spring:message code="home" /></a>
							<i class="fa fa-angle-right"></i> <spring:message code="pregnants" />
                            <i class="fa fa-angle-right"></i> <a href="<spring:url value="/pregnants/dashboard" htmlEscape="true "/>"><spring:message code="pregnantsdash" /></a>
						</li>
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
                                <i class="fa fa-group"></i><spring:message code="subjects" />
                            </div>
                            <div class="tools">
                                <a href="javascript:;" class="collapse"></a>
                                <a href="javascript:;" class="remove"></a>
                            </div>
                        </div>
                        <div class="portlet-body">
                            <div class="table-toolbar2">
                                <div class="btn-group">
                                </div>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-hover table-bordered" id="lista_registros">
                                    <thead>
                                    <tr>
                                        <th><spring:message code="subjectId" /></th>
                                        <th><spring:message code="diary.registerdate" /></th>
                                        <th><spring:message code="entry" /></th>
                                        <th><spring:message code="week2" /></th>
                                        <th><spring:message code="week4" /></th>
                                        <th><spring:message code="week6" /></th>
                                        <th><spring:message code="week8" /></th>
                                        <th><spring:message code="week10" /></th>
                                        <th><spring:message code="week12" /></th>
                                        <th><spring:message code="week14" /></th>
                                        <th><spring:message code="week16" /></th>
                                        <th><spring:message code="week18" /></th>
                                        <th><spring:message code="week20" /></th>
                                        <th><spring:message code="week22" /></th>
                                        <th><spring:message code="week24" /></th>
                                        <th><spring:message code="week26" /></th>
                                        <th><spring:message code="week28" /></th>
                                        <th><spring:message code="week30" /></th>
                                        <th><spring:message code="week32" /></th>
                                        <th><spring:message code="week34" /></th>
                                        <th><spring:message code="week36" /></th>
                                        <th><spring:message code="week38" /></th>
                                        <th><spring:message code="week40" /></th>
                                        <th><spring:message code="week42" /></th>
                                        <th><spring:message code="week44" /></th>
                                        <th><spring:message code="delivery" /></th>
                                        <th><spring:message code="postdeli" /></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${registros}" var="registro">
                                        <tr>
                                            <td><c:out value="${registro.codigo}" /></td>
                                            <td><c:out value="${registro.fechaIngreso}" /></td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.ingreso}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.ingreso}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana2}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px" alt="${registro.semana2}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana4}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px" alt="${registro.semana4}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana6}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana6}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana8}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana8}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana10}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana10}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana12}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana12}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana14}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana14}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana16}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana16}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana18}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana18}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana20}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana20}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana22}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana22}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana24}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana24}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana26}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana26}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana28}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana28}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana30}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana30}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana32}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana32}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana34}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana34}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana36}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana36}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana38}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana38}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana40}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana40}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana42}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana42}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.semana44}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.semana44}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.parto}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.parto}" />
                                            </td>
                                            <td align="center">
                                                <spring:url value="/resources/img/{imagen}.png" var="imgestado">
                                                    <spring:param name="imagen" value="${registro.posparto}" />
                                                </spring:url>
                                                <img src="${imgestado}" width="16px" height="16px"  alt="${registro.posparto}" />
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
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
<!-- BEGIN FOOTER -->
<jsp:include page="../fragments/bodyFooter.jsp" />
<!-- END FOOTER -->
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<jsp:include page="../fragments/corePlugins.jsp" />
<jsp:include page="../fragments/bodyUtils.jsp" />
<!-- BEGIN PAGE LEVEL PLUGINS -->
<c:choose>
	<c:when test="${cookie.zikaLang.value == null}">
		<c:set var="lenguaje" value="es"/>
	</c:when>
	<c:otherwise>
		<c:set var="lenguaje" value="${cookie.zikaLang.value}"/>
	</c:otherwise>
</c:choose>

<!-- DATA TABLE-->
<spring:url value="/resources/plugins/data-tables/jquery.dataTables.js" var="jQueryDataTables" />
<script type="text/javascript" src="${jQueryDataTables}"></script>
<spring:url value="/resources/plugins/data-tables/DT_bootstrap.js" var="dataTablesBS" />
<script type="text/javascript" src="${dataTablesBS}"></script>
<spring:url value="/resources/plugins/data-tables/TableTools/js/dataTables.tableTools.js" var="dataTablesTT" />
<script type="text/javascript" src="${dataTablesTT}"></script>
<spring:url value="/resources/plugins/data-tables/TableTools/swf/copy_csv_xls_pdf.swf" var="dataTablesTTSWF" />
<spring:url value="/resources/plugins/data-tables/i18n/label_{language}.json" var="dataTablesLang">
    <spring:param name="language" value="${lenguaje}" />
</spring:url>
<spring:url value="/resources/plugins/select2/select2.min.js" var="Select2" />
<script type="text/javascript" src="${Select2}"></script>
<spring:url value="/resources/plugins/jquery-multi-select/js/jquery.multi-select.js" var="jQueryMultiSelect" />
<script type="text/javascript" src="${jQueryMultiSelect}"></script>
<spring:url value="/resources/plugins/jquery-validation/dist/jquery.validate.min.js" var="jQValidation" />
<script type="text/javascript" src="${jQValidation}"></script>
<spring:url value="/resources/plugins/jquery-validation/dist/additional-methods.min.js" var="jQValidationAdd" />
<script type="text/javascript" src="${jQValidationAdd}"></script>
<!-- jQuery Password Meter-->
<spring:url value="/resources/plugins/jquery.pwstrength.bootstrap/src/pwstrength.js" var="pwStrength" />
<script src="${pwStrength}" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<spring:url value="/resources/scripts/app.js" var="App" />
<script src="${App}" type="text/javascript"></script>
<spring:url value="/resources/scripts/pregnants/process-dashboard.js" var="dashboardScript" />
<script src="${dashboardScript}" type="text/javascript"></script>
<spring:url value="/resources/plugins/jquery-validation/localization/messages_{language}.js" var="jQValidationLoc">
	<spring:param name="language" value="${lenguaje}" />
</spring:url>				
<script src="${jQValidationLoc}"></script>
<spring:url value="/resources/plugins/select2/select2_locale_{language}.js" var="Select2Loc">
	<spring:param name="language" value="${lenguaje}" />
</spring:url>				
<script src="${Select2Loc}"></script>
<spring:url value="/users/saveUser" var="saveUserUrl"/>
<!-- END PAGE LEVEL SCRIPTS -->
<script>
    $(function () {
    	$("li.start").addClass("active");
    });
</script>
<script>
	jQuery(document).ready(function() {
		App.init();
		$('#username').prop('readonly', true);
		$('#completeName').focus();
		var parametros = {dataTablesLang : "${dataTablesLang}"
		};
		Dashboard.init(parametros);
	});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>