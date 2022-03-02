<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<!-- Google Fonts and Icons -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../resources/css/bootstrap.css">
</head>
<body>
	<!-- Navbar   nav.fixed-top  -->
	<tiles:insertAttribute name="header"/>
	<!-- end of Navbar -->



	<!-- middle container -->
	<div class="container mt-4">
		<div class="row">

			<!-- Left Menu -->
			<div class="col-sm-3">

				<!-- Vertical Nav -->
				<tiles:insertAttribute name="menu"/>
				<!-- end of Vertical Nav -->
			</div>
			<!-- end of Left Menu -->


			<!-- Right area -->
			<div class="col-sm-9">

				<!-- Contents area -->
				<tiles:insertAttribute name="body"/>
				<!-- end of Contents area -->
			</div>
			<!-- end of Right area -->
		</div>
	</div>
	<!-- end of middle container -->



	<!-- FOOTER -->
	<tiles:insertAttribute name="footer"/>
	<!-- end of FOOTER -->



	<!-- JavaScript -->
	<script src="/resources/js/jquery-3.6.0.js"></script>
	<script src="/resources/js/bootstrap.js"></script>

</body>
</html>