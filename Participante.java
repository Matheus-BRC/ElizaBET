import java.util.ArrayList;
import java.math.BigDecimal;
import java.time.LocalTime;

public class Participante{
    
    private String nome;
    private String cpf;
    private Aposta aposta;
    
    public Participante(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
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
    
    public void setAposta(BigDecimal valorAposta, boolean chuva, LocalTime horario){
        aposta = new Aposta(valorAposta, chuva, horario);
    }
    
    public BigDecimal getApostaValor(){
        return aposta.getValorAposta();
    }
    
    public boolean getApostaChuva(){
        return aposta.getChuva();
    }
    
    public LocalTime getApostaHorario(){
        return aposta.getHorario();
    }
}