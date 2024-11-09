/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_examen;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_EXAMEN {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int winsDelUsuario = 0;
        int winsDePc = 0;
        int empates = 0;
        int rondas = 5; 
        System.out.println("Vamos a jugar piedra papel o tijera");

        for (int i = 0; i < rondas; i++) {
            System.out.println("Elige: 1 para Piedra, 2 para Papel, 3 para Tijera: ");
            int usuario = scanner.nextInt();
            int computadora = (int) (Math.random() * 3 +1);
            System.out.println("La pc eligio: " + computadora);

            if (usuario == computadora) {
                System.out.println("Empate!");
                empates++;
            } else if ((usuario == 1 && computadora == 3) || (usuario == 2 && 
                    computadora == 1) || (usuario == 3 && computadora == 2)) {
                System.out.println("Ganaste esta ronda");
                winsDelUsuario++;
            } else {
                System.out.println("La pc gano esta ronda");
                winsDePc++;
            }

            System.out.println("Usuario: " + winsDelUsuario + 
                    " | Computadora: " + winsDePc + " | Empates: " + empates);
        }

        System.out.println("Juego terminado. Usuario: " + winsDelUsuario + 
                " | Computadora: " + winsDePc + " | Empates: " + empates);
        
    }
}
