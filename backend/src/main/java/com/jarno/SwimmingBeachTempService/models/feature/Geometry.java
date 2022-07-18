package com.jarno.SwimmingBeachTempService.models.feature;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Geometry {
    private String type;
    /* longitude and latitude */
    private List<BigDecimal> coordinates;
}
