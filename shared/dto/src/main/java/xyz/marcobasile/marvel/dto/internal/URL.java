package xyz.marcobasile.marvel.dto.internal;

import lombok.Data;

@Data
public class URL {

    /**
     * A text identifier for the URL.
     */
    private String type;

    /**
     * A full URL (including scheme, domain, and path).
     */
    private String url;

}
