package com.example.backtofrontend_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TemperatureCountByCategoryDTO {
    @JsonProperty("count")
    private Integer count;

    @JsonProperty("category_name")
    private String category_name;
}
