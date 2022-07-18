package com.jarno.SwimmingBeachTempService.models.feature;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractLinkDto {
    private String type;
    private String rel;
    private String title;
    private String href;

}
