<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--!String s = new String("以直角三角形的形式显示数字");--%>
	<%--=s--%>
	<%--
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				out.print(j);
			}--%>
			</br>
		<%-- }--%>
	<%--
		Random r = new Random();
			int cmd = r.nextInt(3)+1;
			switch (cmd) {
			case 1:
				out.print("good morning");
				break;
			case 2:
				out.print("good afternoon");
				break;
			case 3:
				out.print("good night");
				break;
			default:
				return;
			}
		Date date = new Date();
	--%>
	<%--=date --%></br>
	<form action="sum.jsp" method="post">
		<input type="text" name="rdName"></br>
		<input type="text" name="phName">
		<input type="submit" value="提交">
	</form>
</body>
</html>