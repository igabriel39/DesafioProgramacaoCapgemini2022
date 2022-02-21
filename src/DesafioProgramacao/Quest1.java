package DesafioProgramacao;

import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        // O usuário digita o número desejado
        System.out.println("Digite um número: ");
        num = input.nextInt();

        // Código para exibir a escada de acordo com o tamanho digitado
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
