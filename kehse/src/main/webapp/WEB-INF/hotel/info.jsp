<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>hotel_main</title>
    <link href="/static/css/main.css" type="text/css" rel="stylesheet" />
</head>
<body id="body">
<!-- 链接到功能页面 -->
<div id="top"></div><div id="logo"><div id="welcome">Welcome!!!</div></div>
<div id="navigation">
    <div class="link" id="hot" onclick="window.open('${pageContext.request.contextPath}/hotel/commentNum')">
        popular hotels
    </div>
    <div class="link" id="top10" onclick="window.open('${pageContext.request.contextPath}/hotel/grade')">
        nice hotels
    </div>
    <div class="link" id="price" onclick="window.open('${pageContext.request.contextPath}/hotel/price')">
        price range
    </div>
    <div class="link" id="keyword" onclick="window.open('${pageContext.request.contextPath}/hotWord')">
        keyword
    </div>
</div>
<!-- 主页主图 -->
<div id="mainimg"></div>

</body>
</html>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="utf-8">--%>
<%--    <title>hotel_main</title>--%>
<%--    <link href="/static/css/main.css" type="text/css" rel="stylesheet" />--%>
<%--</head>--%>
<%--<body id="body">--%>
<%--<div id="max">--%>
<%--    <div id="top"><b>Welcome!!!</b></div>--%>
<%--    <!-- 链接到功能页面 -->--%>
<%--    <div class="link" id="hot" onclick="window.open('${pageContext.request.contextPath}/hotel/commentNum')">--%>
<%--        Click here to know more about popular hotels--%>
<%--    </div>--%>
<%--    <div class="link" id="top10" onclick="window.open('${pageContext.request.contextPath}/hotel/grade')">--%>
<%--        Click here to know more about nice hotels--%>
<%--    </div>--%>
<%--    <div class="link" id="price" onclick="window.open('${pageContext.request.contextPath}/hotel/price')">--%>
<%--        Click here to know more about price range--%>
<%--    </div>--%>
<%--</div  >--%>

<%--</body>--%>
<%--</html>--%>