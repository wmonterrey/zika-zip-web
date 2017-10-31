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
<jsp:include page="../../fragments/headTag.jsp" />
<!-- BEGIN PAGE LEVEL STYLES -->
<spring:url value="/resources/plugins/select2/select2_conquer.css"
	var="sel2css" />
<link rel="stylesheet" type="text/css" href="${sel2css}" />
<spring:url
	value="/resources/plugins/jquery-multi-select/css/multi-select.css"
	var="jqmscss" />
<link rel="stylesheet" type="text/css" href="${jqmscss}" />
<!-- END PAGE LEVEL STYLES -->
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-sidebar-fixed page-footer-fixed">
	<!-- BEGIN HEADER -->
	<jsp:include page="../../fragments/bodyHeader.jsp" />
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<jsp:include page="../../fragments/bodyNavigation.jsp" />
		<!-- BEGIN CONTENT -->
		<spring:url value="/catalog/editcenter/{centername}" var="editUrl">
			<spring:param name="centername" value="${centro.cs}" />
		</spring:url>
		<div class="page-content-wrapper">
			<div class="page-content-wrapper">
				<div class="page-content">
					<!-- BEGIN STYLE CUSTOMIZER -->
					<jsp:include page="../../fragments/bodyCustomizer.jsp" />
					<!-- BEGIN PAGE HEADER-->
					<div class="row">
						<div class="col-md-12">
							<!-- BEGIN PAGE TITLE & BREADCRUMB-->
							<h3 class="page-title">
								<spring:message code="catalogcenter" />
							</h3>
							<ul class="page-breadcrumb breadcrumb">
								<li><i class="fa fa-home"></i> <a
									href="<spring:url value="/" htmlEscape="true "/>"><spring:message
											code="home" /></a> <i class="fa fa-angle-right"></i> <a
									href="<spring:url value="/catalog/centers/" htmlEscape="true "/>"><spring:message
											code="centers" /></a>
									<i class="fa fa-angle-right"></i>
									<a
									href="<spring:url value="#" htmlEscape="true "/>">${centro.cs}
									</a>
											
											</li>
							</ul>
							<!-- END PAGE TITLE & BREADCRUMB-->
						</div>
					</div>
					<!-- END PAGE HEADER-->
					<!-- BEGIN PAGE CONTENT-->
					<spring:url value="/catalog/centers/" var="centerUrl"></spring:url>

					<div class="row">
						<div class="col-md-12">
							<div class="portlet">
								<div class="portlet-title">
									<div class="caption">
										<i class="fa fa-building"></i>
									</div>
									<div class="tools">
										<a href="javascript:;" class="collapse"></a> <a
											href="javascript:;" class="remove"></a>
									</div>
								</div>
								<div class="portlet-body form">
									<div class="table-toolbar">
										<div class="btn-group">
											<button class="btn btn-info dropdown-toggle"
												data-toggle="dropdown">
												<spring:message code="actions" />
												<i class="fa fa-angle-down"></i>
											</button>
											<ul class="dropdown-menu pull-right">
												<li><a href="${fn:escapeXml(editUrl)}"><i
														class="fa fa-edit"></i> <spring:message 
														code="edit" /></a></li>
																					
												
											</ul>
										</div>										
									</div>
									<form class="form-horizontal">
										<div class="form-body">
											<h3 class="form-section">
												<c:out value="${centro.cs}" />
											</h3>
											
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
	<jsp:include page="../../fragments/bodyFooter.jsp" />
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<jsp:include page="../../fragments/corePlugins.jsp" />
	<jsp:include page="../../fragments/bodyUtils.jsp" />
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<c:choose>
		<c:when test="${cookie.invLang.value == null}">
			<c:set var="lenguaje" value="es" />
		</c:when>
		<c:otherwise>
			<c:set var="lenguaje" value="${cookie.invLang.value}" />
		</c:otherwise>
	</c:choose>
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
	<spring:url value="/resources/scripts/app.js" var="App" />
	<script src="${App}" type="text/javascript"></script>
	<spring:url value="/resources/scripts/catalog/process-center.js"
		var="centerScript" />
	<script src="${centerScript}" type="text/javascript"></script>
	<spring:url
		value="/resources/plugins/jquery-validation/localization/messages_{language}.js"
		var="jQValidationLoc">
		<spring:param name="language" value="${lenguaje}" />
	</spring:url>
	<script src="${jQValidationLoc}" /></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<spring:url value="/catalog/saveCenter" var="saveCenterUrl" />
	<c:set var="successmessage">
		<spring:message code="process.success" />
	</c:set>
	<c:set var="errormessage">
		<spring:message code="process.errors" />
	</c:set>
	<script>
    $(function () {
    	$("li.catalog").removeClass("catalog").addClass("active");
        $("li.catalogcenter").removeClass("catalogcenter").addClass("active");
    });
</script>
	<script>
	jQuery(document).ready(function() {
		App.init();
		var parametros = {saveCenterUrl: "${saveCenterUrl}",
				centerUrl: "${centerUrl}",
				successmessage: "${successmessage}",
				errormessage: "${errormessage}"};
		//CreateCenter.init(parametros);
		//$('#centerName').focus();
	});	
</script>
	<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>