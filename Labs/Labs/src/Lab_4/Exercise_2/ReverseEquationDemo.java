/**
 * ReverseEquationDemo.java
 */

package Lab_4.Exercise_2; // Kendi paket ismine göre düzenle

public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "5+2*56-2/4", // Beklenen çıktıda olup başlangıçta eksik olan denklem eklendi
                "123+45*6",
                "100/25-7"
        };

        // Yönerge: Print the input and output like in the expected output[cite: 1]
        for (String equation : equations) {
            System.out.println("Input:  " + equation);
            System.out.println("Output: " + EquationReverser.reverseEquation(equation));
            System.out.println(); // Çıktılar arasına boşluk bırakmak için
        }
    }
}