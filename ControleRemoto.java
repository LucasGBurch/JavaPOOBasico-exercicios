package reset.poo.basico;

public class ControleRemoto implements Controlador {

    private int volume;
    private int volumeAnterior;
    private boolean ligado;
    private boolean tocando;


    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()){
            System.out.println("----------------------");
            System.out.println("----Menu de Opções:----");
            System.out.println("Tocando: " + getTocando());
            System.out.print("Volume: " + getVolume() + " ");
            for (int vol = 1; vol <= getVolume(); vol++){ //
                if (vol % 5 == 0){ // Vai adicionar um "pauzinho" por múltiplo de 5, totalizando 20!!
                    System.out.print("|");
                }
            }
            System.out.println("\n----------------------");
        } else{
            System.out.println("Não é possível abrir menu com aparelho desligado!");
        }
    }

    @Override
    public void fecharMenu() {
        if (getLigado()) {
            System.out.println("\n----------------------");
            System.out.println("----Menu Fechado!-----");
            System.out.println("----------------------");
        }
    }

    @Override
    public void maisVolume() {
        this.setVolume(getVolume() + 5);
        System.out.print("Volume: " + getVolume() + " ");
        for (int vol = 1; vol <= getVolume(); vol++){ //
            if (vol % 5 == 0){ // Vai adicionar um "pauzinho" por múltiplo de 5, totalizando 20!!
                System.out.print("|");
            }
        }
        System.out.println();
    }

    @Override
    public void menosVolume() {
        this.setVolume(getVolume() - 5);
        System.out.print("Volume: " + getVolume() + " ");
        for (int vol = 1; vol <= getVolume(); vol++){ //
            if (vol % 5 == 0){ // Vai adicionar um "pauzinho" por múltiplo de 5, totalizando 20!!
                System.out.print("|");
            }
        }
        System.out.println();
    }

    @Override
    public void ligarMudo() {
        this.volumeAnterior = getVolume();
        setVolume(0);
        System.out.println("Volume Mudo.");
    }

    @Override
    public void desligarMudo() {
        setVolume(this.volumeAnterior);
        System.out.println("Mudo Desligado.");
        System.out.print("Volume: " + getVolume() + " ");
        for (int vol = 1; vol <= getVolume(); vol++){ //
            if (vol % 5 == 0){ // Reestabelecendo os pauzinhos e o volume!!
                System.out.print("|");
            }
        }
        System.out.println();
    }

    @Override
    public void play() {
        setTocando(true);
    }

    @Override
    public void pause() {
        setTocando(false);
    }
}
