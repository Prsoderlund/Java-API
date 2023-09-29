package com.example.backtofrontend_api.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class B2fFetchProcessedData {

    @GetMapping("/api/b2f/fetchProcessedData1")
    public Object fetchProcessedData() throws IOException {
        URLConnection connection = new URL("http://localhost:8082/api/b2f/fetchData?param1=value1&param2=value2").openConnection();
        String header1 = "this_is_header1";
        String header2 = "this_is_header2";
        connection.setRequestProperty("header1", header1);
        connection.setRequestProperty("header2", header2);

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null){
            content.append(inputLine);
        }
        in.close();

        return content.toString();
    }
}


/*
Den här koden gör en HTTP GET-begäran till en  URL,
hämtar svaret och returnerar innehållet som en string.
Användningen av @RestController säkerställer
att returvärden från den här metoden automatiskt konverteras
till ett JSON-svar (det som vi vill ha ut från api:et) när den nås via en
att du har den lämpliga konfigurationen inställd i din Spring Boot-applikation.
 */
