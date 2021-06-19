package xyz.marcobasile.marvel.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(MarvelCharactersResource.RESOURCE_PATH)
public class MarvelCharactersResource {

    public static final String RESOURCE_PATH = "/api/v1/characters";

}

