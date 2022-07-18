package com.jarno.SwimmingBeachTempService.models.feature;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFilter;
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
public class PropertyDto extends AbstractInstallationProperties {

    private String name;
    private String location;
    private String district;

    @JsonAlias("created_at")
    private Date createdAt;

    @JsonAlias("temp_water")
    private Double tempWater;

    @JsonAlias("temp_in")
    private Double tempIn;

    private Double battery;
    private Date time;
    private LinkDto links;
    private DataDto data;
}
