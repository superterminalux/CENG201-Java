/**
 * BracketStack.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null; // Başlangıçta yığınımız boş.
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        // Yeni bir düğüm (Node) yaratıyoruz
        Node newNode = new Node(value);

        // Yönergedeki ipucu: connect newNode to the current top; update top
        newNode.next = top; // Yeni düğüm, şu anki en üsttekini göstersin
        top = newNode;      // Artık yeni en üst (top) bu yeni düğüm olsun
    }

    //  TODO 2: Remove and return the top element
    public char pop() {
        // Hata almamak için önce yığının boş olup olmadığını kontrol edelim
        if (isEmpty()) {
            return '\0'; // char için null anlamına gelen boş karakter dönüyoruz
        }

        // Yönergedeki ipucu: After saving top.data, the new top should be the node that comes after the current top.[cite: 1]
        char poppedData = top.data; // En üstteki veriyi kaydet
        top = top.next;             // top işaretçisini bir alttakine kaydır (böylece üstteki silinmiş olur)

        return poppedData;          // Kaydettiğimiz veriyi geri döndür
    }

    //  TODO 3: Return the top element without removing it
    public char peek() {
        // Yönergedeki ipucu: Control if the stack is empty; if it is, then return null // if not return the data of the top[cite: 1]
        if (isEmpty()) {
            return '\0'; // Boşsa boş karakter dön
        }

        return top.data; // Silmeden sadece en üstteki veriyi göster
    }

    //  TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        // Eğer top null ise yığın boştur, true döner; değilse false döner.
        return top == null;
    }
}