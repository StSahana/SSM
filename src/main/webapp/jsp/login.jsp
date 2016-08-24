<%@page import="com.sun.xml.internal.rngom.ast.builder.Include"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户登录</title>
    <%@include file="head.jsp" %>
    
   <!--  
    <script  type="text/javascript" src="<%=path%>/js/login.js"></script>
    -->
    <style type="text/css">
      #center {
          margin-top: 10%;
      }
      body{
      	background-color:#ccc;
      }
    </style>
  </head>
  <body>
  <div class="container col-sm-2 col-sm-offset-5" id="center">
		<form role="form"  action="authentication" method="POST">
			<div class="form-group text-center">
				<h3 class="text-info text-sm">登录</h3>
			</div>
			<div class="form-group">
				<input type="text" name="userId" class="form-control" placeholder="账号" autofocus />
			</div>
			<div class="form-group ">
				<input type="password" name="password" class="form-control" placeholder="密码"/>
			</div>
			<div class="form-group">
				<button class="btn btn-lg btn-block" type="submit">登录</button>
			</div>
			<div class="form-group">
				<p class="text-danger">${message}</p>
			</div>
		</form>
	</div>
  
  <%@include file="footer.jsp" %>
  </body>
</html>
