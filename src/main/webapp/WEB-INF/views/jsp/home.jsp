<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Chemistry</title>
 
<spring:url value="/resources/core/css/home.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>
 
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
	<h1>${title}</h1>
	<p class="buttons">
		<c:if test="${not empty name}">
			Hello ${name}
		</c:if>
 
		<c:if test="${empty name}">
			Log in or register to get started!
            <p class="buttons">
                <a class="btn btn-info btn-lg signin" href="registration" role="button">Sign in</a>
                <a class="btn btn-info btn-lg signup" href="registration" role="button">Sign up</a>
            </p>
		</c:if>
    </p>
	</div>
</div>
 
<div class="container">
 
  <div class="row">
	<div class="col-md-4">
		<h2>Accelerator</h2>
		<p>
           Increases the speed of processing PDB files.
           It computes the length between the desired ligand and the nearest atom. 
           As a result, we have a list of binding sites and long links.
        </p>
		<p>
			<a class="btn btn-default" href="#" role="button">Accelerate up</a>
		</p>
	</div>
    <div class="col-md-4">
        <h2>Counter</h2>
        <p>
            Calculates the content of all amino acids in the
            amino acid sequence of the introduced protein.
            The prevailing amino acid is determined.
            The result is displayed in the form of a diagram.</p>
        <p>
            <a class="btn btn-default" href="#" role="button">Count up</a>
        </p>
    </div>
	<div class="col-md-4">
		<h2>Analyzer</h2>
		<p>
            Analyzes the entered amino acid sequence.
            Calculates the fidelity of the bonds of the selected
            ligand with the given protein.
            Indicates hypothetical binding sites and their amino acid composition.</p>
		<p>
			<a class="btn btn-default" href="#" role="button">To analyze</a>
		</p>
	</div>
  </div>
 
 
  <hr>
  <footer>
      <p>&#9400; &#9413; Product created by @ Khrustalev & Kasko, 2019</p>
  </footer>
</div>
 
<spring:url value="/resources/core/css/hello.js" var="coreJs" />
<spring:url value="/resources/core/css/bootstrap.min.js" var="bootstrapJs" />
 
<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>