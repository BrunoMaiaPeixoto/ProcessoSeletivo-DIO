import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Sofia", "Lucas", "Isabella", "Gabriel", "Julia", "Miguel", "Manuela", "Matheus", "Laura", "Davi", "Ana", "Arthur", "Clara", "Pedro", "Valentina", "Enzo", "Maria", "Felipe", "Heloísa", "João"};
            for (String canidato : candidatos) {
                entrandoEmContato(canidato);

            }

    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando =  true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else System.out.println("Contato realizado com sucesso");

        }while (continuarTentando && tentativasRealizadas<3);
        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizadas + " tentativa" );
        else
            System.out.println("Nao conseguimos contato com "+candidato+ " Numero maximo de tentativas");

    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Sofia", "Lucas", "Isabella", "Gabriel", "Julia", "Miguel", "Manuela", "Matheus", "Laura", "Davi", "Ana", "Arthur", "Clara", "Pedro", "Valentina", "Enzo", "Maria", "Felipe", "Heloísa", "João"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento ");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de numero:  " + (indice+1)+ "é " + candidatos[indice]);
        }
        for (String candidato : candidatos){
            System.out.println(candidato);
        }
    }
    static void selecaoCandidato(){

        String [] candidatos = {"Sofia", "Lucas", "Isabella", "Gabriel", "Julia", "Miguel", "Manuela", "Matheus", "Laura", "Davi", "Ana", "Arthur", "Clara", "Pedro", "Valentina", "Enzo", "Maria", "Felipe", "Heloísa", "João"};

        int candidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase= 2000.0;
        while (candidatoSelecionados < 5){
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + "solicitou este valor de salario "+ salarioPretendido);

            if (salarioBase>=salarioPretendido){
                System.out.println("O CANDIDATO " +candidato+"foi selecionado");
                candidatoSelecionados++;
            }
            candidatoSelecionados++;

        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(Double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");

        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }


    }
}