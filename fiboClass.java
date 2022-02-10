import java.util.Arrays;

public class fiboClass {

    public int ultimo;
    public int penultimo;

    public int fibo;
    public int cArray = 0;
    public int contador = 0;
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

        while (contador < fibo) {

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
                    
                    soma = soma + resultado;
                    
                    //System.out.println(Arrays.toString(pares));
                    cArray++;
                }
            contador++;
            }
        String obrigado = "\n";
        return obrigado;
    }
    public boolean taNaLista(int lenghtArray, int numeroPedido) {

        try
        {
            //trecho de código que pode vir a lançar uma exceção
            for(int i = 0; i <= lenghtArray; i++ ) {
                if (pares[i] == numeroPedido) {
                    return true;
                    //Esse código joga uma excessão na pilha caso não encontre o número. Por isso o CATCH e o Try
                }
            }
        }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Número não encontrado :(");
        }
        return false;
    }

}
