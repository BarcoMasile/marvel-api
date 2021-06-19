package xyz.marcobasile.marvel.dto.entity;

import lombok.Data;
import xyz.marcobasile.marvel.dto.internal.Image;
import xyz.marcobasile.marvel.dto.internal.MarvelEntitySummary;
import xyz.marcobasile.marvel.dto.internal.ResourceList;
import xyz.marcobasile.marvel.dto.internal.URL;

import java.util.Collection;
import java.util.Date;

/**
 * Comics belong to a series, which is a (usually) sequentially number list of
 * comics with the same title and volume. Marvel uses the year of original
 * publication for a series as the volume number.
 */
@Data
public class Series {

    /**
     * The unique ID of the series resource.
     */
    private String id;
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
     * The first year of publication for the series.
     */
    private Integer startYear;
    /**
     * The last year of publication for the series (conventionally, 2099 for ongoing series).
     */
    private Integer endYear;
    /**
     * The age-appropriateness rating for the series.
     */
    private String rating;
    /**
     * The date the resource was most recently modified.
     */
    private Date modified;
    /**
     * The representative image for this series.
     */
    private Image thumbnail;
    /**
     * A resource list containing comics in this series.
     */
    private ResourceList<Comic> comics;
    /**
     * A resource list containing stories which occur in comics in this series.
     */
    private ResourceList<Story> stories;
    /**
     * A resource list containing events which take place in comics in this series.
     */
    private ResourceList<Event> events;
    /**
     * A resource list containing characters which appear in comics in this series.
     */
    private ResourceList<Character> characters;
    /**
     * A resource list of creators whose work appears in comics in this series.
     */
    private ResourceList<Creator> creators;
    /**
     * A summary representation of the series which follows this series.
     */
    private MarvelEntitySummary<Series> next;
    /**
     * A summary representation of the series which preceded this series.
     */
    private MarvelEntitySummary<Series> previous;

    public boolean isStillGoing() {
        return endYear.equals(2099);
    }
}
