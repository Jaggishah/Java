import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


class getapi{
    public static void main(String[] args){
        String apiUrl = "https://jsonplaceholder.typicode.com/posts/1";

        HttpClient httpclient = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();

     try {
            // Send the request and receive the response
            HttpResponse<String> response = httpclient.send(request, HttpResponse.BodyHandlers.ofString());

            // Check the status code
            if (response.statusCode() == 200) {
                // Print the API response
                System.out.println("API Response:");
                System.out.println(response.body());
            } else {
                System.out.println("Error: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}