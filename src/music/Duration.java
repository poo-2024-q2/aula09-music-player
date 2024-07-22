package music;

/**
 * Represents a duration in seconds.
 * This is an immutable object, because the duration should not change.
 */
public class Duration {
    private final int duration;

    /**
     * Creates a new duration
     * 
     * @param duration the duration in seconds
     * @throws IllegalArgumentException if the duration is negative
     */
    public Duration(int duration) {
        if (duration < 0) {
            throw new IllegalArgumentException("Invalid duration");
        }
        this.duration = duration;
    }

    /**
     * Gets the duration in seconds
     * 
     * @return the duration in seconds
     */
    public int getSeconds() {
        return duration;
    }

    /**
     * Add a duration to the current duration
     * 
     * @param duration the duration to be added
     * @return a new duration with the sum of the durations
     */
    public Duration add(Duration duration) {
        return new Duration(this.duration + duration.getSeconds());
    }

    /**
     * Show the duration in the format (hh:mm:ss)
     */
    public String toString() {
        int hours = duration / 3600;
        int minutes = (duration % 3600) / 60;
        int seconds = duration % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
