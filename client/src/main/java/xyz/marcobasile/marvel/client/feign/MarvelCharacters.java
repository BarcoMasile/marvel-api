package xyz.marcobasile.marvel.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.marcobasile.marvel.dto.entity.Character;
import xyz.marcobasile.marvel.dto.entity.*;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import static xyz.marcobasile.marvel.client.config.MarvelAPIConstants.Characters.*;

@FeignClient(name = "charactersClient", url = "${marvel.base-url}")
public interface MarvelCharacters {

    @GetMapping(value = PATH + "?limit={limit}&offset={offset}")
    ResponseWrapper<Character> getCharacters(@PathVariable("offset") Long offset, @PathVariable("limit") Long limit);

    default ResponseWrapper<Character> getCharacters() {
        return getCharacters(0L, 50L);
    }

    @GetMapping(value = GET_ONE)
    ResponseWrapper<Character> getCharacterById(@PathVariable(PATTERN) Long characterId);

    @GetMapping(value = GET_ONE_COMICS)
    ResponseWrapper<Comic> getCharacterComics(@PathVariable(PATTERN) Long characterId);

    @GetMapping(value = GET_ONE_EVENTS)
    ResponseWrapper<Event> getCharacterEvents(@PathVariable(PATTERN) Long characterId);

    @GetMapping(value = GET_ONE_SERIES)
    ResponseWrapper<Series> getCharacterSeries(@PathVariable(PATTERN) Long characterId);

    @GetMapping(value = GET_ONE_STORIES)
    ResponseWrapper<Story> getCharacterStories(@PathVariable(PATTERN) Long characterId);
}
