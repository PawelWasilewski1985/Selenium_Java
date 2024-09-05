package config;

public enum ApplicationURL {

    GOOGLE("https://www.google.com"),
    FACEBOOK("https://www.facebook.com"),
    AMAZON("https://www.amazon.com"),
    AUTOMATIONEXERCISE("https://automationexercise.com/");

    private final String url;

    ApplicationURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
