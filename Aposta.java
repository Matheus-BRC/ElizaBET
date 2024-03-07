import java.math.BigDecimal;

public class Aposta{
    
    private static int apostas;
    private int id;
    private BigDecimal valorAposta;
    private boolean chuva;
    private String horario;
    
    public Aposta(BigDecimal valorAposta, boolean chuva, String horario){
        setId(apostas);
        setValorAposta(valorAposta);
        setChuva(chuva);
        setHorario(horario);
    }
    
    private void setId(int apostas){
        apostas++;
        this.id = apostas;
    }
    
    public int getId(){
        return id;
    }
    
    private void setValorAposta(BigDecimal valorAposta){
        this.valorAposta = valorAposta;
    }
    
    public BigDecimal getValorAposta(){
        return valorAposta;
    }
    
    private void setChuva(boolean chuva){
        this.chuva = chuva;
    }
    
    public boolean getChuva(){
        return chuva;
    }
    
    private void setHorario(String horario){
        this.horario = horario;
    }
    
    public String getHorario(){
        return horario;
    }
}