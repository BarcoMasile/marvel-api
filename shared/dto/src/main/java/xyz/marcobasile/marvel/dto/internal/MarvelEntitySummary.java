package xyz.marcobasile.marvel.dto.internal;

import lombok.Data;

@Data
public class MarvelEntitySummary<T> {

    /**
     * URI pointing to the full representation of the referenced entity
     */
    private String resourceURI;

    /**
     * Name, for convenience
     */
    private String name;
}
