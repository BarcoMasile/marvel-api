package xyz.marcobasile.marvel.dto.internal;

public enum ImageVariants {

    // Portrait
    portrait_small("50x75px"),
    portrait_medium("100x150px"),
    portrait_xlarge("150x225px"),
    portrait_fantastic("168x252px"),
    portrait_uncanny("300x450px"),
    portrait_incredible("216x324px"),

    // Standard
    standard_small("65x45px"),
    standard_medium("100x100px"),
    standard_large("140x140px"),
    standard_xlarge("200x200px"),
    standard_fantastic("250x250px"),
    standard_amazing("180x180px"),

    // Landscape
    landscape_small("120x90px"),
    landscape_medium("175x130px"),
    landscape_large("190x140px"),
    landscape_xlarge("270x200px"),
    landscape_amazing("250x156px"),
    landscape_incredible("464x261px"),

    detail("full image, constrained to 500px wide"),
    full_size("full image, no restriction");

    private final String description;

    ImageVariants(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
