public class Cliente {
    private String nome;
    private int idade;
    private char genero;
    private String cpf;
    private String telefone;

   public Cliente(){
       this("Usuário", 0, 'V', "99999999999", "999999999999");

   }

   public Cliente(String nome, int idade, char genero, String cpf, String telefone){
       this.nome = nome;
       this.idade = idade;
       this.genero = genero;
       this.cpf = cpf;
       this.telefone = telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public char getGenero(){
        return this.genero;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }


}