package xyz.marcobasile.marvel.dto.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import xyz.marcobasile.marvel.dto.internal.*;
import xyz.marcobasile.marvel.dto.jackson.deserializer.ZonedDateTimeDeserializer;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Collection;

/**
 * Comic issues (or just comics) are the physical or digital products
 * that end-users read. (The Marvel Comics API returns comic issues,
 * collections, graphic novels and digital comics as part of the overall
 * comics endpoint and entity type.)
 */
@Data
public class Comic {

    /**
     * The unique ID of the comic resource.
     */
    private Integer id;

    /**
     * The ID of the digital comic representation of this comic. Will be 0 if the comic is not available digitally.
     */
    private Integer digitalId;

    /**
     * The canonical title of the comic.
     */
    private String title;

    /**
     * The number of the issue in the series (will generally be 0 for collection formats).
     */
    private Integer issueNumber;

    /**
     * If the issue is a variant (e.g. an alternate cover, second printing, or director's cut), a text description of the variant.
     */
    private String variantDescription;

    /**
     * The preferred description of the comic.
     */
    private String description;

    /**
     * The date the resource was most recently modified.
     */
    @JsonDeserialize(using = ZonedDateTimeDeserializer.class, as = ZonedDateTime.class)
    private ZonedDateTime modified;

    /**
     * The ISBN for the comic (generally only populated for collection formats).
     */
    private String isbn;

    /**
     * The UPC barcode number for the comic (generally only populated for periodical formats).
     */
    private String upc;

    /**
     * The Diamond code for the comic.
     */
    private String diamondCode;

    /**
     * The EAN barcode for the comic.
     */
    private String ean;

    /**
     * The ISSN barcode for the comic.
     */
    private String issn;

    /**
     * The publication format of the comic e.g. comic, hardcover, trade paperback.
     */
    private String format;

    /**
     * The number of story pages in the comic.
     */
    private Integer pageCount;

    /**
     * A set of descriptive text blurbs for the comic.
     */
    private Collection<TextObject> textObjects;

    /**
     * The canonical URL identifier for this resource.
     */
    private String resourceURI;

    /**
     * A set of public web site URLs for the resource.
     */
    private Collection<URL> urls;

    /**
     * A summary representation of the series to which this comic belongs.
     */
    private Collection<MarvelEntitySummary<Series>> series;

    /**
     * A list of variant issues for this comic (includes the "original" issue if the current issue is a variant).
     */
    private Collection<MarvelEntitySummary<Comic>> variants;

    /**
     * A list of collections which include this comic (will generally be empty if the comic's format is a collection).
     */
    private Collection<MarvelEntitySummary<Comic>> collections;

    /**
     * A list of issues collected in this comic (will generally be empty for periodical formats such as "comic" or "magazine").
     */
    private Collection<MarvelEntitySummary<Comic>> collectedIssues;

    /**
     * A list of key dates for this comic.
     */
    private Collection<ComicDate> dates;

    /**
     * A list of prices for this comic
     */
    private Collection<ComicPrice> prices;

    /**
     * The representative image for this comic.
     */
    private Image thumbnail;

    /**
     * A list of promotional images associated with this comic.
     */
    private Collection<Image> images;

    /**
     * A resource list containing the creators associated with this comic.
     */
    private Collection<ResourceList<Creator>> creators;

    /**
     * A resource list containing the characters which appear in this comic.
     */
    private Collection<ResourceList<Character>> characters;

    /**
     * A resource list containing the stories which appear in this comic.
     */
    private Collection<ResourceList<Story>> stories;

    /**
     * A resource list containing the events in which this comic appears.
     */
    private Collection<ResourceList<Event>> events;
}
