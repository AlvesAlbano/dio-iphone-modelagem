public class Iphone extends AparelhoTelefonico implements NavegadorInternet,ReprodutorMusical{
    @Override
    public String exibirPagina() {
        return "Exibindo pagina...";
    }

    @Override
    public String adicionarNovaAba() {
        return "Adicionando nova aba...";
    }

    @Override
    public String atualizarPagina() {
        return "Atualizando pagina...";
    }

    @Override
    public String tocar() {
        return "Tocando musica...";
    }

    @Override
    public String pausar() {
        return "Pausando musica...";
    }

    @Override
    public String selecionarMusica() {
        return "Selecionando musica...";
    }

}
