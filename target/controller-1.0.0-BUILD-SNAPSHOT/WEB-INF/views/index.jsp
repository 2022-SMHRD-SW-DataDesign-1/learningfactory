<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div>
	<form class="form-horizontal" action="memberInsert.do" method="post">
  <div class="form-group">
    <label class="control-label col-sm-2" for="title">id:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="id" name="id" placeholder="Enter title">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="content">pw:</label>
    <div class="col-sm-10">
    <input type="text" class="form-control" id="pw" name="pw" placeholder="Enter title">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="writer">hp:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="hp" name="hp" placeholder="Enter writer">
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="writer">hp:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="email" name="email" placeholder="Enter writer">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit"  class="btn btn-default">ok</button>
    </div>
  </div>
</form>
	</div>
</body>
</html>
