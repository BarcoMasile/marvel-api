package xyz.marcobasile.marvel.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.marcobasile.marvel.dto.entity.Character;
import xyz.marcobasile.marvel.dto.entity.*;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import static xyz.marcobasile.marvel.client.config.MarvelAPIConstants.Creators.*;

@FeignClient(name = "creatorsClient", url = "${marvel.base-url}")
public interface MarvelCreators {

    @GetMapping(value = PATH + "?limit={limit}&offset={offset}")
    ResponseWrapper<Creator> getCreators(@PathVariable("offset") Long offset, @PathVariable("limit") Long limit);

    default ResponseWrapper<Creator> getCreators() {
        return getCreators(0L, 50L);
    }

    @GetMapping(value = GET_ONE)
    ResponseWrapper<Character> getCreatorsById(@PathVariable(PATTERN) Long creatorId);

    @GetMapping(value = GET_ONE_COMICS)
    ResponseWrapper<Character> getCreatorsCharacters(@PathVariable(PATTERN) Long creatorId);

    @GetMapping(value = GET_ONE_EVENTS)
    ResponseWrapper<Event> getCreatorsEvents(@PathVariable(PATTERN) Long creatorId);

    @GetMapping(value = GET_ONE_SERIES)
    ResponseWrapper<Series> getCreatorsSeries(@PathVariable(PATTERN) Long creatorId);

    @GetMapping(value = GET_ONE_STORIES)
    ResponseWrapper<Story> getCreatorsStories(@PathVariable(PATTERN) Long creatorId);
}
