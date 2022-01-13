package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        DateTimeProvider.logCurrentDateTime();
        logger.error("error log test");
        logger.info("info log test");
        logger.debug("debug log test");
    }
}