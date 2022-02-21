package DesafioProgramacao;

import java.util.Scanner;
import java.util.Arrays;

public class Quest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a string desejada");

        String s = input.next();
        int qtd = 1;
        int gap = 1;

        while(gap < s.length()){
            String subs = s.substring(0,gap);
            int i = 1;
            int j = i+gap;
            int x = i;
            while(j <= s.length()){
                char[] subsArr = subs.toCharArray();
                char[] subsArrComparacao = s.substring(x,j).toCharArray();
                Arrays.sort(subsArr);
                Arrays.sort(subsArrComparacao);
                if(Arrays.toString(subsArr).equals(Arrays.toString(subsArrComparacao))){
                    qtd++;
                }
                x++;
                j++;
            }
            gap++;
        }
        System.out.println(qtd);
    }
}
