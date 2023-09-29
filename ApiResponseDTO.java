package com.example.backtofrontend_api.dto;

public class ApiResponseDTO {
    private Object data;
    private String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data){
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

/* Blueprint för att skapa objekt som lagrar API-svar
 ApiResponseDTO är en enkel Java-klass utformad för att representera API-svar på ett strukturerat sätt,
 med en komponent och en meddelandekomponent (en sträng).
 man kan skapa instanser av klassen för att kapsla in API-svar och sedan komma åt eller
 ändra data och meddelande med hjälp av de tillhandahållna getter- och setter-metoderna. Detta kan
 göra det enklare att arbeta med API-svar på ett enhetligt sätt inom en Java-applikation
