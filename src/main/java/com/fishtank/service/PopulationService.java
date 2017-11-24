package com.fishtank.service;

import com.fishtank.event.ActorCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PopulationService implements ApplicationListener<ActorCreatedEvent> {

    private int population;

    @Autowired
    public PopulationService() {
    }

    @Override
    public void onApplicationEvent(ActorCreatedEvent event) {
        population++;
        log.info("Actor {} added to g-pop {}", event.getActor().getName(), population);
    }
}
