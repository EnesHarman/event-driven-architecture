package com.enesharman.log.service;

import com.enesharman.model.Event;

public interface EventService {
    void processEvent(Event event);

    void logEvent(Event event);
}
