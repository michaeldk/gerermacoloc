<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<meta name="description" content=""/>
		<meta name="author" content=""/>
		<link rel="shortcut icon" href="resources/img/favicon.ico"/>

		<title>Gérer Ma Coloc - Vue d'ensemble</title>

		<!-- Bootstrap core CSS -->
		<link href="resources/css/bootstrap.min.css" rel="stylesheet"/>

		<!-- Custom styles for this template -->
		<link href="resources/css/dashboard.css" rel="stylesheet"/>

		<!-- Just for debugging purposes. Don't actually copy this line! -->
		<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		<![endif]-->
		
		<script src="resources/js/jquery.min.js"></script>
	    <script src="resources/js/bootstrap.min.js"></script>
	    <script src="resources/js/docs.min.js"></script>
	</head>
	<body>
		<tiles:insertAttribute name="header"/>
	    <div class="container-fluid">
	    	<div class="row">
	    		<tiles:insertAttribute name="sidebar"/>
	    		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
	    			<tiles:insertAttribute name="body"/>
	    		</div>
			</div>
	    </div>
	</body>
</html>