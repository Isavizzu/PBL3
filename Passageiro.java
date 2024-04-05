public class Passageiro extends Usuario{
    private String enderecodecobranca;

    public Passageiro (String nome, String genero, String datadenascimento, String cpf, String enderecodecobranca){
        super(nome,genero,datadenascimento,cpf);
        this.enderecodecobranca = enderecodecobranca;
    }
}
