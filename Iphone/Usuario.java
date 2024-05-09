public class Usuario {
    public static void main(String[] args) {
        Iphone usuario = new Iphone();

        usuario.addNovaAba();
        usuario.atualizarPagina();
        usuario.exibirPagina();

        usuario.ligar();
        usuario.atender();
        usuario.iniciarCorreioVoz();

        usuario.tocar();
        usuario.pausar();
        usuario.selecionarMusica();
    }
}