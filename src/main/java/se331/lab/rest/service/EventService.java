package se331.lab.rest.service;

import java.util.List;

import se331.lab.rest.entity.Event;

public interface EventService {
    Integer getEventSize();

    List<Event> getEvents(Integer pageSize, Integer page);

    Event getEvent(Long id);
}