package projeto0803;

import java.util.Scanner;

public class VariaveisTipoPrimitivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte idade;
        float altura;
        char sexo;
        float salario;

        System.out.println("Informe sua idade: ");
        idade = sc.nextByte();

        System.out.println("Informe sua altura: ");
        altura = sc.nextFloat();

        System.out.println("Informe seu sexo: ");
        sexo = sc.next().charAt(0);

        System.out.println("Informe seu salário: ");
        salario = sc.nextFloat();

        System.out.println("idade: " + idade);
        
        System.out.println("altura: " + altura);
        
        System.out.println("sexo: " + sexo);
        
        System.out.println("salario: " + salario);
        
        
                
                
                
      
        
    }
}
