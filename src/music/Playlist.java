package music;

import java.util.ArrayList;

/**
 * Represents a playlist of tracks.
 * 
 * This is a mutable object, as there are methods to add and remove tracks from
 * the playlist as well as change its title. 
 */
public class Playlist {
    private String title;
    private final ArrayList<Track> tracks;

    /**
     * Creates a new playlist
     * 
     * @param title the title of the playlist
     * @throws IllegalArgumentException if the title is invalid
     */
    public Playlist(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid title");
        }
        this.title = title;
        this.tracks = new ArrayList<>();
    }

    /**
     * Add a track to end of the playlist.
     * 
     * @param track the track to be added
     * @throws IllegalArgumentException if the track is invalid
     */
    public void addTrack(Track track) {
        if (track == null) {
            throw new IllegalArgumentException("Invalid track");
        }
        tracks.add(track);
    }

    /**
     * Remove a track from the playlist
     * 
     * @param track the track to be removed
     * @throws IllegalArgumentException if the track is invalid
     */
    public void removeTrack(Track track) {
        if (track == null) {
            throw new IllegalArgumentException("Invalid track");
        }
        tracks.remove(track);
    }

    /**
     * Gets the tracks in the playlist
     * 
     * @return an array of tracks
     */
    public Track[] getTracks() {
        /*
         * We use the toArray method to convert the ArrayList to an array of tracks.
         * In this way, we do not expose the internal representation of the playlist as an ArrayList.
         */
        return tracks.toArray(new Track[0]);
    }

    /**
     * Query the total duration of the playlist.
     * 
     * @return the total duration of the playlist in seconds
     */
    public Duration getDuration() {
        Duration total = new Duration(0);

        for (Track track : tracks) {
            total = total.add(track.getDuration());
        }

        return total;
    }

    /**
     * Get the title of the playlist.
     * 
     * @return the title of the playlist
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title of the playlist.
     * 
     * @param title the new title of the playlist
     * @throws IllegalArgumentException if the title is invalid
     */
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid title");
        }
        this.title = title;
    }

    /**
     * Get the number of tracks in the playlist.
     * 
     * @return the number of tracks in the playlist
     */
    public int getNumberOfTracks() {
        return tracks.size();
    }

    /**
     * Clear the playlist.
     */
    public void clear() {
        tracks.clear();
    }

    /**
     * String representation of the playlist.
     * The strings starts with the title of the playlist, followed by the duration in seconds.
     * Then, each track is listed with its index, title, artist, album, year and duration.
     */
    @Override
    public String toString() {
        /**
         * We use a StringBuilder to concatenate the strings, as it is more efficient than using the + operator
         * We should never use the + operator to concatenate strings in a loop, as it creates a new string each time
         * (Strings are immutable in Java, so each concatenation creates a new string in memory)
         */
        StringBuilder sb = new StringBuilder();
        int i = 1;

        sb.append(title).append(" (").append(getDuration()).append("s)\n");
        /**
         * We delegate the string representation of the track to the Track class
         * This is an example of separation of concerns, where each class is responsible for its own representation
         */
        for (Track track : tracks) {
            sb.append(i++ + ". ").append(track).append("\n");
        }

        return sb.toString();
    }
}
