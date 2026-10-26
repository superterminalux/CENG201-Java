/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 *
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
    private int    durationSeconds;
    private boolean isExplicit;

    // -------------------------------------------------------
    // TODO 1: Full constructor (all four parameters).
    //         Validate durationSeconds — must be >= 0.
    //         If invalid, print: "Warning: Invalid duration. Setting to 0."
    //         and set durationSeconds to 0.
    // -------------------------------------------------------
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        // Your code here
    }

    // -------------------------------------------------------
    // TODO 2: Title + artist constructor.
    //         Delegate to the full constructor using this(...).
    //         Default: durationSeconds = 0, isExplicit = false
    // -------------------------------------------------------
    public Track(String title, String artist) {
        // Your code here (one line using this(...))
    }

    // -------------------------------------------------------
    // TODO 3: Title-only constructor.
    //         Delegate to the full constructor using this(...).
    //         Default: artist = "Unknown Artist", duration = 0, explicit = false
    // -------------------------------------------------------
    public Track(String title) {
        // Your code here (one line using this(...))
    }

    // -------------------------------------------------------
    // TODO 4: Default constructor.
    //         Delegate to the full constructor using this(...).
    // -------------------------------------------------------
    public Track() {
        // Your code here (one line using this(...))
    }

    // -------------------------------------------------------
    // TODO 5: Getters for all four fields.
    // -------------------------------------------------------


    // -------------------------------------------------------
    // TODO 6: getDurationFormatted()
    //         Returns duration as "m:ss" — ex., 225 seconds -> "3:45"
    //         Hint: minutes = durationSeconds / 60
    //               seconds = durationSeconds % 60
    //         Use String.format to ensure seconds is always two digits: "%02d"
    // -------------------------------------------------------
    public String getDurationFormatted() {
        // Your code here
        return "";
    }

    // -------------------------------------------------------
    // TODO 7: toString()
    //         Returns: "\"Title\" by Artist [m:ss] [EXPLICIT]"
    //         Only append " [EXPLICIT]" if isExplicit is true.
    //         Example: "\"Neon Lights\" by Stellar Echo [4:02] [EXPLICIT]"
    //         Example: "\"Ocean Drive\" by Midnight Pulse [3:30]"
    // -------------------------------------------------------
    @Override
    public String toString() {
        // Your code here
        return "";
    }
}
