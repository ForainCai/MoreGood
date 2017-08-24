
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.Enumeration"%>
<%@page pageEncoding="UTF-8"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
 <%--
 String s1 = request.getParameter("s");
 String rdname = request.getParameter("rdName");
 String phname = request.getParameter("phName");
 --%>
 <%--
 	String current_param = "";
 	String current_vaul = "";
 	Enumeration params = request.getParameterNames();
 	while(params.hasMoreElements()){
 		current_param = (String)params.nextElement();
 		current_vaul = request.getParameter(current_param);
 		--%><%--=current_param --%> <%--=current_vaul --%>
 	<%-- }--%>

<!-- 用户名：<input type="text" id="username"><br/>
 密码：<input type="password" id="password"><br/><br/>
 <button type="button">login</button> -->
 <%
 	double s3 = (double)request.getAttribute("s3");
 %>
 <%=s3 %>
 客户端协议名和版本号：
 客户机名：<%= request.getRemoteHost() %>
 客户机的IP地址：<%= request.getRemoteAddr() %>
 
</body>
</html>