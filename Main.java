import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Main
{
	public static void main(String[] args) {
		
		BigDecimal valor;
		LocalDateTime dia1 = LocalDateTime.now();
		
// 		System.out.println("Dia: " + dia1.toLocalDate());
// 		System.out.println("Hora: " + dia1.toLocalTime());
		
		Competicao comp1 = new Competicao(dia1.plusDays(1));
		System.out.println("Competição: " + comp1.getDia());
		
// 		Participante participante1 = new Participante("participante1", "1");
// 		System.out.println("Participante " + participante1.getNome());
// 		valor = new BigDecimal("123.45");
// 		participante1.setAposta(valor , true, "10:40" );
// // 		System.out.println("ID Aposta: " + participante1.aposta);
// // 		System.out.println("Valor: " + aposta.get(0).getValorAposta());
		
// 		Participante participante2 = new Participante("participante2", "2");
// 		Participante participante3 = new Participante("participante3", "3");
		
		comp1.addParticipante("participante1", "1");
		
		comp1.participantes.get(0);
		
		comp1.setChuva(false);
		System.out.println("Chuva: " + comp1.getChuva());
		if(comp1.getChuva()){
		    comp1.setHorario(dia1);
		    System.out.println(comp1.getHorario());
		}
		
		
	}
}
