import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;

public class methods extends link{

    private final ObjectMapper mapper = new ObjectMapper();
    private final String url = "https://jsonplaceholder.typicode.com/todos";

    public List<dataGettingBack> getAllMethod() throws IOException, InterruptedException {


        HttpClient httpClientGet = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpGetReq = HttpRequest
                .newBuilder(URI.create(url))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> res = httpClientGet.send(httpGetReq, HttpResponse.BodyHandlers.ofString());

        return mapper.readValue(res.body(), new TypeReference<List<dataGettingBack>>(){});
    }







    public void postMethod() {

        HttpClient httpClientPost = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPostReq = HttpRequest.newBuilder(URI.create(url))
                .POST(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();


    }

    public void putMethod()
    {
        HttpClient httpClientPut = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPutReq = HttpRequest.newBuilder(URI.create(url))
                .PUT(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();



    }

    public void deleteMethod()
    {

        HttpClient httpClientDelete = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpDelReq = HttpRequest.newBuilder(URI.create(url))
                //.DELETE(HttpRequest.BodyPublishers.noBody())
                .header("Content-Type", "application/json")
                .build();


    }

}
