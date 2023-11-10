<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | 24Local</title>

    <!-- custome css file link -->
    <link rel="stylesheet" href="/MajorProject/css/style1.css">

</head>
<body>
    <div class="form-container">
        <form action="/MajorProject/updatePassword" method="post">
            <h3>Reset Password</h3>
           
            <input type="email" name="consumerMail"  placeholder="enter your email"  required>
           <h4 style = "color : red">*email does not exists*</h4>
            <input type="submit" name="submit" value="login now" class="form-btn">
                       
                               </form>
    </div>
</body>
</html>