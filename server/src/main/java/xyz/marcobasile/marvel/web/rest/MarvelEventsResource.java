package xyz.marcobasile.marvel.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.marcobasile.marvel.client.feign.MarvelEvents;
import xyz.marcobasile.marvel.dto.entity.Event;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping(MarvelEventsResource.RESOURCE_PATH)
public class MarvelEventsResource {

    public static final String RESOURCE_PATH = "/api/v1/events";

    private final MarvelEvents eventsClient;

    @GetMapping
    public ResponseEntity<Collection<Event>> get() {
        ResponseWrapper<Event> results = eventsClient.getEvents();
        return ResponseEntity.ok(results.getData().getResults());
    }
}
