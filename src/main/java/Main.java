import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        System.out.println("Po uruchomieniu aplikacji otrzymasz ciekawe cytaty od Kanyego Westa.\n" +
                "W celu otrzymania nowego cytatu wpisz 'next'," +
                "\na w celu zatrzymania aplikacji wpisz 'stop' ");

        Exercise3 exercise3 = new Exercise3();

        exercise3.service();

    }
}
