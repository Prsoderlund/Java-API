package com.example.backtofrontend_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LevelDetailsDTO {

    @JsonProperty("color")
    private String color;

    @JsonProperty("category_id")
    private String category_id;

    @JsonProperty("id")
    private Long id;

}
