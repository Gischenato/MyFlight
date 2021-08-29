package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;
	private static int totalVoos = 0;
	
	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		totalVoos++;
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	
	public Voo(Rota rota, Duration duracao){
		this.rota = rota;
		this.datahora = LocalDateTime.of(2021, Month.AUGUST, 20, 12, 0);
		this.duracao = duracao;
		this.status = Status.CONFIRMADO;
	}

	public Rota getRota() { return rota; }
	
	public LocalDateTime getDatahora() { return datahora; }
	
	public Duration getDuracao() { return duracao; }
	
	public Status getStatus() { return status; }

	public static int getTotalVoos(){ return totalVoos; }
	
	public void setStatus(Status novoStatus) {
		this.status = novoStatus;
	}
}
