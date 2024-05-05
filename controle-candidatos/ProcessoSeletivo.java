import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // selecaoCandidatos();
        // imprimirSelecionados();
        String [] candidatos = {"MARCIA", "JULIO", "CARLOS", "THAIS", "SILAS"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }   

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " REALIZADA");
        else
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
    }

    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"MARCIA", "JULIO", "CARLOS", "THAIS", "SILAS"};
        System.out.println("Imprmindo a lista de candidatos selecionados com o seu respectivo indice");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);    
        }

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"MARCIA", "JULIO", "CARLOS", "THAIS", "SILAS", "DANI", "LAIS", "EDUARDO", "YASMIM", "SAMARA"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >=  salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }

        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }

        else
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
