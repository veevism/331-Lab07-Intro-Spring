package se331.lab.rest.dao;

import java.util.List;

import se331.lab.rest.entity.Event;

public interface EventDao {
    Integer getEventSize();

    List<Event> getEvents(Integer pageSize, Integer page);

    Event getEvent(Long id);
}