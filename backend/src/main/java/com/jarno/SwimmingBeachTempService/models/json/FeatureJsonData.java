package com.jarno.SwimmingBeachTempService.models.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.jarno.SwimmingBeachTempService.models.feature.AbstractDataDto;



@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class FeatureJsonData extends AbstractDataDto{
    
}
