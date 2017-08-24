<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function msg(){
		alert("用户名或密码错误！");
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%!String name = "jack"; %>
	<%!String pwd = "123"; %>
	<%
		String s1 = request.getParameter("user");
		String s2 = request.getParameter("pwd");
		if(s1.equals(name)&&s2.equals(pwd)){%>
		<%request.setCharacterEncoding("utf-8"); %>
			<jsp:forward page="sum.jsp">
				<jsp:param value="登陆成功" name="loginsuccess"/>
			</jsp:forward>
	<%	}else{%>
		<%
			response.sendRedirect("login.jsp");
			
		%>
		<%}
	%>
</body>
</html>