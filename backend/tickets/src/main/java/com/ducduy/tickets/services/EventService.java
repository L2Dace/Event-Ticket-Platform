package com.ducduy.tickets.services;

import com.ducduy.tickets.domain.CreateEventRequest;
import com.ducduy.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
