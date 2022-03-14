<%@ page import="java.util.List" contentType="text/html; charste=UTF-8" %>
<%@ page pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>recommend System</title>
    <link href="/static/css/hotHotel.css" type="text/css" rel="stylesheet"/>
</head>
<body id="body">
<div id="max">
    <div id="top"><b>HotWord Top15</b></div>
    <!-- 置入统计表 -->
    <div id="echarts"></div>
    <c:forEach items="${hotWordList}" var="h">
        <div class="num" hidden>${h.num}</div>
    </c:forEach>
    <c:forEach items="${hotWordList}" var="h">
        <div class="word" hidden>${h.words}</div>
    </c:forEach>
    <a href="${pageContext.request.contextPath}/user/toHotel2"><img src="/static/images/backMain.jpg" id="home"></a>
    <script src="https://cdn.bootcdn.net/ajax/libs/echarts/5.1.2/echarts.min.js"></script>
    <script type="text/javascript">
        window.onload = () => {
            // 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('echarts'));
            var num = document.querySelectorAll(".num")
            let res1 = [];
            num.forEach((item) => {
                res1.push(item.innerHTML)
            })
            var word = document.querySelectorAll(".word")
            let res2 = [];
            word.forEach((item) => {
                res2.push(item.innerHTML)
            })

            // 指定图表的配置项和数据
            var option = {
                title: {
                    text: 'TOP15'/* 图表名称 */
                },
                tooltip: {formatter: '{a}:{c}'},
                legend: {
                    data: ['hotWord']/* 此处为柱状图所代表的含义 */
                },
                xAxis: {
                    data: [...res2]/* 此处填写柱状图横轴上的项*/
                },
                yAxis: {},
                series: [{
                    name: 'hotWord',/* 此处设置对应柱状的值 */
                    type: 'bar',/* 此处设置图的种类 */
                    data: [...res1],/* 此处填写柱状图数据，与横轴一一对应 */


                    itemStyle: {
                        //通常情况下：
                        normal: {
                            //每个柱子的颜色即为colorList数组里的每一项，如果柱子数目多于colorList的长度，则柱子颜色循环使用该数组
                            color: function (params) {
                                var colorList = ['rgb(220,170,230)', 'rgb(200,170,230)', 'rgb(180,170,230)', 'rgb(160,170,230)', 'rgb(140,170,230)', 'rgb(120,170,230)', 'rgb(100,170,230)', 'rgb(80,170,230)', 'rgb(60,170,230)', 'rgb(40,170,230)', 'rgb(40,170,230)', 'rgb(40,170,230)', 'rgb(40,170,230)', 'rgb(40,170,230)', 'rgb(40,170,230)'];
                                return colorList[params.dataIndex];
                            }
                        },
                        //鼠标悬停时：
                        emphasis: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    },


                }]
            };

            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }


    </script>
</div>
</body>
</html>