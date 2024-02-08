/**
 * 
 */

    let subMenu=document.getElementById("subMenu");
          
          function toggleMenu(){
            subMenu.classList.toggle("open-menu");
          }
          

 
 function changeLocation(){
	 let location = prompt("Please enter your new location");
	   const url = "https://api-production-55da.up.railway.app/updateLocation/" +  document.getElementById("consumerId").value + "/" + location;

        fetch(url)
  .then(function(response) {
     
    if (!response.ok) {
    
      throw new Error('Network response was not ok');
    }
    return response.body; // Assuming the response is a string
  })
  .then(function(data) {
  alert("changed successfully");
    // You can parse the string data if needed
    // var parsedData = JSON.parse(data);
    // console.log(parsedData);
  })
  .catch(function(error) {
   alert("unknown error occured");
  });
 }