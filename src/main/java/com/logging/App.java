package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.error("Hello World");
        logger.info("Hello World");
        logger.debug("Hello World");
    }
}