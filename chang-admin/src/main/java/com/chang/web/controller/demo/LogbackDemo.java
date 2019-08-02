package com.chang.web.controller.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by SunChang on 2019/7/17
 */
public class LogbackDemo {
    private static Logger log = LoggerFactory.getLogger(LogbackDemo.class);

    public static void main(String[] args) {
        log.trace("========trace");
        log.debug("========debug");
        log.info("========info");
        log.warn("========warn");
        log.error("========error");
    }
}
