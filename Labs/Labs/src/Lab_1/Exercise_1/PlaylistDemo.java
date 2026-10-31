/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 * Name:        ___________________________
 * Student ID:  240446034
 * Date:        05.10.26
 */

package Lab_1.Exercise_1;

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---
        // Defines the Track object
        Track defaultTrack = new Track();
        System.out.println("Default Track: ");
        System.out.println(defaultTrack.toString() + "\n");

        // --- Title-only constructor ---
        // Adds a song with just it's name info
        Track titleTrack = new Track("Neon Lights");
        System.out.println("Title-only track: ");
        System.out.println(titleTrack.toString() + "\n");

        // --- Title + artist constructor ---
        // Adds a song with it's artist and name infos
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track: ");
        System.out.println(titleArtistTrack.toString() + "\n");

        // --- Full constructor ---
        // Adds a song with all features
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack.toString() + "\n");

        // --- Invalid duration test ---
        // Defines invalid content version to test reset code
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -15, false);
        System.out.println("Invalid Duration Test:");
        System.out.println(invalidTrack.toString() + "\n");

        // --- Getter test ---
        // Defines unsuitable content to test getter functions
        Track getterTrack = new Track("Stardust", "Stallar Echo", 242, true);
        System.out.println("Getter Test: ");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());

    }
}