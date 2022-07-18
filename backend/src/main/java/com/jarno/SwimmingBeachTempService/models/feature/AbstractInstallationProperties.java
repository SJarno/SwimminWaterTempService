package com.jarno.SwimmingBeachTempService.models.feature;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractInstallationProperties {
    /* Installations: */
    @JsonAlias("installation depth")
    private Double installationDepth;

    @JsonAlias("installation platform")
    private String installationPlatform;

    @JsonAlias("installation method")
    private String installationMethod;
    /*  */
}
