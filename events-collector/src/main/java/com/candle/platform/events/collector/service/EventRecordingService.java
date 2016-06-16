package com.candle.platform.events.collector.service;

/**
 * Created by agurha on 16/06/2016.
 */
public interface EventRecordingService {
    void createEvent(String collection_name, String json);
}
