package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Month;

public class VooDireto extends Voo{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	private static int totalVoos = 0;
	
	public VooDireto(Rota rota, LocalDateTime datahora) {
		totalVoos++;
		this.rota = rota;
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado

		Aeroporto origem = rota.getOrigem();
		Aeroporto destiono = rota.getDestino();

		

	}


	public Rota getRota() { return rota; }
	
	@Override
	public LocalDateTime getDataHora() { return datahora; }
	
	@Override
	public Duration getDuration() {

		return this.duracao;
	 }
	
	public Status getStatus() { return status; }

	public static int getTotalVoos(){ return totalVoos; }
	
	public void setStatus(Status novoStatus) {
		this.status = novoStatus;
	}

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
