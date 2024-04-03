public class Motorista {
    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private String numeroDaContaBancaria;
    private String tipoDeHabilitacao;

    Motorista(){
        this("Isabelle", 18, "12345123122", "999999999", "1234", "A-B-C");
    }
    
    Motorista(String nome, int idade, String cpf, String telefone, String numeroDaContaBancaria, String tipoDeHabilitacao){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDaContaBancaria = numeroDaContaBancaria;
        this.telefone = telefone;
        this.tipoDeHabilitacao = tipoDeHabilitacao;
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void telefone(String telefone){
        this.telefone = telefone;
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