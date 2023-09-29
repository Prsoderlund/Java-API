package com.example.backtofrontend_api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProcessedDataWrapperDTO {
    private ProcessedDataDTO data;
}
/*
Genom att använda @Data och @JsonIgnoreProperties
tillsammans skapar du en dataöverföringsobjekt (DTO) som
representerar en wrapper runt ProcessedDataDTO.
 */
