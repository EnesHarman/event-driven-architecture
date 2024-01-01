package com.enesharman.api.controller;

import com.enesharman.api.service.EventService;
import com.enesharman.api.dto.EventFireRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("/fire")
    public void fire(@RequestBody EventFireRequest request) {
        eventService.fireEvent(request);
    }
}
