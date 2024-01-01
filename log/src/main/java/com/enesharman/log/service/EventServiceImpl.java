package com.enesharman.log.service;

import com.enesharman.model.Event;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Override
    public void processEvent(Event event) {
        logEvent(event);
    }

    @Override
    public void logEvent(Event event) {
        System.out.println("Event is inserting to the database...");
    }
}
