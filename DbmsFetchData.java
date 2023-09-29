package com.example.backtofrontend_api.Controller;

import com.example.backtofrontend_api.dto.ApiResponseDTO;
import com.example.backtofrontend_api.dto.ProcessedDataDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DbmsFetchData {

    @GetMapping("/api/b2f/fetchData")
    public Object getProcessedData(){
        String uri = "http://localhost:8081/api/dbms/fetchData";
        RestTemplate restTemplate = new RestTemplate();
        ProcessedDataDTO processedDataDTO = restTemplate.getForObject(uri, ProcessedDataDTO.class);

        ApiResponseDTO apiResponseDTO = new ApiResponseDTO();
        apiResponseDTO.setData(processedDataDTO);
        apiResponseDTO.setMessage("Data hämtad");

        return apiResponseDTO;
    }
}

/*
Sammanfattningsvis definierar den här koden en ändpunkt som gör en HTTP GET- Request
till en API, hämtar data, paketerar det i ett ApiResponseDTO och returnerar det som ett JSON-svar.
Detta  i RESTful-API:er för data från flera källor
 */
