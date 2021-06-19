package xyz.marcobasile.marvel.dto.entity;

import lombok.Data;
import xyz.marcobasile.marvel.dto.internal.Image;
import xyz.marcobasile.marvel.dto.internal.MarvelEntitySummary;
import xyz.marcobasile.marvel.dto.internal.ResourceList;
import xyz.marcobasile.marvel.dto.internal.URL;

import java.util.Collection;
import java.util.Date;

/**
 * Comics can also be a part of an event, which is a big, universe-changing storyline.
 * A comic's appearance in an event is often independent of its membership in a series.
 */
@Data
public class Event {

    /**
     * The unique ID of the event resource.
     */
    private Integer id;
    /**
     * The canonical title of the series.
     */
    private String title;
    /**
     * A description of the series.
     */
    private String description;
    /**
     * The canonical URL identifier for this resource.
     */
    private String resourceURI;
    /**
     * A set of public web site URLs for the resource.
     */
    private Collection<URL> urls;
    /**
     * The date the resource was most recently modified.
     */
    private Date modified;
    /**
     * The date of publication of the first issue in this event.
     */
    private Date start;
    /**
     * The date of publication of the last issue in this event.
     */
    private Date end;
    /**
     * The representative image for this event.
     */
    private Image thumbnail;
    /**
     * A resource list containing the comics in this event.
     */
    private ResourceList<Comic> comics;
    /**
     * A resource list containing the stories in this event.
     */
    private ResourceList<Story> stories;
    /**
     * A resource list containing the series in this event.
     */
    private ResourceList<Series> series;
    /**
     * A resource list containing the characters which appear in this event.
     */
    private ResourceList<Character> characters;
    /**
     * A resource list containing creators whose work appears in this event.
     */
    private ResourceList<Creator> creators;
    /**
     * A summary representation of the event which follows this event.
     */
    private MarvelEntitySummary<Event> next;
    /**
     * A summary representation of the event which preceded this event.
     */
    private MarvelEntitySummary<Event> previous;
}
