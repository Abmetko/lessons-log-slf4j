package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeProvider {

    private final static Logger logger = LoggerFactory.getLogger(DateTimeProvider.class);

    public static void logCurrentDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info("Current time is: " + localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss, dd/MM/yyyy")));
    }
}