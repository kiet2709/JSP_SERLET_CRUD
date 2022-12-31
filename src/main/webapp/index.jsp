<%@page import="java.util.ArrayList"%>
<%@ page import="Model.MonHoc" %>
<%@ page import="Controller.MonHoc.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý môn học</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
<link rel="stylesheet" href="main.css">
</head>
<body>
	<div class="row mb-5 mt-5">
		<div class="col-sm-2"></div>
		<div class="col-sm-6"><h3>Quản lý môn học Lê Nguyễn Tuấn Kiệt - 20110286</h3></div>
		<div class="col-sm-4"></div>
	<div class="row mt-5">
		<div class="col-sm-9"></div>
        <div class="col-sm-3"><a href="add"><input type=button value="Thêm môn học" class="btn btn-primary"></a></div>
    </div>
	<section class="intro mt-4">
	  <div class="gradient-custom-1 h-100">
	    <div class="mask d-flex align-items-center h-100">
	      <div class="container">
	        <div class="row justify-content-center">
	          <div class="col-12">
	            <div class="table-responsive bg-white">
	              <table class="table mb-0">
	                <thead>
	                
	                
	                  <tr>
	                    <th scope="col">Mã số môn học</th>
	                    <th scope="col">Tên hôn học</th>
	                    <th scope="col">Số tín chỉ</th>
	                    <th scope="col">Xóa</th>
	                    <th scope="col">Sửa</th>
	                  </tr>
	                 
	                </thead>
	                <tbody>
	                	<c:forEach items="${monHocs}" var="monhoc">
		                  <tr>
		                    <th scope="row" style="color: #666666;">${monhoc.maSoMonHoc}</th>
		                    <td>${monhoc.tenMonHoc}</td>
		                    <td>${monhoc.soTinChi}</td>
		                    <td><a href="delete?id=${monhoc.maSoMonHoc}"><input type=button value="Xóa" class="btn btn-danger"></a></td>
		                    <td><a href="edit?id=${monhoc.maSoMonHoc}"><input type=button value="Sửa" class="btn btn-primary"></a></td>
		                  </tr>
		                 </c:forEach>
	                </tbody>
	              </table>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</section>
</body>
</html>