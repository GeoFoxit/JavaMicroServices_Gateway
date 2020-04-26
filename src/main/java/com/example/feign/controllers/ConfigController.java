package com.example.feign.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class ConfigController {

    @Value("${proj.description: None}")
    private String projDesc;

    @Value("${app.description: None}")
    private String appDesc;

    @RequestMapping("/config")
    @ResponseBody
    public String getPropsFormDownloadedConfig() {
        return "Project: " + projDesc + " | " + "App: " + appDesc;
    }
}
