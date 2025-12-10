import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.gson.Gson;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class methods extends link{

    private final ObjectMapper mapper = new ObjectMapper();
    private final String url = "https://jsonplaceholder.typicode.com/todos";
    Gson gson = new Gson();

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

    public List<dataGettingBack> getOne(int id) throws IOException, InterruptedException, error {
        HttpClient httpGetOne = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpOne = HttpRequest
                .newBuilder(URI.create(url + "/"+ id))
                .header("Content-Type","application/json")
                .GET()
                .build();

        HttpResponse<String> responce = httpGetOne.send(httpOne, HttpResponse.BodyHandlers.ofString());

        if (responce.statusCode() == 404) { throw new error("Not found "+ responce.statusCode()); }


        return Collections.singletonList(mapper.readValue(responce.body(), dataGettingBack.class));
    }

    public String putMethod(int id) throws IOException, InterruptedException, error
    {
        dataGettingBack body = new dataGettingBack(3, 1,"test-test",true);
        String jsonBody = mapper.writeValueAsString(body);
        HttpClient httpClientPut = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPutReq = HttpRequest
                .newBuilder(URI.create(url+ "/" +id))
                .PUT(HttpRequest.BodyPublishers.ofString(jsonBody))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClientPut.send(httpPutReq, HttpResponse.BodyHandlers.ofString());


        return response.body();
    }

    public void postMethod() {

        HttpClient httpClientPost = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPostReq = HttpRequest
                .newBuilder(URI.create(url))
                //.POST()
                .header("Content-Type", "application/json")
                .build();


    }



    public void deleteMethod(int id)
    {

        HttpClient httpClientDelete = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpDelReq = HttpRequest
                .newBuilder(URI.create(url))
                .DELETE()
                .header("Content-Type", "application/json")
                .build();


    }

}
