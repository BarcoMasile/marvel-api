package xyz.marcobasile.marvel.dto.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import xyz.marcobasile.marvel.dto.internal.Image;
import xyz.marcobasile.marvel.dto.internal.ResourceList;
import xyz.marcobasile.marvel.dto.internal.URL;
import xyz.marcobasile.marvel.dto.jackson.deserializer.ZonedDateTimeDeserializer;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Collection;

/**
 * Creators are the people and entities that make comics. They are assigned
 * to the specific comic stories on which they worked, but we bubble up those
 * assignments to the issues, series and events in which the stories appear as a convenience.
 */
@Data
public class Creator {

    /**
     * The unique ID of the creator resource.
     */
    private Integer id;

    /**
     * The first name of the creator.
     */
    private String firstName;

    /**
     * The middle name of the creator.
     */
    private String middleName;

    /**
     * The last name of the creator.
     */
    private String lastName;

    /**
     * The suffix or honorific for the creator.
     */
    private String suffix;

    /**
     * The full name of the creator (a space-separated concatenation of the above four fields).
     */
    private String fullName;

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
     * The representative image for this creator.
     */
    private Image thumbnail;

    /**
     * A resource list of series which feature work by this creator.
     */
    private Collection<ResourceList<Series>> series;

    /**
     * A resource list of stories which feature work by this creator.
     */
    private Collection<ResourceList<Story>> stories;

    /**
     * A resource list containing comics which which feature work by this creator.
     */
    private Collection<ResourceList<Comic>> comics;

    /**
     * A resource list of events which feature work by this creator.
     */
    private Collection<ResourceList<Event>> events;
}
