package com.enesharman.automation.service;

import com.enesharman.model.Event;

public interface EventService {
    void processEvent(Event event);

    void checkAutomationScenarios(Event event);
}
