<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login form</title>

    <!-- custome css file link -->
    <link rel="stylesheet" href="/MajorProject//css//style1.css">

</head>
<body>
    <div class="form-container">
        <form action="/MajorProject/loginConsumer" method="post">
            <h3>login now</h3>
            <input type="text" name="name"  placeholder="enter your name" value = <%out.print(request.getAttribute("name")); %> required>
            <input type="email" name="mail"  placeholder="enter your email" value =  <%out.print(request.getAttribute("email")); %> required>
            <input type="password" name="password"  placeholder="enter your password"  required>
            <h4>
            <% 
            out.print(request.getAttribute("msg"));
            %>
            </h4>
                        <p> <a href="/MajorProject/updatePassword">Forgot Password</a></p>

            <input type="submit" name="submit" value="login now" class="form-btn">
            
            <p>dont't have an account? <a href="signupAs.html">register now</a></p>
        </form>
    </div>
</body>
</html>