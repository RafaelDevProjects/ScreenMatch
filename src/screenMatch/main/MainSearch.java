package screenMatch.main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenMatch.exceptions.InvalidConversionYear;
import screenMatch.models.Title;
import screenMatch.models.TitleOMDb;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String search = "";
        List<Title> titleList = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (!search.equalsIgnoreCase("exit")) {

            System.out.println("What film you want to see? ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }

            String adress = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=38198bea";
            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(adress))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TitleOMDb titleOMDb = gson.fromJson(json, TitleOMDb.class);
                System.out.println(titleOMDb);
                Title title = new Title(titleOMDb);
                System.out.println(title);

                titleList.add(title);
            } catch (NumberFormatException e) {
                System.out.println("Error" + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error verify the adress ( " + e.getMessage() + " )");
            } catch (InvalidConversionYear e) {
                System.out.println("Error " + e.getMessage());
            }
        }

        System.out.println(titleList);
        FileWriter writer = new FileWriter("films.json", true);
        writer.write(gson.toJson(titleList));
        writer.close();



        System.out.println("Exit");

//        Outra forma melhor de enviar o request e imprimir na tela
//        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
    }
}
