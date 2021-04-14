package ex02controle;

public class ControleRemoto implements Controlador {

    //Atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigando() {
        return ligando;
    }

    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Sobrescrevendo Métodos abstratos
    //a classe implementa a interface
    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

}
