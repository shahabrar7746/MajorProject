/**
 * 
 */
const id = localStorage.getItem("consumerId");
const query = localStorage.getItem("query");
var url = 'https://api-production-55da.up.railway.app/service';
var data = {
  "id": id,
   "query" : query
};

fetch(url, {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json'
    // Add other headers if needed
  },
  body: JSON.stringify(data)
})
  .then(function(response) {
	 
    return response.json();
  })
  .then(function(responseData) {
    console.log(responseData);
  })
  .catch(function(error) {
    console.log('Error:', error);
  });

