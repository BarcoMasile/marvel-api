package xyz.marcobasile.marvel.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.marcobasile.marvel.dto.entity.Character;
import xyz.marcobasile.marvel.dto.entity.*;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import static xyz.marcobasile.marvel.client.config.MarvelAPIConstants.Stories.*;

@FeignClient(name = "storiesClient", url = "${marvel.base-url}")
public interface MarvelStories {

    @GetMapping(value = PATH + "?limit={limit}&offset={offset}")
    ResponseWrapper<Story> getStories(@PathVariable("offset") Long offset, @PathVariable("limit") Long limit);

    default ResponseWrapper<Story> getStories() {
        return getStories(0L, 50L);
    }

    @GetMapping(value = GET_ONE)
    ResponseWrapper<Story> getStoryById(@PathVariable(PATTERN) Long storyId);

    @GetMapping(value = GET_ONE_CHARACTERS)
    ResponseWrapper<Character> getStoryCharacters(@PathVariable(PATTERN) Long storyId);

    @GetMapping(value = GET_ONE_COMICS)
    ResponseWrapper<Comic> getStoryComics(@PathVariable(PATTERN) Long storyId);

    @GetMapping(value = GET_ONE_EVENTS)
    ResponseWrapper<Event> getStoryEvents(@PathVariable(PATTERN) Long storyId);

    @GetMapping(value = GET_ONE_CREATORS)
    ResponseWrapper<Creator> getStoryCreators(@PathVariable(PATTERN) Long storyId);

    @GetMapping(value = GET_ONE_SERIES)
    ResponseWrapper<Series> getStorySeries(@PathVariable(PATTERN) Long storyId);
}
