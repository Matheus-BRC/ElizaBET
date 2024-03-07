import java.util.ArrayList;
import java.math.BigDecimal;

public class Participante{
    
    private String nome;
    private String cpf;
    // private ArrayList<Aposta> aposta;
    private Aposta aposta;
    
    public Participante(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
        // aposta = new ArrayList<>();
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    private void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    // public void setAposta(BigDecimal valorAposta, boolean chuva, String horario){
    //     aposta.add(new Aposta(valorAposta, chuva, horario));
    // }
    
    // public int getAposta(int id){
    //     return aposta.get(id).getId();
    // }
    
    public void setAposta(BigDecimal valorAposta, boolean chuva, String horario){
        Aposta aposta = new Aposta(valorAposta, chuva, horario);
    }
}