package com.enesharman.api.service;

import com.enesharman.api.dto.EventFireRequest;
import com.enesharman.constant.Topics;
import com.enesharman.model.Event;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private final KafkaTemplate<String, Event> producer;

    public EventServiceImpl(KafkaTemplate<String, Event> producer) {
        this.producer = producer;
    }

    @Override
    public void fireEvent(EventFireRequest request) {
        var event = populateEventFromRequest(request);
        producer.send(Topics.EVENT_TOPIC, event);
    }

    private Event populateEventFromRequest(EventFireRequest request) {
        return Event.builder()
                .code(request.code())
                .build();
    }
}
