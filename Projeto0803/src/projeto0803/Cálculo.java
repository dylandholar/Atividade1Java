package projeto0803;

import java.util.Scanner;

public class Cálculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;
        
        System.out.println("Informe o valor do num1: ");
        num1 = sc.nextInt();
        
        System.out.println("Informe o valor do num2: ");
        num2 = sc.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma dos números: "+soma);
        
        int num3, num4, divisao;
        
        System.out.println("Informe o valor do num3: ");
        num3 = sc.nextInt();
        
        System.out.println("Informe o valor do num4: ");
        num4 = sc.nextInt();
        
        divisao = num3 / num4;
        
        System.out.println("A divisão dos números: "+divisao);
        
        int num5, num6, multiplicacao;
        
        System.out.println("Informe o valor do num5: ");
        num5 = sc.nextInt();
        
        System.out.println("Informe o valor do num5: ");
        num6 = sc.nextInt();
        
        multiplicacao = num5 * num6;
        
        System.out.println("A multiplicação dos números: "+multiplicacao);
        
        
        
        
        
        
        
        
        
        
        
        sc.close();
        
    }
    
}
