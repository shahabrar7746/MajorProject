<!DOCTYPE html>
<!-- Coding By CodingNepal - codingnepalweb.com -->
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
   <title>OTP Verification Form</title>
    <link rel="stylesheet" href="./Login/assets/css/otp.css" />
    <!-- Boxicons CSS -->
    <link href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css" rel="stylesheet" />
   <script src="./Login/assets/js/otp_script.js" defer></script>
  </head>
  <body>
  <div class="container">
        <h4>We have sent an OTP to change the password on <%
        String mail = request.getParameter("consumerMail");
        if(mail == null){
        	out.print("null");
        }else{
        out.print(mail.substring(0,3) + "*********gmail.com");
        }
        %></h4>
               <%

               session.setAttribute("otp", request.getAttribute("otp"));
               session.setAttribute("mail", request.getParameter("consumerMail"));
               %>
  
      <header>
    
        <i class="bx bxs-check-shield"></i>
      </header>
      <h4>Enter OTP Code</h4>
      <form action="validate" method = post>
        <div class="input-field">
          <input type="number" name = "num1" />
          <input type="number" name = "num2" disabled />
          <input type="number" name = "num3" disabled />
          <input type="number" name = "num4" disabled />
          <input type="number" name = "num5" disabled />
          <input type="number" name = "num6" disabled />
        </div>
  <input type = submit value =  "Submit" class = "button"/>
      </form>
    </div>
  </body>
</html>