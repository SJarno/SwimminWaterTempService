package com.jarno.SwimmingBeachTempService.models.json;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaDataJson {
    private String name;
    private String location;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String servicemapUrl;

}
