package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class HealthCheckController {

    private static final String template = "Hello, %s!";

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public HealthResponse getHealthCheck(@RequestParam(value = "content", defaultValue = "World") String content) {
        return new HealthResponse(String.format(template, content));
    }

    class HealthResponse {
        private String content;

        HealthResponse(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }
}
