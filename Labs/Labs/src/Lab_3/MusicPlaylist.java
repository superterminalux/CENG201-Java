/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  240446034
 * Your Date:        19.10.26
 */

package Lab_3;

public class MusicPlaylist {

    // Defines private instances
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // Constructor Method
    public MusicPlaylist() {

        this.head = null;
        this.tail = null;
        this.current = null;
    }

    // Addes a song to end of the playlist
    public void addSong(String title) {

        // Defines a new SongNode
        SongNode newNode = new SongNode(title);

        // if-else statements to check is playlist empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeSong(String title) {

        SongNode temp = head;

        //Starts search from head
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }

        //If statement if song does not exist
        if (temp == null) {
            System.out.println("The song isn't in the playlist");

            return;
        }

        //Prints expected output
        System.out.println("Removed: " + temp.title);

        if (temp.prev != null) { // Updates the prev node's next pointer
            temp.prev.next = temp.next;
        }

        if (temp.next != null) { // Updates the next node's prev pointer
            temp.next.prev = temp.prev;
        }

        if (temp == head) { // Handles the removing head
            head = temp.next;
        }

        if (temp == tail) { // Handles the removing tail
            tail = temp.prev;
        }

        if (temp == current) { // Handles removing the current song
            current = current.next;
        }

    }


    // Move to the next song
    public void nextSong() {

        // if-else statement to move to next song
        if (current == null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Already at the last song of the playlist.");
        }
    }


    // Move to the previous song
    public void previousSong() {

        // if-else statement to move previous song
        if(current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Already at the first song of the playlist.");
        }
    }

    // Displays the current song
    public void displayCurrentSong() {

    // if-else statement to check playing song exist
        if (current != null) {
            System.out.println("Current song: " + current.title);
        } else {
            System.out.println("No song is currently playing.");
        }
    }


    // Displays all songs
    public void displayPlaylist() {

        // Defines temp node
        SongNode temp = head;

        // while-loop to display all songs
        while(temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}