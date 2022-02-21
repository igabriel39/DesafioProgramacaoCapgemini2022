package DesafioProgramacao;

import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a string: ");
        String s = input.next();
        int len = 1;
        int gap = 1;
        while(gap <= s.length()){
            String subs = s.substring(0,gap);
            System.out.println(subs);
            int i = 1;
            int j = i+gap;
            int x = i;
            while(j <= s.length()){
                System.out.println(subs.equals(s.substring(x,j)));
                x++;
                j++;
            }
            gap++;
        }
    }
}
