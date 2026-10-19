/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  240446034
 * Your Date:        19.10.26
 */

package Lab_3;

public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}
