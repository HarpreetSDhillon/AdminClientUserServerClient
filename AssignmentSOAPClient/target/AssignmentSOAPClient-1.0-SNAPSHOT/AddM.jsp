<%-- 
    Document   : AddMovie
    Created on : 29 Mar, 2020, 10:32:50 PM
    Author     : Harpreet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mainStyle.css">
        <title>Add Show</title>
    </head>
    <body>
        <h1>Add Show</h1>
        <form action="AddMovie" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="id" value="${lib.id}"/>
			<table style="width: 90%" class="table redTable">
				<tr>
					<td>Title</td>
					<td><input type="text" name="title" value="${lib.title}"/></td>
				</tr>
				<tr>
					<td>Description</td>
                                        <td><textarea type="text" name="description" />${lib.description}</textarea></td>
				</tr>
					<tr>
					<td>Type</td>
					<td><input type="text" name="type" value="${lib.type}"/></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><input type="text" name="category" value="${lib.category}"/></td>
				</tr>
                                <tr>
					<td>Cast</td>
					<td><input type="text" name="cast" value="${lib.cast}"/></td>
				</tr>
                                <tr>
					<td>Thumbnail</td>
                                        <td><input type="file" name="thumbnail"><br>
                                            <img src="data:image/jpg;base64,${img}" width="350" height="350" alt="No image to show"/></td>
                                                <input type="text" name="img" value="${img}" hidden/>
				</tr>
				<tr>
					<td>Director</td>
					<td><input type="text" name="director" value="${lib.director}"/></td>
				</tr>
                                <tr>
                                    <td colspan="2"><input type="submit" value="Add" name="add" /></td>
				</tr></table>
                        </form>
                                <div>${error}</div>
                                <a href="ViewLibrary">Back to Home</a>
    </body>
</html>
