import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Competicao{
    
    private LocalDateTime dia;
    private LocalDateTime horario;
    private DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    boolean chuva;
    private ArrayList<Participante> participantes;
    
    public Competicao(LocalDateTime dia){
        setDia(dia);
        participantes = new ArrayList<>();
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
    
    public void setHorario(LocalDateTime horario){
        this.horario = horario;
    }
    
    public String getHorario(){
        String horarioFormatado = horario.format(formatoHora);
        return horarioFormatado;
    }
    
    public void addParticipante(String nome, String cpf){
        participantes.add(new Participante(nome, cpf));
    }
}