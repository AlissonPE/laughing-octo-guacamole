import java.util.Arrays;

public class fiboClass {

    public int cArray = 0;

    public int soma = 0;

    public int pares[] = new int[12];


    public boolean passouDoLimite(int resultado) {
        if (resultado > 4000000) {
            return true;
        }
        return false;
    }

    public fiboClass() {
    }

    public boolean parOuImpar (int numero) {
        if (numero % 2 == 0){
            return true;
        }
        return false;
    }

    public String calculaFibo(int fibo) {

        int ultimo = 1;
        int penultimo = 0;

        for (int contador = 0; contador < fibo; contador++){

            int resultado = ultimo + penultimo;  // ou penultimo + ultimo = resultado
            penultimo = ultimo;
            ultimo = resultado;


            if (passouDoLimite(resultado)) {
                System.out.print("Você passou do limite de quatro milhões!");
                break;
            }

            if (this.parOuImpar(resultado)) {
                    pares[cArray] = resultado;
                    //System.out.println("colocado no array ->" + pares[cArray]);
                    //0,1,1,2,3,5,8,13,21
                    
                    soma = soma + resultado;

                    //System.out.println(soma);
                    System.out.println(Arrays.toString(pares));
                    cArray++;
                }
            }
        String obrigado = "\n";
        return obrigado;
    }
    public boolean taNaLista(int lenghtArray, int numeroPedido) {

            //trecho de código que pode vir a lançar uma exceção
            for(int i = 0; i < lenghtArray; i++ ) {
                if (pares[i] == numeroPedido) {
                    // 1,1,2,3
                    System.out.println("Seu número foi encontrado! Ele está na posição: " + i);
                    return true;
                }
            }
        System.out.println("Número não encontrado :(");
        return false;
    }
}