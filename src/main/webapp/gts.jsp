<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<title>test 测试</title>
</head>
<body>
测试的jsp  页面展示
<br>
测试的value值
${nam}

<input type="button" value="点击" onclick="g()">
<script type="text/javascript">
function g(){
	alert("弹出");
	$.ajax({
		url:"srget",
		method:"post",
		data:{"name":"zhu"}
	});
}
</script>
</body>
</html>