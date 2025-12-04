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
import com.google.gson.Gson;

public class http {

    public void getMethod() {

        link link = new link();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpReq = HttpRequest.newBuilder(URI.create(link.getCamera)).GET().build();

        try {
            HttpResponse<String> req = httpClient.send(httpReq, HttpResponse.BodyHandlers.ofString());
            //HttpResponse responce = httpClient.send(httpReq ,HttpResponse.BodyHandlers.ofString());

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}