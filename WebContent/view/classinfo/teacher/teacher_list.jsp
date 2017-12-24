<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
<title>首页</title>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="../../../css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="../../../js/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="../../../js/bootstrap.min.js"></script>


</head>

<body>
<div style="padding:0px; margin:0px;">
 <ul class="breadcrumb" style="  margin:0px; " >
    	<li><a href="#">系统管理</a></li>
        <li>教师管理</li>
    </ul>
</div>
<div class="row alert alert-info"  style="margin:0px; padding:3px;" >
<form class="form-inline">

    <div class="form-group">
         <label class="" for="activename">条件：</label>
     
        	<select class="form-control  input-sm">
        	<option>姓名</option>
            <option>性别</option>
        </select>
            <input type="text"  class="form-control input-sm"/>
      </div>
  
    <input type="button"   class="btn btn-danger"   value="查询"/>
    <input type="button"   class="btn btn-success"   value="添加" onClick="javascript:window.location='teacher_add.html'"/>
    </form>
</div>
<div class="row" style="padding:15px; padding-top:0px; ">
	<table class="table  table-condensed table-striped">
    	<tr>
        	<th>教师编号</th>
            <th>教师姓名</th>
            <th>教师性别</th>
            <th>教师年龄</th>
            <th>电话号码</th>
            <th>QQ</th>
            <th>入职时间</th>
             <th>操作</th>
        </tr>
        <tr>
        	<td><a href="teacher_show.html">1001</a></td>
            <td>无语</td>
            <td>男</td>
            <td>18</td>
            <td>989899999</td>
            <td>123456</td>
            <td>2014-10-27</td>
            <td>
            	<a  href="teacher_update.html">修改</a>
                <a  href="修改">删除</a>
            </td>
        </tr>        <tr>
        	<td>1001</td>
            <td>无语</td>
            <td>男</td>
            <td>18</td>
            <td>989899999</td>
            <td>123456</td>
            <td>2014-10-27</td>
            <td>
            	<a  href="teacher_update.html">修改</a>
                <a  href="修改">删除</a>
            </td>
        </tr>        <tr>
        	<td>1001</td>
            <td>无语</td>
            <td>男</td>
            <td>18</td>
            <td>989899999</td>
            <td>123456</td>
            <td>2014-10-27</td>
            <td>
            	<a  href="teacher_update.html">修改</a>
                <a  href="修改">删除</a>
            </td>
        </tr>    <tr>
        	<td>1001</td>
            <td>无语</td>
            <td>男</td>
            <td>18</td>
            <td>989899999</td>
            <td>123456</td>
            <td>2014-10-27</td>
            <td>
            	<a  href="修改">修改</a>
                <a  href="修改">删除</a>
            </td>
        </tr>    <tr>
        	<td>1001</td>
            <td>无语</td>
            <td>男</td>
            <td>18</td>
            <td>989899999</td>
            <td>123456</td>
            <td>2014-10-27</td>
            <td>
            	<a  href="修改">修改</a>
                <a  href="修改">删除</a>
            </td>
        </tr>
          
    </table>
</div>

</body>
</html>
