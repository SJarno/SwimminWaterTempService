package com.jarno.SwimmingBeachTempService.models.feature;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class LinkDto {
    private JsonLinkDto json;
    private GeoJsonLinkDto geojson;

    @JsonAlias("servicemap")
    private ServiceLinkDto serviceMap;

    private SiteLinkDto site;
}
