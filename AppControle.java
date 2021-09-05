package reset.poo.basico;

public class AppControle {

    public static void main(String[] args) {

        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();
        c1.abrirMenu(); // Testes menu.
        c1.fecharMenu();

        c1.maisVolume(); // Testes Volume.
        c1.maisVolume();
        c1.maisVolume();
        c1.maisVolume();
        c1.menosVolume();
        c1.menosVolume();

        c1.ligarMudo(); // Teste de Volume mutando.
        c1.abrirMenu();
        c1.desligarMudo();
        c1.abrirMenu();

        c1.play();
        c1.abrirMenu();
        c1.pause();
        c1.abrirMenu();

        c1.desligar(); // Teste desligar
        c1.abrirMenu(); // Menu não abre com aparelho desligado.
    }
}
