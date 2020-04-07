<%-- 
    Document   : Index
    Created on : 29 Mar, 2020, 3:35:53 PM
    Author     : Harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dash</title>
        <link rel="stylesheet" href="mainStyle.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script>
            $(document).ready(function(){
            $('#data').after('<div id="nav"></div>');
            var rowsShown = 4;
            var rowsTotal = $('#data tbody tr').length;
            var numPages = rowsTotal/rowsShown;
            for(i = 0;i < numPages;i++) {
                var pageNum = i + 1;
                $('#nav').append('<a href="#" rel="'+i+'">'+pageNum+'</a> ');
            }
            $('#data tbody tr').hide();
            $('#data tbody tr').slice(0, rowsShown).show();
            $('#nav a:first').addClass('active');
            $('#nav a').bind('click', function(){

                $('#nav a').removeClass('active');
                $(this).addClass('active');
                var currPage = $(this).attr('rel');
                var startItem = currPage * rowsShown;
                var endItem = startItem + rowsShown;
                $('#data tbody tr').css('opacity','0.0').hide().slice(startItem, endItem).
                css('display','table-row').animate({opacity:1}, 300);
            });
        });
</script>
    </head>
    <body>
        <h1>Welcome Admin</h1>
        <table class="table redTable">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Title</th>
                        <th scope="col">Description</th>
                        <th scope="col">Cast</th>
                        <th scope="col">Director</th>
                        <th scope="col">Type</th>
                        <th scope="col">Category</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="lib" items="${lib}">
                    <tr>
                        <td scope="row">${lib.id}</td>
                        <td>${lib.title}</td>
                        <td>${lib.description}</td>
                        <td>${lib.cast}</td>
                        <td>${lib.director}</td>
                        <td>${lib.type}</td>
                        <td>${lib.category}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        <br>
        <table style="width: 50%; margin: auto;" class="table redTable">
        <form action="AddM.jsp" method="get">
            <tr><td colspan="2"><input type="submit" value="Add" /></td></tr></form>
        <form action="ModMovie" method="POST" enctype="multipart/form-data">
				<tr>
					<td>ID</td>
					<td><select id="selectElementId" name="id">
                                            <c:forEach var="lib" items="${lib}">
                                              <option value="${lib.id}" selected>${lib.id}</option>
                                            </c:forEach>
                                            </select>
                                        </td>
				</tr>
                                <tr><td colspan="2">
			<input type="submit" value="Delete" name="del" />
                        <input type="submit" value="Update" name="update"/>
                        <input type="submit" value="Search" name="search"/></td></tr></form></table>
        

    </body>
</html>
