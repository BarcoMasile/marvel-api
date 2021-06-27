package xyz.marcobasile.marvel.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.marcobasile.marvel.dto.entity.Character;
import xyz.marcobasile.marvel.dto.entity.*;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import static xyz.marcobasile.marvel.client.config.MarvelAPIConstants.Series.*;

@FeignClient(name = "seriesClient", url = "${marvel.base-url}")
public interface MarvelSeries {

    @GetMapping(value = PATH + "?limit={limit}&offset={offset}")
    ResponseWrapper<Series> getSeries(@PathVariable("offset") Long offset, @PathVariable("limit") Long limit);

    default ResponseWrapper<Series> getSeries() {
        return getSeries(0L, 50L);
    }

    @GetMapping(value = GET_ONE)
    ResponseWrapper<Series> getSeriesById(@PathVariable(PATTERN) Long seriesId);

    @GetMapping(value = GET_ONE_CHARACTERS)
    ResponseWrapper<Character> getSeriesCharacters(@PathVariable(PATTERN) Long seriesId);

    @GetMapping(value = GET_ONE_COMICS)
    ResponseWrapper<Comic> getSeriesComics(@PathVariable(PATTERN) Long seriesId);

    @GetMapping(value = GET_ONE_EVENTS)
    ResponseWrapper<Event> getSeriesEvents(@PathVariable(PATTERN) Long seriesId);

    @GetMapping(value = GET_ONE_CREATORS)
    ResponseWrapper<Creator> getSeriesCreators(@PathVariable(PATTERN) Long seriesId);

    @GetMapping(value = GET_ONE_STORIES)
    ResponseWrapper<Story> getSeriesStories(@PathVariable(PATTERN) Long seriesId);
}
