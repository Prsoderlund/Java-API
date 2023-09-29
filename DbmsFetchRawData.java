package com.example.backtofrontend_api.Controller;

import com.example.backtofrontend_api.dto.ApiResponseDTO;
import com.example.backtofrontend_api.dto.TemperatureDataDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//http://localhost:8081/api/dbms/fetchRawData
@RestController
public class DbmsFetchRawData {

    @GetMapping(value = "/api/b2f/fetchRawData")
    public ApiResponseDTO getRawData(){
        String uri = "http://localhost:8081/api/dbms/fetchRawData";
        RestTemplate restTemplate = new RestTemplate();
        TemperatureDataDTO[] result = restTemplate.getForObject(uri, TemperatureDataDTO[].class);

        ApiResponseDTO apiResponseDTO = new ApiResponseDTO();
        apiResponseDTO.setData(result);
        apiResponseDTO.setMessage("Data hämtad");
        System.out.println("Resultat: " + result);

        return apiResponseDTO;
    }
}
/*
Den här koden är liknande det tidigare exemplet,
men den hämtar rå temperaturdata från en annan API-endpointen,
paketerar den i en ApiResponseDTO och returnerar den som ett JSON-svar.
