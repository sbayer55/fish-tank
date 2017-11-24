package com.fishtank.event;

import com.fishtank.model.Actor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class ActorCreatedEvent extends ApplicationEvent {
    private Actor actor;

    public ActorCreatedEvent(Object source, Actor actor) {
        super(source);
        this.actor = actor;
    }
}
