package com.enesharman.api.service;

import com.enesharman.api.dto.EventFireRequest;

public interface EventService {
    void fireEvent(EventFireRequest request);
}
