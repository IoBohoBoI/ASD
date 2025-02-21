package com.asd;

import java.util.Scanner;

/**
 * Classe principale del progetto.
 */
public final class Main {

    /**
     * Costruttore privato per evitare istanziazione della classe.
     */
    private Main() {
        // Costruttore vuoto per impedire l'istanziazione.
    }


    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        int somma = somma(num1, num2);
        System.out.println("La somma è: " + somma);

        scanner.close();
    }

    /**
     * Metodo per eseguire la somma di due numeri interi.
     * @param a
     * @param b
     * @return Somma di a + b.
     */
    public static int somma(final int a, final int b) {
        return a + b;
    }
}
