import java.util.ArrayList;

public class Passageiro extends Usuario{
    private String enderecodecobranca;
    private ArrayList<Endereco> enderecos;

    public Passageiro (String nome, String genero, String datadenascimento, String cpf, String enderecodecobranca){
        super(nome,genero,datadenascimento,cpf);
        this.enderecodecobranca = enderecodecobranca;
        this.enderecos = new ArrayList<>();

    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    
    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }
    
    
}
