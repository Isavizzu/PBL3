public class Carro extends Automovel {
    private int numeroDePorta;
    private int quantPassageiro;

    public Carro(){
          super("Rosa", "Gol", "Volkswagen", "ABC4567", 2021);
          this.numeroDePorta = 4;
          this.quantPassageiro = 5;
    }

    public Carro(String cor, String modelo, String marca, String placa, int ano, int numeroDePorta, int quantPassageiro) {
            super(cor, modelo, marca, placa, ano);
            this.numeroDePorta = numeroDePorta;
            this.quantPassageiro = quantPassageiro;
    }

    public int getNumeroDePorta() {
        return numeroDePorta;
    }

    public void setNumeroDePorta(int NumeroDePorta) {
        this.numeroDePorta = numeroDePorta;
    }


    public int getQuantPassageiro() {
        return quantPassageiro;
    }

    public void setQuantPassageiro(int quantPassageiro) {
        this.quantPassageiro = quantPassageiro;
    }
}