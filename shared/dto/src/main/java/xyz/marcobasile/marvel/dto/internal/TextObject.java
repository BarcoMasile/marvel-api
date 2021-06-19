package xyz.marcobasile.marvel.dto.internal;

import lombok.Data;

@Data
public class TextObject {

    /**
     * 	The string description of the text object (e.g. solicit text, preview text, etc.).
     */
    private String type;

    /**
     * A language code denoting which language the text object is written in.
     */
    private String language;

    /**
     * The text of the text object.
     */
    private String text;
}
