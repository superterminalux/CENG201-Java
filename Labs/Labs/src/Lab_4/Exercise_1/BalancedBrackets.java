/**
 * Your Name:        _________________
 * Your Student ID:  240446034
 * Your Date:        26.10.26
 */

package Lab_4.Exercise_1; // Kendi proje yapına göre güncelleyebilirsin

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // 1. Traverse the string character by character.
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 2. If the character is an opening bracket, push it onto the stack.
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }
            // 3. If it is a closing bracket:
            else if (current == ')' || current == ']' || current == '}') {

                // - Check whether the stack is empty.
                if (stack.isEmpty()) {
                    return false; // Kapatacak bir açılış parantezi yoksa dengesizdir.
                }

                // - Pop the top opening bracket.
                char top = stack.pop();

                // - Check whether the brackets match.(call isMatchingPair method)
                if (!isMatchingPair(top, current)) {
                    return false; // Parantez türleri eşleşmiyorsa dengesizdir (Örn: (] ).
                }
            }
        }

        // 4. At the end, check whether the stack is empty.
        // Eğer döngü bittiğinde stack boşsa hepsi eşleşmiştir (true), doluysa eşleşmeyen kalmıştır (false).
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }

        // Check: [ matches ]
        if (opening == '[' && closing == ']') {
            return true;
        }

        // Check: { matches }
        if (opening == '{' && closing == '}') {
            return true;
        }

        // if check doesnt match; then return false
        return false;
    }
}