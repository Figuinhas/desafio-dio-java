public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Internet{

    public void ligar(){
        System.out.println("Ligando...");
    }
    public void atender(){
        System.out.println("Atendendo o telefone...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    public void tocar(){
        System.out.println("Tocando audio...");
    }
    public void pausar(){
        System.out.println("Pausando audio...");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando o audio...");
    }

    public void exibirPagina(){
        System.out.println("Exibindo a pagina.");
    }
    public void addNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a paginas.");
    }
}
