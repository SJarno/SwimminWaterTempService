package com.jarno.SwimmingBeachTempService.models.feature;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractDataDto {
    private Date time;

    @JsonAlias("temp_water")
    private double tempWater;

    @JsonAlias("temp_in")
    private double tempIn;

    @JsonAlias("temp_water_min")
    private double tempWaterMin;

    @JsonAlias("temp_water_max")
    private double tempWaterMax;

    private double rssi;
    private double batt;
}
