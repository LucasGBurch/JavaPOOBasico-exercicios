package reset.poo.basico;

public class BancoAplicar {

    public static void main(String[] args) {

        BancoConta c1 = new BancoConta();
        BancoConta c2 = new BancoConta();
        BancoConta c3 = new BancoConta();

        c1.setNumeroConta(55);
        c1.setDono("Lusca");
        c1.abrirConta("CL");


        c2.setNumeroConta(60);
        c2.setDono("Luskhan");
        c2.abrirConta("CC");
        c2.depositar(350);
        c2.depositar(100);


        c3.setNumeroConta(70);
        c3.setDono("ReiNever");
        c3.abrirConta("CP");
        c3.depositar(150);
        c3.sacar(300);
        c3.fecharConta();


        c1.estadoConta();
        c2.estadoConta();
        c3.estadoConta();

    }
}
