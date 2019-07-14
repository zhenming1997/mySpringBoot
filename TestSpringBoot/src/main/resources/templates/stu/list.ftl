<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	欢迎 ${username}
	<#if (age<= 18)>-小朋友
	<#elseif (age>30)>-大叔
	<#else>帅哥/美女
	</#if>
	登陆 <br />
	学生列表:<br />
	<table border="1">
		<tr>
			<td>ID</td>
			<td>姓名</td>
			<td>性别</td>
		</tr>
		<#list stuList?sort_by("id") as stu>
		<tr>
			<td>${stu.id}</td>
			<td>${stu.name}</td>
			<td>${stu.age}</td>
		</tr>
		</#list>
	<table>
</body>
</html>