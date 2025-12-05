import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class methods extends link{

    public void getMethod() {

        this.url = "https://jsonplaceholder.typicode.com/users/";

        HttpClient httpClientGet = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpGetReq = HttpRequest
                .newBuilder(URI.create(url))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        try
        {
            HttpResponse<String> res = httpClientGet.send(httpGetReq, HttpResponse.BodyHandlers.ofString());
            System.out.println(res.body());

        } catch (IOException | InterruptedException e)
        {
            System.out.println("Reason why it failed "+e);
        }

    }

    public void postMethod() {

        this.url = "https://jsonplaceholder.typicode.com/users/";

        HttpClient httpClientPost = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPostReq = HttpRequest.newBuilder(URI.create(url))
              //  .POST()
                .header("Content-Type", "application/json")
                .build();


    }

}