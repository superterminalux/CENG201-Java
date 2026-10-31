/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 * Your Name:        ___________________________
 * Your Student ID:  240446034
 * Your Date:        05.10.26
 */

package Lab_1.Exercise_1;

public class Track {

    // -------------------------------------------------------
    // Instance variables
    // -------------------------------------------------------
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    // -------------------------------------------------------
    // Full constructor
    // -------------------------------------------------------
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        // Transfers the definitions to the object
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        // Checks the duration if it's smaller than 0
        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    // -------------------------------------------------------
    // Title & artist constructor
    // -------------------------------------------------------
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // -------------------------------------------------------
    // Title-only constructor.
    // -------------------------------------------------------
    public Track(String title) {
        this(title, "Unkown Artist", 0, false);
    }

    // -------------------------------------------------------
    // Default constructor.
    // -------------------------------------------------------
    public Track() {
        this ("Unknown Title", "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 5: Getters for all four fields.
    // -------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // -------------------------------------------------------
    // TODO 6: getDurationFormatted()
    // -------------------------------------------------------
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;

        return String.format("%d:%02d", minutes, seconds);
    }

    // -------------------------------------------------------
    // TODO 7: toString()
    // -------------------------------------------------------
    @Override
    public String toString() {
        String trackInfo = "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "] ";
        // Checks the content of the music
        if (isExplicit) {
            trackInfo += "[EXPLICIT]";
        }
        return trackInfo;
    }
}