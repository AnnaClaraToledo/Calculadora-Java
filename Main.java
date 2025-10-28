import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero1 ;
        int numero2 ;
         // Numero 1 //
        System.out.println("Digite primeiro numero");
        numero1 = scan.nextInt();
        System.out.println("O numero digitado é: " + numero1);
        //  Numero Dois //
        System.out.println("Digite segundo numero");
        numero2 = scan.nextInt();
        System.out.println("O numero digitado é: " + numero2);

        System.out.println("Digite a operação desejada");
        System.out.println("1 - Adição \n" + "2- Subtração \n"  + "3- Mutiplicação \n") ;
        int operacao = scan.nextInt();
         if (operacao == 1){
             System.out.println(numero1 + " + " + numero2 +  " = " + (numero1 + numero2));
         } else if (operacao == 2) {
             System.out.println(numero1 + " - " + numero2 +  " = " + (numero1 - numero2));
         } else if (operacao ==3) {
             System.out.println(numero1 + " * " + numero2 +  " = " + (numero1 * numero2));
             scan.close();
         }
    }
}