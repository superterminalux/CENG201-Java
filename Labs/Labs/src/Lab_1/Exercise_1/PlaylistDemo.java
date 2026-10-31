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

        // --- Default constructor ---
        Track defaultTrack = new Track();
        System.out.println("Default Track: ");
        System.out.println(defaultTrack.toString() + "\n");

        // --- Title-only constructor ---
        Track titleTrack = new Track("Neon Lights");
        System.out.println("Title-only track: ");
        System.out.println(titleTrack.toString() + "\n");

        // --- Title + artist constructor ---
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track: ");
        System.out.println(titleArtistTrack.toString() + "\n");

        // --- Full constructor ---
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack.toString() + "\n");

        // --- Invalid duration test ---
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -15, false);
        System.out.println("Invalid Duration Test:");
        System.out.println(invalidTrack.toString() + "\n");

        // --- Getter test ---
        Track getterTrack = new Track("Stardust", "Stallar Echo", 242, true);
        System.out.println("Getter Test: ");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());

    }
}