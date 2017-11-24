package com.fishtank.service;

import com.fishtank.event.ActorCreatedEvent;
import com.fishtank.model.Actor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.EventListener;
import java.util.LinkedList;

@Component
@Getter
@Setter
public class ActorService {

    @NonNull
    private LinkedList<Actor> actorList;
    private ApplicationEventPublisher publisher;

    public ActorService(ApplicationEventPublisher publisher) {
        this.actorList = new LinkedList<Actor>();
        this.publisher = publisher;
    }

    public void addActor(Actor actor) {
        actorList.add(actor);
        ActorCreatedEvent actorCreatedEvent = new ActorCreatedEvent(this, actor);
        publisher.publishEvent(actorCreatedEvent);
    }
}
