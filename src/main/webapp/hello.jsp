<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello 朱焕雄
<br>
${name }
<script type="text/javascript">
var d=["on","tew","oa"];
for(var i=0;i<d.length;i++){
	alert(d[i]+" ");
}
</script>
<br>
<a href="https://open.weixin.qq.com/connect/oauth2/authorize?appid=appid&redirect_uri=http://127.0.0.0.1:8001/maprod&response_type=code&scope=snsapi_userinfo&state=1#wechat_redirect">微信登录</a><br>
<a href="https://open.weixin.qq.com/connect/qrconnect?appid=wxbdc5610cc59c1631&redirect_uri=http%3A%2F%2Fwww.baidu.com&response_type=code&scope=snsapi_login&state=2014#wechat_redirect">微信登录</a><br>

<a href="https://open.weixin.qq.com/connect/qrconnect?appid=wxbdc5610cc59c1631&redirect_uri=https%3A%2F%2Fpassport.yhd.com%2Fwechat%2Fcallback.do&response_type=code&scope=snsapi_login&state=3d6be0a4035d839573b04816624a415e#wechat_redirect">test</a>
</body>
</html>