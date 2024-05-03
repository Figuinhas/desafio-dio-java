import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
       
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu=false;
        do{
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando){
                tentativasRealizadas++;
            }
            else{
                System.out.println("Contato realizado com sucesso.");
            }
        }while(continuaTentando && tentativasRealizadas < 3);{
            if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		    else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    //metodo auxiliar
    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos selecionados informando o indicie.");

        for(int indice = 0; indice < candidatos.length; indice++ ){
            System.out.println("O candidato de nº"+ (indice+1) + " é o(a)" + candidatos[indice]);
        }
        System.out.println("Forma abreviada");

        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para candidato, com contra proposta");
        }
        else {
            System.out.println("Aguardando os outros candidatos");
        }
    }
}