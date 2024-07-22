package music;

/**
 * Represents a track in a music library.
 * This is an immutable object, because track information should not change.
 */
public class Track {
    private final String title;
    private final String artist;
    private final String album;
    private final int year;
    private final Duration duration;

    /**
     * Creates a new track
     * 
     * @param title the title of the track
     * @param artist the artist of the track
     * @param album the album of the track
     * @param year the year of the track
     * @param duration the duration of the track in seconds
     * @throws IllegalArgumentException if any of the parameters are invalid
     */
    public Track(String title, String artist, String album, int year, Duration duration) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid title");
        }
        if (artist == null || artist.isBlank()) {
            throw new IllegalArgumentException("Invalid artist");
        }
        if (album == null || album.isBlank()) {
            throw new IllegalArgumentException("Invalid album");
        }
        if (year < 0) {
            throw new IllegalArgumentException("Invalid year");
        }
        if (duration == null) {
            throw new IllegalArgumentException("Invalid duration");
        }
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getAlbum() {
        return album;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return title + " - " + artist + " (" + album + ", " + year + ") " + duration;
    }
}
