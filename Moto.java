public class Moto extends Automovel {
    private String tipoGuidao;
    public Moto(){
        super("Rosa", "ZX10", "Kawasaki", "BRM1234", 2020);
        this.tipoGuidao = "genérico";
    }
    
    public Moto (String cor, String modelo, String marca, String placa, int ano, String tipoGuidao){
        super(cor, modelo, marca, placa, ano);
        this.tipoGuidao = tipoGuidao;
    }

    public String getTipoGuidao(){
        return this.tipoGuidao;
    }
    public void setTipoGuidao(String tipoGuidao){
        this.tipoGuidao = tipoGuidao;
    }
}