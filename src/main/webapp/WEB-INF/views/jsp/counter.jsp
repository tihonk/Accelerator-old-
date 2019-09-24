<%--
  Created by IntelliJ IDEA.
  User: t.kasko
  Date: 10.9.19
  Time: 16.25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Chemistry</title>

    <spring:url value="/resources/core/css/counter.css" var="coreCss" />
    <spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
    <link href="${bootstrapCss}" rel="stylesheet" />
    <link href="${coreCss}" rel="stylesheet" />

    <script src="https://www.google.com/jsapi"></script>
    <script>
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Amino acid', 'Percent'],
          ['${number1}',     ${amino1}],
          ['${number2}',     ${amino2}],
          ['${number3}',     ${amino3}],
          ['${number4}',     ${amino4}],
          ['${number5}',     ${amino5}],
          ['${number6}',     ${amino6}],
          ['${number7}',     ${amino7}],
          ['${number8}',     ${amino8}],
          ['${number9}',     ${amino9}],
          ['${number10}',     ${amino10}],
          ['${number11}',     ${amino11}],
          ['${number12}',     ${amino12}],
          ['${number13}',     ${amino13}],
          ['${number14}',     ${amino14}],
          ['${number15}',     ${amino15}],
          ['${number16}',     ${amino16}],
          ['${number17}',     ${amino17}],
          ['${number18}',     ${amino18}],
          ['${number19}',     ${amino19}],
          ['${number20}',     ${amino20}]
        ]);
        var options = {
          title: 'The composition of the amino acid sequence:',
          is3D: true,
          // pieResidueSliceLabel: 'Остальное'
        };
        var chart = new google.visualization.PieChart(document.getElementById('air'));
        chart.draw(data, options);
      }
    </script>
    <script>
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Percent', '${number1}', '${number2}', '${number3}', '${number4}', '${number5}', '${number6}',
            '${number7}', '${number8}', '${number9}', '${number10}', '${number11}', '${number12}', '${number13}',
            '${number14}', '${number15}', '${number16}', '${number17}', '${number18}', '${number19}', '${number20}' ],

          ['Amino Acid', ${amino1}, ${amino2}, ${amino3}, ${amino4},${amino5}, ${amino6}, ${amino7},${amino8},
            ${amino9}, ${amino10}, ${amino11}, ${amino12},${amino13}, ${amino14}, ${amino15},${amino16},
            ${amino17}, ${amino18}, ${amino19}, ${amino20}]
        ]);
        var options = {
          title: 'Bar graph in descending order',
          // vAxis: {title: ' '}
        };
        var chart = new google.visualization.ColumnChart(document.getElementById('oil'));
        chart.draw(data, options);
      }
    </script>
</head>
<body>
<%--<%--%>
<%--    //allow access only if session exists--%>
<%--    String user = null;--%>
<%--    if(session.getAttribute("user") == null){--%>
<%--        response.sendRedirect("../login");--%>
<%--    }else user = (String) session.getAttribute("user");--%>
<%--    String userName = null;--%>
<%--    String sessionID = null;--%>
<%--    Cookie[] cookies = request.getCookies();--%>
<%--    if(cookies !=null){--%>
<%--        for(Cookie cookie : cookies){--%>
<%--            if(cookie.getName().equals("user")) userName = cookie.getValue();--%>
<%--            if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>


<%--<div class="jumbotron">--%>
<%--    <div class="container">--%>

<%--        <form action="LogoutServlet" method="post">--%>
<%--            <input type="submit" value="Logout" >--%>
<%--        </form>--%>

<%--    </div>--%>
<%--</div>--%>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <ul class="menu">
                <a class="navbar-brand" href="/">Accelerator</a>
                <li><a href=#>My cabinet</a>
                    <ul class="submenu">
                        <li><a href=#>My account</a></li>
                        <li><a href=#>My history</a></li>
                        <c:if test="${not empty name}">
                            <li><a href=#>Sign out</a></li>
                        </c:if>
                        <c:if test="${empty name}">
                            <li><a href=#>Sign in</a></li>
                        </c:if>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="jumbotron">
    <div class="container">
        <p>Enter the amino acid sequence:</p>
        <form method="post">
            <label>
                <textarea name="text"  rows="12" placeholder="Example: AMFCFQCQETAKNMFCFQCQETAKNTGCTVKGMCGKPEETANLQDLLIFVLRGIAI...."></textarea>
            </label>
            <input type="hidden" name="_csrf" value="{{_csrf.token}}" />
            <p><button type="submit">Get result</button> <button type="reset">Clean out</button>
        </form>
    </div>
</div>

<div class="container">
    <div class="row">
        <c:if test="${not empty number1}">
        <div class="col-md-4">
            <table>
                <tr><th>Amino Acid</th><th>Percent</th><th>Amount</th></tr>
                <tr class="number1"><td>${number1}</td><td><fmt:formatNumber value="${amino1}" maxFractionDigits="4"/></td><td>${quantity1}</td></tr>
                <tr class="number2"><td>${number2}</td><td><fmt:formatNumber value="${amino2}" maxFractionDigits="4"/></td><td>${quantity2}</td></tr>
                <tr class="number3"><td>${number3}</td><td><fmt:formatNumber value="${amino3}" maxFractionDigits="4"/></td><td>${quantity3}</td></tr>
                <tr class="number4"><td>${number4}</td><td><fmt:formatNumber value="${amino4}" maxFractionDigits="4"/></td><td>${quantity4}</td></tr>
                <tr class="number5"><td>${number5}</td><td><fmt:formatNumber value="${amino5}" maxFractionDigits="4"/></td><td>${quantity5}</td></tr>
                <tr class="number6"><td>${number6}</td><td><fmt:formatNumber value="${amino6}" maxFractionDigits="4"/></td><td>${quantity6}</td></tr>
                <tr class="number7"><td>${number7}</td><td><fmt:formatNumber value="${amino7}" maxFractionDigits="4"/></td><td>${quantity7}</td></tr>
                <tr class="number8"><td>${number8}</td><td><fmt:formatNumber value="${amino8}" maxFractionDigits="4"/></td><td>${quantity8}</td></tr>
                <tr class="number9"><td>${number9}</td><td><fmt:formatNumber value="${amino9}" maxFractionDigits="4"/></td><td>${quantity9}</td></tr>
                <tr class="number10"><td>${number10}</td><td><fmt:formatNumber value="${amino10}" maxFractionDigits="4"/></td><td>${quantity10}</td></tr>
                <tr class="number11"><td>${number11}</td><td><fmt:formatNumber value="${amino11}" maxFractionDigits="4"/></td><td>${quantity11}</td></tr>
                <tr class="number12"><td>${number12}</td><td><fmt:formatNumber value="${amino12}" maxFractionDigits="4"/></td><td>${quantity12}</td></tr>
                <tr class="number13"><td>${number13}</td><td><fmt:formatNumber value="${amino13}" maxFractionDigits="4"/></td><td>${quantity13}</td></tr>
                <tr class="number14"><td>${number14}</td><td><fmt:formatNumber value="${amino14}" maxFractionDigits="4"/></td><td>${quantity14}</td></tr>
                <tr class="number15"><td>${number15}</td><td><fmt:formatNumber value="${amino15}" maxFractionDigits="4"/></td><td>${quantity15}</td></tr>
                <tr class="number16"><td>${number16}</td><td><fmt:formatNumber value="${amino16}" maxFractionDigits="4"/></td><td>${quantity16}</td></tr>
                <tr class="number17"><td>${number17}</td><td><fmt:formatNumber value="${amino17}" maxFractionDigits="4"/></td><td>${quantity17}</td></tr>
                <tr class="number18"><td>${number18}</td><td><fmt:formatNumber value="${amino18}" maxFractionDigits="4"/></td><td>${quantity18}</td></tr>
                <tr class="number19"><td>${number19}</td><td><fmt:formatNumber value="${amino19}" maxFractionDigits="4"/></td><td>${quantity19}</td></tr>
                <tr class="number20"><td>${number20}</td><td><fmt:formatNumber value="${amino20}" maxFractionDigits="4"/></td><td>${quantity20}</td></tr>
            </table>
        </div>
        <div class="col-md-4 round">
            <div id="air" style="width: 120%; height: 360px;"></div>
        </div>
        <div class="col-md-4 gistogramm">
            <div id="oil" style="width: 500px; height: 360px;"></div>
        </div>
        </c:if>
    </div>
</div>


<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>