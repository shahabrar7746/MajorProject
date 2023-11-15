<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="theme-color" content="#06aa5e">
    <meta name="msapplication-navbutton-color" content="#06aa5e">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black-translucent">
    <title>Forgot Password | 24Local</title>
    <link rel="shortcut icon" href="./assets/images/favicon.png" type="image/x-icon">
    <link rel="stylesheet" href=".//css//style1.css">
   
</head>
<body>
    <div class="form-container">
        <form action="changePassword" method = post >
            <h3>Create New Password</h3>
            
           <input type = password name = "password" placeholder = "Enter New Password Here" required/>
            <input type=  password name="password"  placeholder="Re-Enter your New Password Here" required>
            <input type="submit" name="submit" value="login now" class="form-btn">
                       
                     <%
                     String consumerId = (String)request.getAttribute("mail");
                 
                     if(consumerId == null){
                    	 session.setAttribute("sellerId",request.getAttribute("sellerId"));
                         session.setAttribute("mail", null);

                     }else{
                     session.setAttribute("mail", request.getAttribute("mail"));
                     }
                     %>
            
        </form>
</body>
</html>