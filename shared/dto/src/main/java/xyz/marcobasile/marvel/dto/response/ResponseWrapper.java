package xyz.marcobasile.marvel.dto.response;

import lombok.Data;

@Data
public class ResponseWrapper<T> {
    /**
     * The HTTP status code of the returned result
     */
    private Integer code;
    /**
     * A string description of the call status
     */
    private String status;
    /**
     * The results returned by the call
     */
    private ResultContainer<T> data;
    /**
     * A digest value of the content
     */
    private String etag;
    /**
     * The copyright notice for the returned result
     */
    private String copyright;
    /**
     * The attribution notice for this result
     */
    private String attributionText;

    /**
     * An HTML representation of the attribution notice for this result
     */
    private String attributionHTML;

    public boolean isSuccessful() {
        return code < 300;
    }
}
