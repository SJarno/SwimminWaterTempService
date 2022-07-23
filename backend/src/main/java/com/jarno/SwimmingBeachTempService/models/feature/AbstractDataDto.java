package com.jarno.SwimmingBeachTempService.models.feature;

import java.util.Date;

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
@JsonInclude(Include.NON_DEFAULT)
public abstract class AbstractDataDto {
    private Date time;

    @JsonAlias("temp_water")
    private Double tempWater;

    @JsonAlias("temp_in")
    private Double tempIn;

    @JsonAlias("temp_water_min")
    private Double tempWaterMin;

    @JsonAlias("temp_water_max")
    private Double tempWaterMax;

    @JsonAlias("temp_air")
    private Double tempAir;

    private Double rssi;
    private Double batt;
}
