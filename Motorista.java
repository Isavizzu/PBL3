public class Motorista extends Usuario{
    private String cnh;
    private String numeroDaContaBancaria;
    private String tipoDeHabilitacao;

    public Motorista (String nome, String genero, String datadenascimento, String cpf, String cnh, String numeroDaContaBancaria, String tipoDeHabilitacao){
        super(nome,genero,datadenascimento,cpf);
        this.cnh = cnh;
        this.numeroDaContaBancaria = numeroDaContaBancaria;
        this.tipoDeHabilitacao = tipoDeHabilitacao;
    }

    public String getCnh(){
        return this.cnh;
}

    public String getNumeroDaContaBancaria(){
        return this.numeroDaContaBancaria;
    }

    public void numeroDaContaBancaria(String numeroDaContaBancaria){
        this.numeroDaContaBancaria = numeroDaContaBancaria;
    }
    public String getTipoDeHabilitacao(){
        return this.tipoDeHabilitacao;
    }

    public void tipoDeHabilitacao(String tipoDeHabilitacao){
        this.tipoDeHabilitacao = tipoDeHabilitacao;
    }

}
