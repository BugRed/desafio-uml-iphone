package model.iphone;

import audio.iphone.ReprodutorMusical;
import internet.iphone.NavegadorNaInternet;
import telefone.iphone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, NavegadorNaInternet, AparelhoTelefonico {
    @Override
    public void tocar() {
        System.out.println("Tocando musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica tal selecionada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Pagina exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para tal numero");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
