package com.example.backtofrontend_api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class WarningByTempIdDTO {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
    @JsonProperty("timestamp_warning")
    private String timestamp_warning;

    @JsonProperty("temperatures")
    private Float temperatures;

    @JsonProperty("id")
    private Long id;

}
