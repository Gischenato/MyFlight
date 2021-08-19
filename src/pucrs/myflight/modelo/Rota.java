package pucrs.myflight.modelo;

public class Rota {
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	
	public CiaAerea getCia() { return cia; }
	
	public Aeroporto getDestino() { return destino; } 
	
	public Aeroporto getOrigem() { return origem; } 
	
	public Aeronave getAeronave() { return aeronave; } 

	public String toString(){
		String res = "";
		res += cia.getCodigo() + "\t" + origem.getCodigo() + " --> " + destino.getCodigo() + " | " + aeronave.getCodigo();
		return res;
	}
}
