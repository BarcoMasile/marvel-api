package xyz.marcobasile.marvel.dto.internal;

import lombok.Data;

import java.util.Collection;

@Data
public class MarvelEntityList<T> {

    /**
     * The number of total available issues in this list. Will always be greater than or equal
     * to the "returned" value.
     */
    private Integer available;

    /**
     * The number of issues returned in this collection (up to 20).
     */
    private Integer returned;

    /**
     * The path to the full list of issues in this collection.
     */
    private String collectionURI;

    /**
     * The list of returned entities in this collection.
     */
    private Collection<MarvelEntitySummary<T>> items;
}
