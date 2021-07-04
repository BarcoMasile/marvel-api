package xyz.marcobasile.marvel.dto.internal;

import lombok.Data;

import java.util.Collection;

@Data
public class ResourceList<T> {

    /**
     * The number of total available resources in this list
     */
    private Integer available;

    /**
     * The number of resources returned in this resource list (up to 20).
     */
    private Integer returned;

    /**
     * The path to the list of full view representations of the items in this resource list.
     */
    private String collectionURI;

    /**
     * A list of summary views of the items in this resource list.
     */
    private Collection<MarvelEntitySummary<T>> items;

}
