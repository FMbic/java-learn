import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

import com.google.gson.Gson;

public class http {

    public void getMethod() {

        link link = new link();

        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest httpReq = HttpRequest.newBuilder(URI.create(link.getCamera)).GET().build();

        try
        {
            HttpResponse<String> res = httpClient.send(httpReq, HttpResponse.BodyHandlers.ofString());
            System.out.println(res.toString());

        } catch (IOException | InterruptedException e)
        {
            System.out.println("Reason why it failed "+e);
        }



    }
}