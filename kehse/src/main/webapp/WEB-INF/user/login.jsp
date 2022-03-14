<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>hotel_login</title>
    <link href="/static/css/login.css" type="text/css" rel="stylesheet" />
</head>
<body id="body">
<div id="max">
    <div id="top"></div>
    <div id="login">
        <!-- 填写数据源plz -->
        <form action="${pageContext.request.contextPath}/user/login" method="POST">
            name:<input type="text" width="200px" name="username"/>
            </br>
            password:<input type="password" width="200px" name="password"/>
            </br>
            <input style="width:60px;height:30px"   type="submit" value="login"/>
        </form>
    </div>

</div  >

</body>
</html>