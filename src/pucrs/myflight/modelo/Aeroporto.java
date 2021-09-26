package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	private static int totalAeroportos = 0;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		totalAeroportos++;
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() { return codigo; }
	
	public String getNome() { return nome; }
	
	public Geo getLocal() { return loc; }

	@Override
	public int compareTo(Aeroporto outra) {return nome.compareTo(outra.getNome());}

	@Override
	public String toString(){
		return "(" + getCodigo() + ") - " + getNome();
	}

	public static int getTotalAeroportos(){ return totalAeroportos; }
}
