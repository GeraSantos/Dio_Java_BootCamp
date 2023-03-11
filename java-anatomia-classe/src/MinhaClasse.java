//Anatomia de classe - 1
public class MinhaClasse {

    public static void main (String [] args) {
        //System.out.print ("Hello world");

        // anatomia de classe - 2 
        // variavel 
        final String BR = "Brasil"; // não sofre alterações
 
        String primeiroNome = "Geraldo";
        String segundoNome = "Gonçalves";

        String nomeCompleto = primeiroNome + " " + segundoNome;
    
        System.out.print ("Meu Pais é: " + BR + " " + nomeCompleto);

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;
        double salario =  1275.33;

        System.out.print (" Variaveis: byte, short, int, long, float, double" + idade + ano + cep + cpf + pi + salario);
    }  
}