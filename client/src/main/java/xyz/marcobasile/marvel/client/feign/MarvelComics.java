package xyz.marcobasile.marvel.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.marcobasile.marvel.dto.entity.Character;
import xyz.marcobasile.marvel.dto.entity.*;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import static xyz.marcobasile.marvel.client.config.MarvelAPIConstants.Comics.*;

@FeignClient(name = "comicsClient", url = "${marvel.base-url}")
public interface MarvelComics {

    @GetMapping(value = PATH + "?limit={limit}&offset={offset}")
    ResponseWrapper<Comic> getComics(Long offset, Long limit);

    default ResponseWrapper<Comic> getComics() {
        return getComics(0L, 50L);
    }

    @GetMapping(value = GET_ONE)
    ResponseWrapper<Character> getComicById(@PathVariable(PATTERN) Long comicId);

    @GetMapping(value = GET_ONE_CHARACTERS)
    ResponseWrapper<Character> getComicCharacters(@PathVariable(PATTERN) Long comicId);

    @GetMapping(value = GET_ONE_EVENTS)
    ResponseWrapper<Event> getComicEvents(@PathVariable(PATTERN) Long comicId);

    @GetMapping(value = GET_ONE_CREATORS)
    ResponseWrapper<Creator> getComicSeries(@PathVariable(PATTERN) Long comicId);

    @GetMapping(value = GET_ONE_STORIES)
    ResponseWrapper<Story> getComicStories(@PathVariable(PATTERN) Long comicId);
}
