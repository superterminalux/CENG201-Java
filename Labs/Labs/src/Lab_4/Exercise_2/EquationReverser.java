/**
 * EquationReverser.java
 * Your Name:        _________________
 * Your Student ID:  240446034
 * Your Date:        26.10.26
 */

package Lab_4.Exercise_2; // Paket adını kendine göre düzenle

public class EquationReverser {

    public static String reverseEquation(String equation) { // Neden static? Obje yaratmadan doğrudan sınıf üzerinden çağırabilmek için.
        // create the object of the TokenStack class
        TokenStack stack = new TokenStack();

        int i = 0;

        // 1: Traverse the equation from left to right.
        while (i < equation.length()) {
            char current = equation.charAt(i);

            // 2: If the current character is a digit,
            if (Character.isDigit(current)) {
                // Remember the beginning of the number
                int start = i;

                // Move forward until the number ends
                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {
                    i++;
                }

                // Push the whole number as one item
                // substring(start, i) komutu, sayının tamamını alır (örneğin "123")
                String number = equation.substring(start, i);
                stack.push(number);
            }
            // 3: Otherwise, push the operator.
            else {
                // Operatörü String'e çevir ve yığına at
                stack.push(String.valueOf(current));
                i++; // Operatörü işlediğimiz için bir adım ileri git
            }
        }

        // 4: Pop all items from the stack and append them to a StringBuilder.
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop()); // Yığından çıkar ve metne ekle
        }

        return result.toString();
    }
}