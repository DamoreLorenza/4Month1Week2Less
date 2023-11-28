package es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                System.out.println("scrivi qui il tuo intero");
        String numero = input.nextLine();
        switch (numero.length()) {
            case 3 : {
                System.out.println("miao");
                break; }
            default: {
                System.out.println("errore");
            }
        }
        input.close();

}}
