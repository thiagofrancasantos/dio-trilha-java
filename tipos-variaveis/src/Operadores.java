public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Thiago " + "Franca";
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 5;
        String resultado = a==b ? "verdadeiro" : "falso";
        
        System.out.println(resultado);

        int numero1 = 6;
        int numero2 = 7;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual ao numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é igual ao numero 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior que o numero 2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero 1 é menor que o numero 2? " + simNao);


        String nomeUm = "Thiago";
        String nomeDois = "Thiago";

        System.out.println(nomeUm == nomeDois);


        boolean condicaoUm = true;
        boolean condicaoDois = true;

        if(condicaoUm && condicaoDois){
            System.out.println("Ambas sao verdadeiras");
        }
        
        if(condicaoUm || condicaoDois){
            System.out.println("Uma das duas condicoes é verdadeira");
        }
        
            System.out.println("FIM");

    }
}
