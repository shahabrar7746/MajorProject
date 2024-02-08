package main;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class updatePassword {
	
	
	
	updatePassword( String id) {
		try {
		 String apiEndpoint = "https://example.com/api";

	        // Create a URL object with the API endpoint
	        URL url = new URL(apiEndpoint);

	        // Open a connection to the URL
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	        // Set the request method to POST
	        connection.setRequestMethod("POST");

	        // Enable input and output streams
	        connection.setDoOutput(true);

	        // Set the request headers (if needed)
	        connection.setRequestProperty("Content-Type", "application/json");
	        connection.setRequestProperty("Authorization", "Bearer yourAccessToken");

	        // Create the JSON payload for the POST request
	        String jsonInputString = "{\"Id\": \"value1\", \"key2\": \"value2\"}";

	        // Write the JSON data to the output stream
	        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
	            wr.writeBytes(jsonInputString);
	        

	        // Get the response code
	        int responseCode = connection.getResponseCode();
	        System.out.println("Response Code: " + responseCode);

	        // Read the response from the input stream
	        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	            String line;
	            StringBuilder response = new StringBuilder();

	            while ((line = reader.readLine()) != null) {
	                response.append(line);
	            }

	            // Print the response
	            System.out.println("Response: " + response.toString());
	        

	        // Close the connection
	     

		}catch(Exception e) {
			e.printStackTrace();
		}

}
}


