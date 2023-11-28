package es4;

import java.util.Scanner;

public class es4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("scrivi qui il tuo intero");
        int numero = input.nextInt();
for (int i = numero; i >= 0; i--){
    System.out.println(i);
}
        input.close();
    }
}
