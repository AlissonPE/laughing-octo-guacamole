import java.util.Scanner;


public class desafio {

    public static void main(String[] args) {
        int ultimo = 0;
        int penultimo = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números da sequencia de fibonacci compararemos e somaremos os números pares? :  ");
        int fibo = sc.nextInt();

        int contador = 0;
        int soma = 0;

        while (contador < fibo) {
            //* Condição para que o While termine.
            contador = contador + 1;

            int resultado = ultimo + penultimo;  // ou penultimo + ultimo = resultado
            //  resultado <- ultimo <- penultimo
            penultimo = ultimo;
            ultimo = resultado;


            System.out.println("Sequencia: " + resultado);

            if (resultado % 2 == 0) {
                soma = soma + resultado;

                System.out.println("achado o número par: " + resultado + " : " + soma);

            }
            if (resultado > 4000000) {
                System.out.println("EPA, ENCONTRAMOS O NÚMERO PREMIADO: " + contador);
                break;
            }
            sc.close();
        }
    }
}

