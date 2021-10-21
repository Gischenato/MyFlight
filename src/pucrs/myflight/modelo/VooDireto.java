package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Month;

public class VooDireto extends Voo{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private Rota rota;
	private Status status;
	
	public VooDireto(Rota rota, LocalDateTime datahora) {
		super(datahora);
		this.rota = rota;
		this.status = Status.CONFIRMADO; // default é confirmado
	}


	public Rota getRota() { return rota; }
	
	@Override
	public Duration getDuration() {
		Aeroporto origem = rota.getOrigem();
		Aeroporto destino = rota.getDestino();
		double distancia = origem.getLocal().distancia(destino.getLocal());
		double tempo = (distancia/805 + 0.5) * 60;
		Duration duration = Duration.ofMinutes( (long) tempo);
		return duration;
	 }
	
	public Status getStatus() { return status; }

	
	public void setStatus(Status novoStatus) {
		this.status = novoStatus;
	}

	@Override
	public String toString(){
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String res = "";

		res += "  "+getRota().toString() + "   " + getDataHora().getHour();
		res += ":" + (getDataHora().getMinute()== 0 ? "00" : getDataHora().getMinute()); 
		res += "    " + getDuration().toMinutes();
		res += "   " + getDataHora().format(formatado) + "";

		return res;
	}




}
