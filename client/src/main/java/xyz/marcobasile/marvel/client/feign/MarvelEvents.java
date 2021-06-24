package xyz.marcobasile.marvel.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.marcobasile.marvel.dto.entity.Character;
import xyz.marcobasile.marvel.dto.entity.*;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import static xyz.marcobasile.marvel.client.config.MarvelAPIConstants.Events.*;

@FeignClient(name = "eventsClient", url = "${marvel.base-url}")
public interface MarvelEvents {

    @GetMapping(value = PATH + "?limit={limit}&offset={offset}")
    ResponseWrapper<Event> getEvents(Long offset, Long limit);

    default ResponseWrapper<Event> getEvents() {
        return getEvents(0L, 50L);
    }

    @GetMapping(value = GET_ONE)
    ResponseWrapper<Event> getEventById(@PathVariable(PATTERN) Long eventId);

    @GetMapping(value = GET_ONE_CHARACTERS)
    ResponseWrapper<Character> getEventCharacters(@PathVariable(PATTERN) Long eventId);

    @GetMapping(value = GET_ONE_COMICS)
    ResponseWrapper<Comic> getEventComics(@PathVariable(PATTERN) Long eventId);

    @GetMapping(value = GET_ONE_SERIES)
    ResponseWrapper<Series> getEventSeries(@PathVariable(PATTERN) Long eventId);

    @GetMapping(value = GET_ONE_CREATORS)
    ResponseWrapper<Creator> getEventCreators(@PathVariable(PATTERN) Long eventId);

    @GetMapping(value = GET_ONE_STORIES)
    ResponseWrapper<Story> getEventStories(@PathVariable(PATTERN) Long eventId);
}
