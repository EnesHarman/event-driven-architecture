package com.enesharman.automation.service;

import com.enesharman.model.Event;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService{

    @Override
    public void processEvent(Event event) {
        checkAutomationScenarios(event);
    }

    @Override
    public void checkAutomationScenarios(Event event) {
        System.out.println("Checking for scenarios...");
    }
}
