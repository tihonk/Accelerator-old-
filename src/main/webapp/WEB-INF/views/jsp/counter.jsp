<%--
  Created by IntelliJ IDEA.
  User: t.kasko
  Date: 10.9.19
  Time: 16.25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
          ['Glycine',     ${gly}],
          ['Alanine',     ${ala}],
          ['Valine',     ${val}],
          ['Leucine',     ${leu}],
          ['Isoleucine',     ${ile}],
          ['Serine',     ${ser}],
          ['Threonine',     ${thr}],
          ['Aspartic Acid',     ${asp}],
          ['Glutamic Acid',     ${glu}],
          ['Asparagine',     ${asn}],
          ['Glutamine',     ${gln}],
          ['Lysine',     ${lys}],
          ['Arginine',     ${arg}],
          ['Cysteine',     ${cys}],
          ['Methionine',     ${met}],
          ['Phenylalanine',     ${phe}],
          ['Tyrosine',     ${tyr}],
          ['Tryptophan',     ${trp}],
          ['Histidine',     ${his}],
          ['Proline',     ${pro}]
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
          ['Год', '1', '2', '3'],
          ['1860', Integer.parseInt(${gly}), Integer.parseInt(${ala}), Integer.parseInt(${val})]

          // ['Percent', '1', '2', '3', '4', '5', '6', '7', '8', '9', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20'],
          <%--['www',     undefined${gly}, undefined${ala}, undefined${val}, undefined${leu}, ${ile} undefined${ser}, undefined${thr}, undefined${asp}, undefined${glu}, undefined${asn}, undefined${gln}, undefined${lys}, undefined${lys}, undefined${arg}, undefined${cys}, undefined${met}, undefined${phe}, undefined${tyr}, undefined${trp}, undefined${his}, ${pro}]--%>
        ]);
        var options = {
          title: 'Bar graph in descending order',
          hAxis: {title: 'Amino acid'}
        };
        var chart = new google.visualization.ColumnChart(document.getElementById('oil'));
        chart.draw(data, options);
      }
    </script>
</head>
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
                <textarea name="text"  rows="12" placeholder="Enter the data"></textarea>
            </label>
            <input type="hidden" name="_csrf" value="{{_csrf.token}}" />
            <p><button type="submit">Get result</button> <button type="reset">Clean out</button>
        </form>
    </div>
</div>

<div class="container">
    <div class="row">
        <div class="col-md-4">
<%--           <div id="air" style="width: 500px; height: 300px;"></div>--%>
        </div>
        <div class="col-md-4">
<%--            <div id="oil" style="width: 500px; height: 300px;"></div>--%>
    <div id="air" style="width: 500px; height: 300px;"></div>
        </div>
    </div>
</div>


<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>