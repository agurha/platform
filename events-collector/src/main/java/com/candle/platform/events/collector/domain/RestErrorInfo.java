package com.candle.platform.events.collector.domain;

/**
 * Created by agurha on 16/06/2016.
 */
public class RestErrorInfo {
    private final String detail;
    private final String message;

    public RestErrorInfo(Exception ex, String detail) {
        this.message = ex.getLocalizedMessage();
        this.detail = detail;
    }
}