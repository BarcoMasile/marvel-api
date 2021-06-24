package xyz.marcobasile.marvel.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.marcobasile.marvel.client.feign.MarvelCharacters;
import xyz.marcobasile.marvel.dto.entity.Character;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping(MarvelCharactersResource.RESOURCE_PATH)
public class MarvelCharactersResource {

    public static final String RESOURCE_PATH = "/api/v1/characters";

    private final MarvelCharacters charactersClient;

    @GetMapping
    public ResponseEntity<Collection<Character>> get() {
        return ResponseEntity.ok(charactersClient.getCharacters().getData().getResults());
    }

}

