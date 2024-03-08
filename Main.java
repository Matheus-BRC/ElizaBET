import java.time.LocalDateTime;
import java.time.LocalTime;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
		
		LocalDateTime dia1 = LocalDateTime.now();
		LocalTime hora1 = LocalTime.now();
		BigDecimal valor = new BigDecimal("10");
		
		Competicao comp1 = new Competicao(dia1.plusDays(1));
		System.out.println("Competição: " + comp1.getDia());
		
		comp1.addParticipante("participante1", "1");
		Participante participante1 = comp1.getParticipante(0);
		participante1.setAposta(valor, true, hora1);
		System.out.println("\nParticipante: " + participante1.getNome());
		System.out.println("Chuva: " + participante1.getApostaChuva());
		System.out.println("Horario: " + participante1.getApostaHorario());
		System.out.println("Valor: " + participante1.getApostaValor());
		
		comp1.addParticipante("participante2", "2");
		Participante participante2 = comp1.getParticipante(1);
		participante2.setAposta(valor, false, hora1);
		System.out.println("\nParticipante: " + participante2.getNome());
		System.out.println("Chuva: " + participante2.getApostaChuva());
		System.out.println("Horario: " + participante2.getApostaHorario());
		System.out.println("Valor: " + participante2.getApostaValor());
		
		comp1.addParticipante("participante3", "3");
		Participante participante3 = comp1.getParticipante(2);
		participante3.setAposta(valor, true, hora1);
		System.out.println("\nParticipante: " + participante3.getNome());
		System.out.println("Chuva: " + participante3.getApostaChuva());
		System.out.println("Horario: " + participante3.getApostaHorario());
		System.out.println("Valor: " + participante3.getApostaValor());
		
		System.out.println("\nValor Total: " + comp1.setValorTotal());
		
		comp1.setChuva(true);
		comp1.setHorario(hora1);
		
		ArrayList<Integer> ganhadores = comp1.verificaGanhadores();
		BigDecimal valorGanhador = comp1.setValorTotal().divide(BigDecimal.valueOf(ganhadores.size()));
		
		System.out.println("\nGanhadores: ");
		for(int i = 0; i < ganhadores.size(); i++) {
		    int ganhador = ganhadores.get(i);
		    Participante participanteGanhador = comp1.getParticipante(ganhador);
		    System.out.println(participanteGanhador.getNome() + " = " + valorGanhador);
		}
	}
}
