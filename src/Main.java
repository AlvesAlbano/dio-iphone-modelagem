public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println(iphone.exibirPagina());
        System.out.println(iphone.atualizarPagina());
        System.out.println(iphone.adicionarNovaAba());
        System.out.println(iphone.pausar());
        System.out.println(iphone.tocar());
        System.out.println(iphone.atender());
        System.out.println(iphone.iniciarCorreioVoz());
        System.out.println(iphone.ligar());
    }
}