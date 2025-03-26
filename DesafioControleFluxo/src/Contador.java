import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Desafio controle de fluxo da plataforma Dio - java básico:");

        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o primeiro número: ");
        int numero2 = leitor.nextInt();

        System.out.println("------------------------------\n");

        try {
            if(numero1>numero2){
                throw new ParametrosInvalidosException(numero1,numero2);
            }
            for(int cont = 1 ; cont<= (numero2 - numero1);cont++){
                System.out.println("Imprimindo o número " + cont);
            }
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }



}
