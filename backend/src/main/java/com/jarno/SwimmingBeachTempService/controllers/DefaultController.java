package com.jarno.SwimmingBeachTempService.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    

    @GetMapping("/status")
    public HashMap<String, String> getStatus() {
        return new HashMap<>(){{ put("status", "ok");}};
    }
}
