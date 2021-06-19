package xyz.marcobasile.marvel.dto.entity;

import lombok.Data;
import xyz.marcobasile.marvel.dto.internal.Image;
import xyz.marcobasile.marvel.dto.internal.MarvelEntitySummary;
import xyz.marcobasile.marvel.dto.internal.ResourceList;

import java.util.Date;

/**
 * Comics are made up of stories, which are indivisible components of comics.
 * Most comics have two stories - a cover and an interior story - but many, such
 * as anthology comics and collections, will have more. Stories may be re-published
 * in several comics, but the comic in which they originally appeared will always be
 * present as a data point.
 */
@Data
public class Story {

    /**
     * The unique ID of the story resource.
     */
    private String id;

    /**
     * The story title.
     */
    private String title;

    /**
     * A short description of the story.
     */
    private String description;

    /**
     * The canonical URL identifier for this resource.
     */
    private String resourceURI;

    /**
     * The story type e.g. interior story, cover, text story.
     */
    private String type;

    /**
     * The date the resource was most recently modified.
     */
    private Date modified;

    /**
     * The representative image for this story.
     */
    private Image thumbnail;

    /**
     * A resource list containing comics in which this story takes place.
     */
    private ResourceList<Comic> comics;

    /**
     * A resource list containing series in which this story appears.
     */
    private ResourceList<Series> series;

    /**
     * A resource list of the events in which this story appears.
     */
    private ResourceList<Event> events;

    /**
     * A resource list of characters which appear in this story.
     */
    private ResourceList<Character> characters;

    /**
     * A resource list of creators who worked on this story.
     */
    private ResourceList<Creator> creators;

    /**
     * A summary representation of the issue in which this story was originally published.
     */
    private MarvelEntitySummary<Comic> originalissue;
}
