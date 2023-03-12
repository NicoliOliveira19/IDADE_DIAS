
/**
 * Escreva um programa em Java que receba a idade da pessoa e informe quantos 
 * dias ela tem de idade
 * 
 * Nicoli Siqueira 
 * 11/03/2023
 */
import java.util.Scanner;
public class IDADE_DIAS
{
    public static void main (String args[]){
        Scanner t = new Scanner (System.in);
        int idade;
        
        System.out.println("Informe a sua idade:");
        idade = t.nextInt();
        
        System.out.println("Sua idade total é: " + (idade * 365));
    }
}
