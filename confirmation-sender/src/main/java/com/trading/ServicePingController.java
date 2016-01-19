package com.trading;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServicePingController {

    @RequestMapping("ping")
    public String ping() {
        return "ping";
    }
}