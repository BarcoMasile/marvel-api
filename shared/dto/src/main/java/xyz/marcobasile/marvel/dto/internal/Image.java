package xyz.marcobasile.marvel.dto.internal;

import lombok.Data;

@Data
public class Image {

    /**
     * The directory path of to the image.
     */
    private String path;

    /**
     * The file extension for the image.
     */
    private String extension;
}
