package xyz.marcobasile.marvel.client.config;

public class MarvelAPIConstants {

    public static class Characters {
        public static final String PATH = "/characters";
        public static final String PATTERN = "characterId";
        public static final String GET_ONE = "/characters/{characterId}";
        public static final String GET_ONE_COMICS = "/characters/{characterId}/comics";
        public static final String GET_ONE_EVENTS = "/characters/{characterId}/events";
        public static final String GET_ONE_SERIES = "/characters/{characterId}/series";
        public static final String GET_ONE_STORIES = "/characters/{characterId}/stories";
    }

    public static class Comics {
        public static final String PATH = "/comics";
        public static final String PATTERN = "comicId";
        public static final String GET_ONE = "/comics/{comicId}";
        public static final String GET_ONE_CHARACTERS = "/comics/{comicId}/characters";
        public static final String GET_ONE_CREATORS = "/comics/{comicId}/creators";
        public static final String GET_ONE_EVENTS = "/comics/{comicId}/events";
        public static final String GET_ONE_STORIES = "/comics/{comicId}/stories";
    }

    public static class Creators {
        public static final String PATH = "/creators";
        public static final String PATTERN = "creatorId";
        public static final String GET_ONE = "/creators/{creatorId}";
        public static final String GET_ONE_COMICS = "/creators/{creatorId}/comics";
        public static final String GET_ONE_EVENTS = "/creators/{creatorId}/events";
        public static final String GET_ONE_SERIES = "/creators/{creatorId}/series";
        public static final String GET_ONE_STORIES = "/creators/{creatorId}/stories";
    }
    public static class Events {

        public static final String PATH = "/events";
        public static final String PATTERN = "eventId";
        public static final String GET_ONE = "/events/{eventId}";
        public static final String GET_ONE_COMICS = "/events/{eventId}/comics";
        public static final String GET_ONE_CHARACTERS = "/events/{eventId}/characters";
        public static final String GET_ONE_CREATORS = "/events/{eventId}/creators";
        public static final String GET_ONE_SERIES = "/events/{eventId}/series";
        public static final String GET_ONE_STORIES = "/events/{eventId}/stories";
    }

    public static class Series {
        public static final String PATH = "/series";
        public static final String PATTERN = "seriesId";
        public static final String GET_ONE = "/series/{seriesId}";
        public static final String GET_ONE_CHARACTERS = "/series/{seriesId}/characters";
        public static final String GET_ONE_COMICS = "/series/{seriesId}/comics";
        public static final String GET_ONE_CREATORS = "/series/{seriesId}/creators";
        public static final String GET_ONE_EVENTS = "/series/{seriesId}/events";
        public static final String GET_ONE_STORIES = "/series/{seriesId}/stories";
    }

    public static class Stories {
        public static final String PATH = "/stories";
        public static final String PATTERN = "storyId";
        public static final String GET_ONE = "/stories/{storyId}";
        public static final String GET_ONE_CHARACTERS = "/stories/{storyId}/characters";
        public static final String GET_ONE_COMICS = "/stories/{storyId}/comics";
        public static final String GET_ONE_CREATORS = "/stories/{storyId}/creators";
        public static final String GET_ONE_EVENTS = "/stories/{storyId}/events";
        public static final String GET_ONE_SERIES = "/stories/{storyId}/series";
    }
}
