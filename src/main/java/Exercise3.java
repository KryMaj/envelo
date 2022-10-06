import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Exercise3 {


    public String getText() throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://api.kanye.rest"))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public void service() throws URISyntaxException, IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.println(getText());


        do {
            text = scanner.nextLine().toLowerCase().trim();
            if (text.equals("stop")) {
                break;
            } else {
                System.out.println(getText());
            }

        } while (text.equals("next"));
    }




}
