<%-- 
    Document   : coolForm
    Created on : Jun 9, 2021, 11:38:09 AM
    Author     : dyadlows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cool Form</title>
    </head>
    <body>
        <h1>Are you a cool customer?</h1>
        <form method="post" action="cool">
            <input type="radio" id="c_yes" name="coolness[]" value="true"><label for="c_yes">Yes</label>
            <br>
            <input type="radio" id="c_no" name="coolness[]" value="false"><label for="c_no">No</label>
            <br>
            <br>
            <input type="submit" value="Submit Coolness Factor">
        </form>
    </body>
</html>
