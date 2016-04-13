<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	/demo2/WebRoot/js/jquery.js-->
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery.json.js"></script>
	<script type="text/javascript">
		 var list = new Array();
		 var str="["
		$(function(){
			$("input:checkbox[id=select]:checked").each(function(i){
         	  	//获取选择框的父标签的父标签 
         	  	var td= $(this).parent().parent();
         	  	//获取td的指定ID的兄弟标签的值（此处为ID为ID的兄弟标签的值）
         	  	var ids=td.siblings("#id").text();
         	  	var names=td.siblings("#name").text();
         	  	var pwds=td.siblings("#pwd").text();
         	  	 list.push({id: ids, name:names, pwd: pwds});
         	  	 str+="{\"id\":\""+ids+"\",\"name\":\""+names+"\",\"pwds\":\""+"pwds"+"\"},"
        	 });
				 str=str.substring(0,str.length-1);
				 str+="]";
        	 // 再转成[{"id": "12", "name": "aaa", "pwd":"pwd1"},
        	 //{"id": "14", "name": "bb", "pwd":"pwd2"}]
        	 alert($.toJSON(list));
        	 
        	 $("#lis").click(function(){
        /* 	    $.ajax({
             	   url: "ajax2.do",
             	   type: "POST",
             	   contentType : 'application/json;charset=utf-8', //设置请求头信息
              	  dataType:"json",
              	  data: JSON.stringify(str),    //将Json对象序列化成Json字符串，JSON.stringify()原生态方法
             	  // data: $.toJSON(list),            //将Json对象序列化成Json字符串，toJSON()需要引用jquery.json.min.js
             	   success: function(data){
              	      alert(data);
              	 	 },
               		 error: function(res){
                	    alert(res.responseText);
                	}
           		 }); */
           		$.post("ajax2.do",{ "str": str });	
        	 });
        	 ///////////////////////////////////////////////////////////
        	 
        	 
        	 $("#tj").click(function(){
        	 	alert(list);
        	 	 $.post("ajax2.do","list:"+list); 
        	 /* 	$.ajax({  
    				type: "POST",  
   					url: "ajax2.do",  
   					data: JSON.stringify(list),//将对象序列化成JSON字符串  
 	  				dataType:"json",  
    				contentType : 'application/json;charset=utf-8', //设置请求头信息  
    				success: function(data){  
        				alert("OK");
   					 },  
   					 error: function(res){  
         				alert("oh~NO");
   					 }  
				});  */
        	 }); 
        	  
		});
         
	</script>
  </head>
  
  <body>
  	<table width="80%" align="center">
  		<tr>
  			<td><label><input type="checkbox" id="selectAll">全选</label></td>
  			<td>编号</td>
  			<td>姓名</td>
  			<td>密码</td>
  		</tr>
  		<c:forEach items="${list }" var="bean">
  		<tr>
  			<td><label><input type="checkbox" id="select">选择</label></td>
  			<td id="id">${bean.id }</td>
  			<td id="name">${bean.name }</td>
  			<td id="pwd">${bean.pwd }</td>
  		</tr>
  		</c:forEach>
  		<tr><td ><input id="tj" type="button" value="提交测试"></td>
  			<td ><input id="lis" type="button" value="提交测试"></td></tr>
  	</table>
  	
  	<div>
  		<span id="time"></span>
  	</div>
  	
  	<form action="add.do" method="post">
  		<table>
  			<tr><td><input type="text" name="name"></td></tr>
  			<tr><td><input type="text" name="pwd"></td></tr>
  		</table>
  		<input type="submit" > 
  	</form>
  </body>
</html>
