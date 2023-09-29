package com.example.backtofrontend_api.dto.processed;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApiResponseClean {
    @JsonProperty("data")
    private Data data;

    @JsonProperty("message")
    private String message;

    public ApiResponseClean(){}

    public ApiResponseClean(Data data, String message){
        this.data = data;
        this.message = message;
    }

    public Data getData(){
        return data;
    }

    public void setData(Data data){
        this.data = data;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

}
