import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Competicao{
    
    private LocalDateTime dia;
    private LocalTime horario;
    private DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    private boolean chuva;
    private ArrayList<Participante> participantes;
    private ArrayList<Integer> ganhadores;
    private BigDecimal valorTotal;
    
    public Competicao(LocalDateTime dia){
        setDia(dia);
        participantes = new ArrayList<>();
        ganhadores = new ArrayList<>();
    }
    
    private void setDia(LocalDateTime dia){
        this.dia = dia;
    }
    
    public String getDia(){
        String diaFormatado = dia.format(formatoDia);
        return diaFormatado;
    }
    
    public void setChuva(boolean chuva){
        this.chuva = chuva;
    }
    
    public boolean getChuva(){
        return chuva;
    }
    
    public void setHorario(LocalTime horario){
        this.horario = horario;
    }
    
    public String getHorario(){
        String horarioFormatado = horario.format(formatoHora);
        return horarioFormatado;
    }
    
    public void addParticipante(String nome, String cpf){
        participantes.add(new Participante(nome, cpf));
    }
    
    public Participante getParticipante(int id){
        return participantes.get(id);
    }
    
    public BigDecimal setValorTotal(){
        BigDecimal valorTotal = new BigDecimal("0");
        for(int i = 0; i < participantes.size(); i++) {
            Participante aposta = participantes.get(i);
            valorTotal = valorTotal.add(aposta.getApostaValor());
        }
        return valorTotal;
    }
    
    public BigDecimal getValorTotal(){
        return valorTotal;
    }
    
    public ArrayList<Integer> verificaGanhadores(){
        for(int i = 0; i < participantes.size(); i++) {
            Participante aposta = participantes.get(i);
            if(aposta.getApostaChuva() == chuva && aposta.getApostaHorario() == horario) ganhadores.add(i);
        }
        return ganhadores;
    }
}