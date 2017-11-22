package com.fishtank.event;

import com.fishtank.model.Actor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@AllArgsConstructor
@Getter
public class ActorCreatedEvent extends ApplicationEvent {
    private Actor actor;
}
