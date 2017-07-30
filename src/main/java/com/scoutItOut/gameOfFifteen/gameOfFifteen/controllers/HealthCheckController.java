package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * @author jasquier
 * @since 0.1
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/api/v0.1/")
public class HealthCheckController {

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public HealthResponse getHealthCheck(@RequestParam(value = "content", defaultValue = "World") String content) {
        return new HealthResponse(content);
    }

    class HealthResponse {
        private String content;
        private static final String template = "Hello, %s!";

        HealthResponse(String content) {
            this.content = content;
        }

        public String getContent() {
            return String.format(template, content);
        }
    }
}
