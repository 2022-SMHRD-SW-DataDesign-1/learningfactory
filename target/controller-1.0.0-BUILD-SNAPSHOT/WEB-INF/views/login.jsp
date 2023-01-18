<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapc
</head>
<body>
	<div>
	<form class="form-horizontal" action="login.do" method="get">
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
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit"  class="btn btn-default">로그인</button>
    </div>
  </div>
	</form>
	</div>

</body>
</html>