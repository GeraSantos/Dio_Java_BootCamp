import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        
        //Operadores de atribuição ' = '
        int idade = 22;
        Date datanascimento = new Date(); //atribuição objeto
        boolean doadorOrgao = false;  // atribuição logico
        
        // Operadores aritimeticos
        // adição + , subtração - ,  Multiplicação * , % resto da divisão , / divisão
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicao = 20 * 7;
        int divisão = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        // operador de + utilizado em variaveis do tipo texto, realizará a "concatenação de texto"  "Ana" + "Maria"
        String nomeCompleto = "Ana " + "Maria";
        System.out.println(nomeCompleto);

        // Operador de atribuição ( = )
        // Operadores aritimeticos ( + , - , * , / , %) 
        // Operador Unário 
        // valor possitivo ou incremento, decremento
            // (+) valor positivo (++) incremento
            // (-) valor negativo (--) decremento
        int numero1 = 5;
        numero1 = - numero1; //negativo
        System.out.print(numero1);

        //operador ternario > Expressão condicional ' ? ' <caso condição seja true> : <caso condição seja false>
        int a, b;
        a = 5;
        b = 6;

        String resultado1 = a==b ? "verdadeiro" : "false" ;
        System.out.println(resultado1);

        


    }
}
