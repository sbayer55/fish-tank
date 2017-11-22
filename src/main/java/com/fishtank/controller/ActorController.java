package com.fishtank.controller;

import com.fishtank.model.Actor;
import com.fishtank.service.ActorService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping(value = "/api/actor")
@RestController
public class ActorController {

    private ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Returns a list of all Actors in main loop",
                  response = Actor.class,
                  responseContainer = "List")
    public List<Actor> getActors() {
        return actorService.getActorList();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Add an Actor to main loop")
    public HttpStatus add(Actor actor) {
        actorService.getActorList().add(actor);
        return HttpStatus.ACCEPTED;
    }
}
