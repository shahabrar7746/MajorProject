<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>24Local</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <link rel="stylesheet" href="assets/css/afterlogin.css">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=Anton&family=Dela+Gothic+One&family=Libre+Baskerville:wght@700&family=Tektur:wght@600&display=swap"
    rel="stylesheet">


</head>

<body>
  <!-- header -->
  <div class="container-header">
    <div onclick="window.location.href='/index.html';"class="logo">
      24LOCAL
    </div>
    <div class="search-container">
      <div class="search-icon">
        <img src="./images/search.svg" alt="" onclick = "search()">
        <i class="fa fa-search"></i>
      </div>
      <input type="text" class="search-input" placeholder="Search..." id = "searchQuery">
    </div>
    <!--login-->
    <img src="assets/images/user.png " class="user-pic" onclick="toggleMenu()">
    <div class="sub-menu-wrap" id="subMenu">
        <div class="sub-menu">
            <div class="user-info">
                <!-- <img src="assets/images/user.png" alt=""> -->
            </div>
            <a href="" class="sub-menu-link">
                <img src="assets/images/service.png">
                <p>Service</p>
                <!-- <span>></span> -->
            </a>
<div onclick= "">
            <a   href = "#"   class="sub-menu-link">
                <img src="assets/images/location.png">
                <p onclick = "changeLocation()">Change Location</p>
                <!-- <span>></span> -->
            </a>
        </div>
           </div>
    </div>
  </div>

  
  <div class="navbar">
    <li><a href="">Home</a></li>
    <li><a href="">Deals</a></li>
    <li><a href="hospital_list.html">Hospitals</a></li>
    <li><a href="flight.html">Flight Booking</a></li>
    <li><a href="">Most Popular</a></li>
    <li><a href="">About Us</a></li>
  </div>
  
  <!-- Caraousel -->
  <div class="container">
    <div id="carouselExampleIndicators" class="carousel slide">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
          aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
          aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
          aria-label="Slide 3"></button>
      </div>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="./images/Carousel-1.jpg" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
          <img src="./images/Carousel-2.png" class="d-block w-100" alt="...">
        </div>
        <div class="carousel-item">
          <img src="./images/Carousel-3.jpg" class="d-block w-100" alt="...">
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
        data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
  </div>

  <!-- Items -->

  
  <div class="container">
    <!-- <div class="see_all">See All</div> -->
    <div id="carouselExampleControls" class="carousel_slide" data-ride="carousel">
      <div class="desc_categories">Top Hospitals</div>
      <div class="See_all">See All</div>
      <div class="carousel-inner">
        <div class="size">
          <div class="carousel-item active">
            <div class="cards-wrapper">
              <div  class="card" style="width: 31rem;">
                <img src="./images/apollo.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Apollo Hospital Kharghar</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Book Appoitment</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="./images/asian.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Asian Heart Hospital Mumbai</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Book Appointment</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="./images/koki.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Kokilaben Hospital Mumbai</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Book Appointment</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="./images/Tata.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Tata Memorial Hospital Mumbai</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Book Appointment</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="./images/lilvati.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Lilavati Hospital Mumbai</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Book Appointment</a>
                </div>
              </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--schools-->
  <div class="container">
    <!-- <div class="see_all">See All</div> -->
    <div id="carouselExampleControls" class="carousel_slide" data-ride="carousel">
      <div class="desc_categories">Top Schools</div>
      <div class="See_all">See All</div>
      <div class="carousel-inner">
        <div class="size">
          <div class="carousel-item active">
            <div class="cards-wrapper">
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipMm2C8egDq1o8G6O0bHM8OgW85yZvrajQzOOk4E=s680-w680-h510"class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">VIBGYOR High School Kharghar
                  </h5>
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipPUDGyzqhOMf0l1PbDYjdJtMYytryn8f91AVZiS=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Apeejay School Kharghar </h5>
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh5.googleusercontent.com/p/AF1QipMYyAsIKNNgigtXJtjvzP8cEwp3QG1vdbNrQVpI=w141-h101-n-k-no-nu" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Radcliffe Group of Schools Khargahr</h5>
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipPdzdHswgwABBrN57CiAXtr2yqOTUMG3GPirRnx=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">KPC Public School Kharghar</h5>
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipPMLcjkmqVaDEHqMnJnLhbzLXpCSRuVKZn_nAFp=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">DAV International School Kharghar</h5>
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--colleges-->
  <div class="container">
    <!-- <div class="see_all">See All</div> -->
    <div id="carouselExampleControls" class="carousel_slide" data-ride="carousel">
      <div class="desc_categories">Top Colleges</div>
      <div class="See_all">See All</div>
      <div class="carousel-inner">
        <div class="size">
          <div class="carousel-item active">
            <div class="cards-wrapper">
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipOSYIK2RHvaSNUjTrakbEA1cHEOEEABpCYho48w=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Bharati Vidyapeeth College of Engineering, Navi Mumbai</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipMPmCV7Taeb9P7D9CRPwyswNj0liX_uxSGY4_CR=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">A. C. Patil College of Engineering, Kharghar</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipMZZzIBQpqeKoJKayU2qy2KmWa2Pns6eOr6aFv1=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Saraswati College of Engineering, Kharghar</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipOkROu-eJroOnC7NJ2gpai0dvCG0i_QLthoHTb8=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">Bharti Vidhaypith Kharghar(Deemed)</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
              <div class="card" style="width: 31rem;">
                <img src="https://lh3.googleusercontent.com/p/AF1QipOLX6TgJ-tvSveEWXAtDRnjNZoe-YPLpjbx1RsQ=s680-w680-h510" class="card-img-top" alt="...">
                <div class="card-body">
                  <h5 class="card-title">YMT College of Management</h5>
                  <!-- <p class="card-text">Price</p> -->
                  <a href="#" class="btn btn-primary">Call us</a>
                </div>
              </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
 <!--Flights-->
 <div class="container">
  <!-- <div class="see_all">See All</div> -->
  <div id="carouselExampleControls" class="carousel_slide" data-ride="carousel">
    <div class="desc_categories">Top Flights</div>
    <div class="See_all">See All</div>
    <div class="carousel-inner">
      <div class="size">
        <div class="carousel-item active">
          <div class="cards-wrapper">
            <div class="card" style="width: 31rem;">
              <img src="data:image/png;base64,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"class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Air India
                </h5>
                <a href="#" class="btn btn-primary">Book now</a>
              </div>
            </div>
            <div class="card" style="width: 31rem;">
              <img src="data:image/png;base64,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" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Emirates </h5>
                <a href="#" class="btn btn-primary">Book now</a>
              </div>
            </div>
            <div class="card" style="width: 31rem;">
              <img src="https://static.vecteezy.com/system/resources/previews/029/824/285/non_2x/lufthansa-logo-black-editorial-free-vector.jpg" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Lufthansa </h5>
                <a href="#" class="btn btn-primary">Book now</a>
              </div>
            </div>
            <div class="card" style="width: 31rem;">
              <img src="https://upload.wikimedia.org/wikipedia/en/thumb/b/bd/Vistara_Logo.svg/1200px-Vistara_Logo.svg.png" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Vistara </h5>
                <a href="#" class="btn btn-primary">Book now</a>
              </div>
            </div>
            <div class="card" style="width: 31rem;">
              <img src="https://s.pilotsglobal.com/img/0/f/f/8/5/0ff856c6fefc86bbb189929a93618d12.svg" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Spicejet</h5>
                <a href="#" class="btn btn-primary">Book now</a>
              </div>
            </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<!--groceries-->
<div class="container">
  <!-- <div class="see_all">See All</div> -->
  <div id="carouselExampleControls" class="carousel_slide" data-ride="carousel">
    <div class="desc_categories">Groceries</div>
    <div class="See_all">See All</div>
    <div class="carousel-inner">
      <div class="size">
        <div class="carousel-item active">
          <div class="cards-wrapper">
            <div class="card" style="width: 31rem;">
              <img src="./images/cheese.jpg" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Product Name</h5>
                <p class="card-text">Price</p>
                <a href="#" class="btn btn-primary">ADD</a>
              </div>
            </div>
            <div class="card">
              <img src="./images/milk.jpg" class="card-img-top" alt="...">
              <div class="card-body" style="width: 31rem;">
                <h5 class="card-title">Product Name</h5>
                <p class="card-text">Price</p>
                <a href="#" class="btn btn-primary">ADD</a>
              </div>
            </div>
            <div class="card">
              <img src="./images/bread.jpg" class="card-img-top" alt="...">
              <div class="card-body" style="width: 31rem;">
                <h5 class="card-title">Product Name</h5>
                <p class="card-text">Price</p>
                <a href="#" class="btn btn-primary">ADD</a>
              </div>
            </div>
            <div class="card">
              <img src="./images/drink.jpg" class="card-img-top" alt="...">
              <div class="card-body" style="width: 31rem;">
                <h5 class="card-title">Product Name</h5>
                <p class="card-text">Price</p>
                <a href="#" class="btn btn-primary">ADD</a>
              </div>
            </div>
            <div class="card">
              <img src="./images/food.jpg" class="card-img-top" alt="...">
              <div class="card-body" style="width: 31rem;">
                <h5 class="card-title">Product Name</h5>
                <p class="card-text">Price</p>
                <a href="#" class="btn btn-primary">ADD</a>
              </div>
            </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
  <!-- footer -->
   <footer>
    <div class="foot-panel1">
      <li><a href="index.html">Back on top</a></li>
    </div>

    <div class="foot-panel2" >
       <ul>
            <p> ABOUT </p>
            <a> Contact us</a>
            <a> About us</a>
            <a> Careers</a>
       </ul>

       <ul>
           <p> HELP </p>
           <li><a href="./PaymentGateway/payment.html">Payment Option</a></li>
           <a> Cancellation & Return </a>
           <a> Report</a>
       </ul>
       
       <ul>
           <p> SOCIAL </p>
           <a> Instagram</a>
           <a> facebook</a>
           <a> Twitter</a>
      </ul>

      <ul>
         <p> CONSUMER POLICY </p>
         <a>Terms of use</a>
         <a>Security</a>
         <a> Privacy</a>
      </ul>

    </div>

   <div class="foot-panel3">
       <div class="logo"> </div>
   </div> 
</footer>
<input type = "text" id = "consumerId" value = 
<%out.print(request.getAttribute("consumerId"));%>
>
<%
session.setAttribute("consumerId", request.getAttribute("consumerId"));

%>


      
        <script src = "./js/index.js"></script>


</body>

</html>