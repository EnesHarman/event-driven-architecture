package com.enesharman.automation.service;

import com.enesharman.constant.ConsumerGroups;
import com.enesharman.constant.Topics;
import com.enesharman.model.Event;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {

    private final EventService eventService;

    public EventConsumer(EventService eventService) {
        this.eventService = eventService;
    }

    @KafkaListener(topics = Topics.EVENT_TOPIC, groupId = ConsumerGroups.AUTOMATION_EVENT_CONSUMERS)
    public void listen(Event event) {
        eventService.processEvent(event);
    }
}
