package com.groupeisi.elkproject.Controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ElkController {
    private static final Logger LOG = LogManager.getLogger(ElkController.class);

    @GetMapping(value = "/hello")
    public String echoMessage() {
        LOG.log(Level.INFO, "Hello it's me");
        return "Hello it's me";
    }
}
