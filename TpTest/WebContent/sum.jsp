<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		String str1 = request.getParameter("rdName");
		String str2 = request.getParameter("phName");
		double s1 = Double.parseDouble(str1);
		double s2 = Double.parseDouble(str2);
		double s3 = s1+s2;
		request.setAttribute("s1", s1);
		request.setAttribute("s2", s2);
		request.setAttribute("s3", s3);
	--%>
	<%String s = request.getParameter("loginsuccess"); %>
	<%=s %>
</body>
</html>