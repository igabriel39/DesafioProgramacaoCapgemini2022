package DesafioProgramacao;

import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int miniCaracter = 0;
        boolean maiscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean especial = false;

        // O usuário digita a senha desejada
        System.out.println("Por favor informe sua senha: ");
        String senha = input.next();


        // Método para verificar se a senha contém os resquisitos maiúscula, minúscula, dígito e caracter especial
        for (int i = 0; i < senha.length(); i++) {
            char caracter = senha.charAt(i);
            if (Character.isUpperCase(caracter)) {
                maiscula = true;
            } else if (Character.isLowerCase(caracter)) {
                minuscula = true;
            } else if (Character.isDigit(caracter)) {
                numero = true;
            } else {
                especial = true;
            }
        }

        // Iterando a variável miniCaracter para saber o mínimo de caracteres que precisa
        if (!maiscula) {
            miniCaracter ++;
        } if (!minuscula) {
            miniCaracter ++;
        } if (!numero) {
            miniCaracter ++;
        } if (!especial) {
            miniCaracter ++;
        }

        int tamSenha = senha.length();

        // Validações para exibir se a senha é forte ou não
        if (miniCaracter == 0 && tamSenha >= 6) {
            System.out.println("Sua senha é considerada segura !");
        } else if (tamSenha < 6 && (miniCaracter + tamSenha) <= 6 ) {
            int aux = 6 - (miniCaracter + tamSenha);
            miniCaracter = miniCaracter + aux;
            System.out.println("Para sua senha ser considerada segura, precisa adicionar no mínimo " + miniCaracter + " caracteres !");
        } else {
            System.out.println("Para sua senha ser considerada segura, precisa adicionar no mínimo " + miniCaracter + " caracteres !");
        }

        System.out.println(miniCaracter);

    }
}
