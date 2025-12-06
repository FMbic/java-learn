import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class methods extends link{

    public final ObjectMapper mapper = new ObjectMapper();

    public void getAllMethod() {

        this.url = "https://jsonplaceholder.typicode.com/todos";

        HttpClient httpClientGet = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpGetReq = HttpRequest
                .newBuilder(URI.create(url))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        try
        {
            HttpResponse<String> res = httpClientGet.send(httpGetReq, HttpResponse.BodyHandlers.ofString());

            //String valueGet = mapper.readValue(res.body(), String.class);
            //System.out.println(mapper.readValues(res.body(), String.class));
            System.out.println(res.body());

        } catch (IOException | InterruptedException e)
        {
            System.out.println("Why GET failed "+e);
        }

    }

    public void postMethod() {

        this.url = "https://jsonplaceholder.typicode.com/todos";

        HttpClient httpClientPost = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPostReq = HttpRequest.newBuilder(URI.create(url))
                .POST(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

            try
            {
            HttpResponse <String> response = httpClientPost.send(httpPostReq, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
            }
            catch (IOException | InterruptedException e)
            {
                System.out.println("Why POST failed "+e);
            }
    }

    public void putMethod()
    {
        this.url = "https://jsonplaceholder.typicode.com/todos/";
        HttpClient httpClientPut = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPutReq = HttpRequest.newBuilder(URI.create(url))
                .PUT(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();

        try
        {
            HttpResponse <String> response = httpClientPut.send(httpPutReq, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }
        catch (IOException | InterruptedException e)
        {
            System.out.println("Why PUT failed "+e);
        }

    }

    public void deleteMethod()
    {
        this.url = "https://jsonplaceholder.typicode.com/todos/";
        HttpClient httpClientDelete = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpDelReq = HttpRequest.newBuilder(URI.create(url))
                //.DELETE(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();
        /*
        try
        {
            HttpResponse<String> response = httpClientDelete.send(httpDelReq, HttpRequest.BodyPublishers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }
        catch (IOException | InterruptedException e)
        {
            System.out.println("Why DELETE failed "+e);
        }

         */

    }

}
