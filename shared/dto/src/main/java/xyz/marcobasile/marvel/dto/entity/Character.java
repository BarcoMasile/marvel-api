package xyz.marcobasile.marvel.dto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import xyz.marcobasile.marvel.dto.internal.Image;
import xyz.marcobasile.marvel.dto.internal.ResourceList;
import xyz.marcobasile.marvel.dto.internal.URL;
import xyz.marcobasile.marvel.dto.jackson.deserializer.ZonedDateTimeDeserializer;

import java.time.ZonedDateTime;
import java.util.Collection;

@Data
public class Character {

    /**
     * The unique ID of the character resource.
     */
    private Integer id;

    /**
     * The name of the character.
     */
    private String name;

    /**
     * A short bio or description of the character.
     */
    private String description;

    /**
     * The date the resource was most recently modified.
     */
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class, as = ZonedDateTime.class)
    private ZonedDateTime modified;

    /**
     * The canonical URL identifier for this resource.
     */
    private String resourceURI;

    /**
     * A set of public web site URLs for the resource.
     */
    private Collection<URL> urls;

    /**
     * The representative image for this character.
     */
    private Image thumbnail;

    /**
     * A resource list containing comics which feature this character.
     */
    private ResourceList<Comic> comics;

    /**
     * A resource list of stories in which this character appears.
     */
    private ResourceList<Story> stories;

    /**
     * A resource list of events in which this character appears.
     */
    private ResourceList<Event> events;

    /**
     * A resource list of series in which this character appears.
     */
    private ResourceList<Series> series;
}
