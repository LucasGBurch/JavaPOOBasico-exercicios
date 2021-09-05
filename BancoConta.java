package reset.poo.basico;

public class BancoConta {

    public int numero;
    public double saldo;
    public String tipo;
    public String dono;
    public boolean status;


    // Métodos:
    public void abrirConta(String tipo){
        if (!getStatus()) {
            if (tipo == "CC") { // pode ser .equals() também. Olhar no setTipo;
                setStatus(true);
                setTipo("CC");
                setSaldo(50);
            } else if (tipo == "CP") {
                setStatus(true);
                setTipo("CP");
                setSaldo(150);
            } else{
                System.out.println("\n-----------------");
                System.out.println("Tipo inválido! Informe 'CC' (Conta Corrente) ou 'CP' (Conta Poupança)");
                System.out.println("\n-----------------");
            }
        } else {
            System.out.println("Esta conta já está aberta.");
            System.out.println("-----------------\n");
        }
    }

    public void sacar(double valor){
        if (getStatus()){
            if (valor < this.saldo){
                System.out.println("Saldo insuficiente.");
                System.out.println("\n-----------------");
            } else{
                this.saldo = this.saldo - valor;
            }
        } else{
            System.out.println("Não é possível sacar de conta fechada.");
            System.out.println("\n-----------------");
        }

    }

    public void depositar(double valor){
        this.saldo += valor;
    }


    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Esvazie sua conta primeiro! Saldo: " + getSaldo());
            System.out.println("\n-----------------");
        } else if(getSaldo() < 0){
            System.out.println("Quite seus débitos primeiro! Saldo: " + getSaldo());
            System.out.println("\n-----------------");
        } else{
            System.out.println("Conta " + getNumeroConta() + ", de " + getDono() + " foi fechada.");
            setStatus(false);
        }
    }

    public void estadoConta(){
        if (getStatus()) {
            System.out.println("Conta: " + getNumeroConta() + "\nTipo: " + getTipo()
                    + "\nDono: " + getDono() + "\nSaldo: " + getSaldo()
                    + "\nStatus (aberta?): " + getStatus() + "\n-----------------");
        } else{
            System.out.println("\n-----------------");
            System.out.println("Esta conta ainda não existe.");
            System.out.println("\n-----------------");
        }
    }

    // Getters e Setters:
    public void setNumeroConta(int numero){
        this.numero = numero;
    }

    public int getNumeroConta(){
        return this.numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getDono(){
        return this.dono;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

}
