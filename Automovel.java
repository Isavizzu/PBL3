public class Automovel {
    protected String cor;
    protected String modelo;
    protected String marca;
    protected String placa;
    protected int ano;

    public Automovel(String cor, String modelo, String marca, String placa, int ano){
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void acompanharTrajeto() {
        System.out.println("Este é o trajeto desejado");
    }
}
