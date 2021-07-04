package xyz.marcobasile.marvel.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.marcobasile.marvel.client.feign.MarvelCreators;
import xyz.marcobasile.marvel.dto.entity.Creator;
import xyz.marcobasile.marvel.dto.response.ResponseWrapper;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping(MarvelCreatorsResource.RESOURCE_PATH)
public class MarvelCreatorsResource {

    public static final String RESOURCE_PATH = "/api/v1/creators";

    private final MarvelCreators creatorsClient;

    @GetMapping
    public ResponseEntity<Collection<Creator>> get() {
        ResponseWrapper<Creator> results = creatorsClient.getCreators();
        return ResponseEntity.ok(results.getData().getResults());
    }
}

