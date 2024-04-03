public class Endereco {
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private  int numero;
    
    Endereco(){
        this("Brasil", "Parana", "Curitiba", "Boqueirão", "Rogerio", 1700);
    }
    
    Endereco(String pais, String estado, String cidade, String bairro, String rua, int numero){
        this.pais = pais;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getPais(){
        return this.pais;
    }

    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getBairro(){
        return this.bairro;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getRua(){
        return this.rua;
    }
    public void setRua(String rua){
        this.rua= rua;
    }

    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

}