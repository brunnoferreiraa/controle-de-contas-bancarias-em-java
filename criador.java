package src.Program;

public class criador {

    private static int counter = 1;
    
    private String NomeDaPessoa;
    private String CPFDaPessoa;
    private String EmailDaPessoa;

    private String Nome;

    private String Email;

    private String CPF;

    private String Email;

    

    public String getNome(){
        return NomeDaPessoa;
    }

    public void setNome(String NomeDaPessoa){
        this.Nome = NomeDaPessoa;
    }
    
    public String getCPF(){
        return CPFDaPessoa;
    }

    public void setCPF (String CPFDaPessoa){
        this.CPF = CPFDaPessoa;
    }

    public String getEmail (){
        return EmailDaPessoa;
    }

    public void setEmail (String EmailDaPessoa){
        this.Email = EmailDaPessoa;
    }

    public String toString(){
        return "\nNomeDaPessoa: " + this.getNome() +
                "\nCPF: " + this.getCPF() + 
                "\nEmail " + this.getEmail() ;
    }


}
