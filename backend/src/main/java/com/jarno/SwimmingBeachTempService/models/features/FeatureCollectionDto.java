package com.jarno.SwimmingBeachTempService.models.features;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jarno.SwimmingBeachTempService.models.feature.FeatureDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureCollectionDto {
    private String type;
    private MetaData meta;
    private List<FeatureDto> features;
}
