import com.fasterxml.jackson.core.JsonProcessingException;
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

    public List<dataGettingBack> getAllMethod() throws IOException, InterruptedException {

        HttpClient httpClientGet = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpGetReq = HttpRequest
                .newBuilder(URI.create(url))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = httpClientGet.send(httpGetReq, HttpResponse.BodyHandlers.ofString());
        return mapper.readValue(response.body(), new TypeReference<List<dataGettingBack>>(){});
    }

    public List<dataGettingBack> getOne(int id) throws IOException, InterruptedException, error {
        HttpClient httpGetOne = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpOne = HttpRequest
                .newBuilder(URI.create(url + "/"+ id))
                .header("Content-Type","application/json")
                .GET()
                .build();

        HttpResponse<String> response = httpGetOne.send(httpOne, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() == 404) { throw new error("Not found "+ response.statusCode()); }
        return Collections.singletonList(mapper.readValue(response.body(), dataGettingBack.class));
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
        return response.statusCode()+ "\n"+ response.body();
    }

    public String postMethod() throws IOException, InterruptedException, error {

        dataGettingBack body = new dataGettingBack(3,null ,"randomBook",true);
        String jsonBody = mapper.writeValueAsString(body);

        HttpClient httpClientPost = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPostReq = HttpRequest
                .newBuilder(URI.create(url+"/"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClientPost.send(httpPostReq, HttpResponse.BodyHandlers.ofString());
        return response.statusCode()+ "\n" +response.body();
    }


    public String deleteMethod(int id) throws IOException, InterruptedException, error
    {

        HttpClient httpClientDelete = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpDelReq = HttpRequest
                .newBuilder(URI.create(url+"/"+id))
                .DELETE()
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClientDelete.send(httpDelReq, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() +"\n"+ response.body();
    }

    public String patchMethod(int id) throws IOException, InterruptedException, error
    {
        dataGettingBack body = new dataGettingBack(1, 1,"switching-from test",false);
        String jsonBody = mapper.writeValueAsString(body);

        HttpClient httpClientPatch = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        HttpRequest httpPatchreq = HttpRequest
                .newBuilder()
                .uri(URI.create(url+"/"+id))
                .method("PATCH", HttpRequest.BodyPublishers.ofString(jsonBody))
                .header("Content-Type","application/json")
                .build();

        HttpResponse<String> response = httpClientPatch.send(httpPatchreq, HttpResponse.BodyHandlers.ofString());
        return response.statusCode() + "\n" + response.body();
    }
}
