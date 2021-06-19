package xyz.marcobasile.marvel.dto.response;

import lombok.Data;

import java.util.Collection;

@Data
public class ResultContainer<T> {

    /**
     * The requested offset (skipped results) of the call
     */
    private Integer offset;

    /**
     * The requested result limit
     */
    private Integer limit;

    /**
     * The total number of results available
     */
    private Integer total;

    /**
     * The total number of results returned by this call
     */
    private Integer count;

    /**
     * The list of entities returned by the call
     */
    private Collection<T> results;
}
