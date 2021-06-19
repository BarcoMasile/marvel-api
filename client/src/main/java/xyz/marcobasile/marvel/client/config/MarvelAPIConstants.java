package xyz.marcobasile.marvel.client.config;

public class MarvelAPIConstants {

    public static class Characters {
        public static String PATH = "/characters";
        public static String PATTERN = "{characterId}";
        public static String GET_ONE = "/characters/{characterId}";
        public static String GET_ONE_COMICS = "/characters/{characterId}/comics";
        public static String GET_ONE_EVENTS = "/characters/{characterId}/events";
        public static String GET_ONE_SERIES = "/characters/{characterId}/series";
        public static String GET_ONE_STORIES = "/characters/{characterId}/stories";
    }

    public static class Comics {
        public static String PATH = "/comics";
        public static String PATTERN = "{comicId}";
        public static String GET_ONE = "/comics/{comicId}";
        public static String GET_ONE_CHARACTERS = "/comics/{comicId}/characters";
        public static String GET_ONE_CREATORS = "/comics/{comicId}/creators";
        public static String GET_ONE_EVENTS = "/comics/{comicId}/events";
        public static String GET_ONE_STORIES = "/comics/{comicId}/stories";
    }

    public static class Creators {
        public static String PATH = "/creators";
        public static String PATTERN = "{creatorId}";
        public static String GET_ONE = "/creators/{creatorId}";
        public static String GET_ONE_COMICS = "/creators/{creatorId}/comics";
        public static String GET_ONE_EVENTS = "/creators/{creatorId}/events";
        public static String GET_ONE_SERIES = "/creators/{creatorId}/series";
        public static String GET_ONE_STORIES = "/creators/{creatorId}/stories";
    }
    public static class Events {

        public static String PATH = "/events";
        public static String PATTERN = "{eventId}";
        public static String GET_ONE = "/events/{eventId}";
        public static String GET_ONE_COMICS = "/events/{eventId}/comics";
        public static String GET_ONE_CHARACTERS = "/events/{eventId}/characters";
        public static String GET_ONE_CREATORS = "/events/{eventId}/creators";
        public static String GET_ONE_SERIES = "/events/{eventId}/series";
        public static String GET_ONE_STORIES = "/events/{eventId}/stories";
    }

    public static class Series {
        public static String PATH = "/series";
        public static String PATTERN = "{seriesId}";
        public static String GET_ONE = "/series/{seriesId}";
        public static String GET_ONE_CHARACTERS = "/series/{seriesId}/characters";
        public static String GET_ONE_COMICS = "/series/{seriesId}/comics";
        public static String GET_ONE_CREATORS = "/series/{seriesId}/creators";
        public static String GET_ONE_EVENTS = "/series/{seriesId}/events";
        public static String GET_ONE_STORIES = "/series/{seriesId}/stories";
    }

    public static class Stories {
        public static String PATH = "/stories";
        public static String PATTERN = "{storyId}";
        public static String GET_ONE = "/stories/{storyId}";
        public static String GET_ONE_CHARACTERS = "/stories/{storyId}/characters";
        public static String GET_ONE_COMICS = "/stories/{storyId}/comics";
        public static String GET_ONE_CREATORS = "/stories/{storyId}/creators";
        public static String GET_ONE_EVENTS = "/stories/{storyId}/events";
        public static String GET_ONE_SERIES = "/stories/{storyId}/series";
    }
}
