public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();
        iPhone.tocar();
        iPhone.selecionarMusica("Hino do Brasil");
        iPhone.pausar();
        iPhone.ligar("11911111111");
        iPhone.iniciarCorreioVoz();
        iPhone.atender();
        iPhone.atualizarPagina();
        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("google.com");
    }
}
