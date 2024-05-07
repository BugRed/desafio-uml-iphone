import model.iphone.Iphone;

public class App {
    public static void main(String[] args) {
        Iphone iphone11 = new Iphone();

        System.out.println("Funções de Audio");
        iphone11.tocar();
        iphone11.pausar();
        iphone11.selecionarMusica();
        System.out.println("----------------");

        System.out.println("Funções telefônicas:");
        iphone11.ligar();
        iphone11.atender();
        iphone11.iniciarCorrerioVoz();
        System.out.println("----------------");

        System.out.println("Funções de navegador: ");
        iphone11.atualizarPagina();
        iphone11.exibirPagina();
        iphone11.adicionarNovaAba();


    }
}
