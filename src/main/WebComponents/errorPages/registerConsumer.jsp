<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register form</title>

    <!-- custome css file link -->
    <link rel="stylesheet" href="/MajorProject//css//style1.css">

</head>
<body>
    <div class="form-container">
        <form action="/MajorProject//registerConsumer" method="post">
            <h3>register now</h3>
            <input type="text" name="name"  placeholder="enter your name" value =  <%out.print(request.getParameter("name")); %> required>
            <input type="email" name="email"  placeholder="enter your email" value =  <%out.print(request.getParameter("email")); %> required>
                       <input type="text" name = "location" placeholder="Enter your Location" value =  <%out.print(request.getParameter("location")); %> required>
                                                <input type= "number" name="pincode"  placeholder="enter your pincode" value =  <%out.print(request.getParameter("pincode"));%> required>
           
            <input type="password" name="password"  placeholder="enter your password" value =  <%out.print(request.getParameter("password")); %> required>
            <input type="password" name="confirmpassword"  placeholder="confirm your password" required>
            
 <h4>*email already exists in system*</h4>
            <input type="submit" name="submit" value="register now" class="form-btn">
            
            <p>already have an account? <a href="Login.html">login now</a></p>
        </form>
    </div>
</body>
</html>