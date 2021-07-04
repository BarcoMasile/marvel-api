package xyz.marcobasile.marvel.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.marcobasile.marvel.client.feign.MarvelComics;
import xyz.marcobasile.marvel.dto.entity.Comic;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping(MarvelComicsResource.RESOURCE_PATH)
public class MarvelComicsResource {

    public static final String RESOURCE_PATH = "/api/v1/comics";

    private final MarvelComics comicsClient;

    @GetMapping
    public ResponseEntity<Collection<Comic>> get() {
        ResponseWrapper<Comic> results = comicsClient.getComics();
        return ResponseEntity.ok(results.getData().getResults());
    }
}

