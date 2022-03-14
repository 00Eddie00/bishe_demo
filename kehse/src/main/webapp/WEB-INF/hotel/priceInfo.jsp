<%@ page import="java.util.List" contentType="text/html; charste=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <!-- title 记得起名 -->
    <title></title>
    <link href="/static/css/hotHotel.css" type="text/css" rel="stylesheet"/>
    <script src="https://cdn.bootcdn.net/ajax/libs/echarts/5.1.2/echarts.min.js"></script>
</head>
<body id="body">
<div id="max">
    <div id="top"><b>price</b></div>
    <!-- 置入统计表 -->
    <div id="echarts"></div>
    <c:forEach items="${hotelListByPrice}" var="h">
    <div class="data" hidden>${h}</div>
    </c:forEach>

    <a href="${pageContext.request.contextPath}/user/toHotel2"><img src="/static/images/backMain.jpg" id="home"></a>


    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('echarts'));
        var option;
        var datas = document.querySelectorAll(".data")
        let res = [];
        datas.forEach((item) => {
            res.push(item.innerHTML)
        })
        option = {
            title: {
                text: 'price',
                left: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: '{a}:{c}(s)'
            },
            legend: {
                orient: 'vertical',
                left: 'left',
            },
            series: [
                {
                    name: 'price',
                    type: 'pie',
                    radius: '50%',
                    data: [
                        {value: res[0], name: 'more than 600'},
                        {value: res[1], name: '450~600'},
                        {value: res[2], name: '300~450'},
                        {value: res[3], name: '150~300'},
                        {value: res[4], name: 'lower than 150'}
                    ],
                    emphasis: {
                        itemStyle: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    },
                }
            ]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>