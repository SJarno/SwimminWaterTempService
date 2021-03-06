package com.jarno.SwimmingBeachTempService.models.feature;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureDto {
    
    private String type;
    private String id;
    private Geometry geometry;
    private PropertyDto properties;
}
