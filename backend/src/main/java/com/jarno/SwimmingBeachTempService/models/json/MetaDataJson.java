package com.jarno.SwimmingBeachTempService.models.json;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.jarno.SwimmingBeachTempService.models.feature.PropertyDto;

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
    @JsonAlias("lat")
    private BigDecimal latitude;
    @JsonAlias("lon")
    private BigDecimal longitude;
    @JsonAlias("servicemap_url")
    private String servicemapUrl;
    @JsonAlias("site_url")
    private String siteUrl;
    @JsonAlias("site_title")
    private String siteTitle;
    @JsonAlias("valid_from")
    private Date date;

    private PropertyDto properties;
    @JsonAlias("file_created")
    private Date fileCreated;
}
