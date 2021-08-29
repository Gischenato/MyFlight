package pucrs.myflight.modelo;

public class CiaAerea {
	private String codigo;
	private String nome;
	private static int totalCias = 0;
	
	public CiaAerea(String codigo, String nome) {
		totalCias++;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() { return codigo; }
	
	public String getNome() { return nome; }	

	public static int getTotalCias(){ return totalCias; }
}
