package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class HealthCheckController {

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public String getHealthCheck() {
        return "I'm alive!";
    }
}
