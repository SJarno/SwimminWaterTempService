package com.jarno.SwimmingBeachTempService.models.feature;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataDto {
    private List<RawDto> raw;
    private List<H3Dto> h3;
    private List<D1Dto> d1;

}
