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
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body>
    <!-- Navbar -->
    <tiles:insertAttribute name="header"/>
    <!-- end of Navbar -->



    <!-- Carousel -->
    <tiles:insertAttribute name="body"/>
    <!-- end of Jumbotron -->


    
    <!-- FOOTER -->
    <tiles:insertAttribute name="footer"/>
    <!-- end of FOOTER -->


    
    <!-- JavaScript -->
    <script src="/resources/js/jquery-3.6.0.js"></script>
    <script src="/resources/js/bootstrap.js"></script>

</body>
</html>