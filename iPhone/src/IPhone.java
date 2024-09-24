public class IPhone {
    public void tocar() {
        System.out.println("tocando...");
    }
    public void pausar() {
        System.out.println("musica pausada...");
    }
    public void selecionarMusica(String musica) {
        String res = String.format("tocando: %s",musica);
        System.out.println(res);
    }
    public void ligar(String numero) {
        String res = String.format("ligando para: %s",numero);
        System.out.println(res);
    }
    public void atender() {
        System.out.println("atendendo ligacao...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de vos...");
    }
    public void exibirPagina(String url) {
        String res = String.format("abrindo a pagina: %s",url);
        System.out.println(res);
    }
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba...");
    }
    public void atualizarPagina() {
        System.out.println("atualizando a pagina...");
    }
}
