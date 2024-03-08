import java.math.BigDecimal;
import java.time.LocalTime;

public class Aposta{
    
    private static int apostas;
    private BigDecimal valorAposta;
    private boolean chuva;
    private LocalTime horario;
    
    public Aposta(BigDecimal valorAposta, boolean chuva, LocalTime horario){
        setValorAposta(valorAposta);
        setChuva(chuva);
        setHorario(horario);
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
    
    private void setHorario(LocalTime horario){
        this.horario = horario;
    }
    
    public LocalTime getHorario(){
        return horario;
    }
}