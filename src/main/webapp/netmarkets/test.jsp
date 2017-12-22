<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="/jerseyPro/js/jquery-1.9.1.min.js"></script>
</head>
<body>
	<button type="button" id="ww">post</button>
	<script type="text/javascript">
	$("#ww").click(function(){
		$.ajax({
	   	    type : "post",
	   		url : "/jerseyPro/rest/books/test",
	   		async : true,
	   		success : function(data) {
		    	alert(data.type);
	   		}
	   	});
	});
	</script>
</body>
</html>