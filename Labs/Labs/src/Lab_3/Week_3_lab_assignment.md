# Lab 3: Doubly Linked List

### Learning Objectives


## Exercise 1: Real Music Player Playlist

**Learning Objectives**:

By completing this exercise, students will practice:

1. Creating and traversing a Doubly Linked List
2. Using both next and prev references
3. Moving forward and backward through a playlist
4. Adding songs to the playlist
5. Removing songs from the playlist
6. Updating links correctly after insertion/deletion
---

**Problem Statement**: You are going to build a simple Music Player Playlist using a Doubly Linked List.

In a real music player, the user should be able to:

1. Add a new song to the playlist.
2. Remove a song from the playlist.
3. Move to the next song.
4. Move to the previous song.
5. Display the current song.
6. Display all songs in the playlist.

Each song is represented by a node

---

**Starter Code**:

`SongNode.java`:
```java
/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  ______________________________
 * Your Date:        ______________________________
 */

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

```

`MusicPlaylist.java`:

```java
/**
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        ______________________________
 * Your Student ID:  ______________________________
 * Your Date:        ______________________________
 */

public class MusicPlaylist {

    //create private instants of the doubly linked list: 
    // -  head, tail and current

    // constructor: The head,tail and current should be initialized to null in the beginning
    public MusicPlaylist() {
        
    }

    // Add a song to the end of the playlist
    public void addSong(String title) {

        // TODO
        // 1. Create a new SongNode
        // 2. If the playlist is empty, make the new node
        //    head, tail and current
        // 3. Otherwise, add the new node after tail
        // 4. Update both next and prev pointer
        // 5. Update tail
    }


    // Remove a song from the playlist
    public void removeSong(String title) {

        // TODO
        // 1. Search for the song
        // 2. If the song does not exist, display a message as: "The song isn't in the playlist"
        // 3. Update the previous node's next pointer
        // 4. Update the next node's prev pointer
        // 5. Handle removing head
        // 6. Handle removing tail
        // 7. Handle removing the current song
    }


    // Move to the next song
    public void nextSong() {

        // TODO
        // If current is not null and current.next exists,
        // move current to current.next.
        //
        // Otherwise, display:
        // "Already at the last song of the playlist."
    }


    // Move to the previous song
    public void previousSong() {

        // TODO
        // If current is not null and current.prev exists,
        // move current to current.prev.
        //
        // Otherwise, display:
        // "Already at the first song of the playlist."
    }


    // Display the current song
    public void displayCurrentSong() {

        // TODO
        // Display the title of the current song.
    }


    // Display all songs
    public void displayPlaylist() {

        // TODO
        // Start from head and follow next pointer.
    }
}

```
`MusicPlayerDemo.java`:

```java
/**
 * MusicPlayerDemo.java
 *
 * Tests the playlist

 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        //create the playlist object


        // Add songs
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        //display the playlist


        System.out.println("\n=== CURRENT SONG PLAYING ===");
        //display the current song playing

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        // go the next song of the playlist and display it


        System.out.println("\n=== NEXT SONG TO PLAY ===");
        // go the next song of the playlist and display it


        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        // go the previous song of the playlist and display it


        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        // remove the song called "Shape of You - Ed Sheeran" from the playlist 
        //Then display the Playlist


        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        // remove the song called "Snap - Manifest" from the playlist 
        //Then display the Playlist

    }
}
```
---

**Expected Output**:

```
=== PLAYLIST ===
Shape of You - Ed Sheeran <-> Save Me - BTS <-> Snap - Manifest <-> like JENNIE - JENNIE <-> END

=== CURRENT SONG PLAYING ===
Current Song: Shape of You - Ed Sheeran

=== NEXT SONG TO PLAY ===
Playing: Save Me - BTS

=== NEXT SONG TO PLAY ===
Playing: Snap - Manifest

=== PREVIOUS SONG TO PLAY ===
Playing: Save Me - BTS

=== AFTER REMOVING Shape of You SONG ===
Removed: Shape of You - Ed Sheeran
Save Me - BTS <-> Snap - Manifest <-> like JENNIE - JENNIE <-> END

=== AFTER REMOVING Snap SONG ===
Removed: Snap - Manifest
Save Me - BTS <-> like JENNIE - JENNIE <-> END

```
---

**Hints**:
 - Adding the first song: It means the playist is empty so --> head = newNode // tail = newNode // current = newNode
 - Adding after the tail: newNode.prev = tail; // tail.next = newNode; // tail = newNode;
 - Removing the first song: head = head.next; // head.prev = null;
 - Removing the last song: tail = tail.prev; // tail.next = null;
 - Removing a song in the middle of the playlist: current.prev.next = current.next; // current.next.prev = current.prev;
 - Moving forward in the Playlist: current = current.next;
 - Moving backward in the Playlist: current = current.prev;

---
