public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio do pragrama no metodo main");
        a();
        System.out.println("Fim do programa no metodo main");
    }

    static void a(){
        System.out.println("Entrou no metodo a");
        b();
        System.out.println("Finalizou o metodo a");
    }

    static void b(){
        System.out.println("Entrou no metodo b");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b");
    }

    static void c(){
        System.out.println("Entrou no metodo c");

        //Pilha de execução do programa
        Thread.dumpStack();
        
        System.out.println("Finalizou o metodo c");
    }
}
