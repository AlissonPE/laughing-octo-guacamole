import java.util.*;

public class desafioArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        fiboClass primeiro = new fiboClass();

        System.out.println("Quantos vezes nosso loop de fibonacci rodara? Caso seja 5 vezes, os números guardados serão [1, 1, 2, 3, 5] e assim por diante!");

        int loops = sc.nextInt();

        System.out.println(primeiro.calculaFibo(loops));

        System.out.println("Você gostaria de saber se algum número PAR está na lista? Digite ele agora: ");
                int numeroPedido = sc.nextInt();

                if(primeiro.taNaLista(12, numeroPedido)) {
                    System.out.println("Ta na lista!");
                }



    }
}

