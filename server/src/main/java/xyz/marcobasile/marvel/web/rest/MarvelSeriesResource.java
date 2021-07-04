package xyz.marcobasile.marvel.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.marcobasile.marvel.client.feign.MarvelSeries;
import xyz.marcobasile.marvel.dto.entity.Series;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping(MarvelSeriesResource.RESOURCE_PATH)
public class MarvelSeriesResource {

    public static final String RESOURCE_PATH = "/api/v1/series";

    private final MarvelSeries seriesClient;

    @GetMapping
    public ResponseEntity<Collection<Series>> get() {
        ResponseWrapper<Series> results = seriesClient.getSeries();
        return ResponseEntity.ok(results.getData().getResults());
    }
}
