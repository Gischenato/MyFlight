package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
		GerenciadorCias empresas = new GerenciadorCias();

		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
		Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);
		aeronaves.adicionar(a1);
		aeronaves.adicionar(a2);
		aeronaves.adicionar(a3);
		aeronaves.adicionar(a4);

		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aereas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aereas SA");
		CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aereas");
		empresas.adicionar(c1);
		empresas.adicionar(c2);
		empresas.adicionar(c3);
		empresas.adicionar(c4);

		// System.out.println(aeronaves.listarTodas());

		// String codAeronave = "380";

		// Aeronave teste1 = aeronaves.buscarPorCodigo(codAeronave);

		// if(teste != null){
		// 	System.out.println("\n" + teste.getDescricao());
		// }else{
		// 	System.out.printf("Aeronave com codigo %s nao encontrado\n", cod);
		// }

		System.out.println(empresas.listarTodas());

		String codEmpresa = "G2";
		String nomeEmpresa = "Azul Linhas Aereas";

		CiaAerea teste2 = empresas.buscarPorCodigo(codEmpresa);
		CiaAerea teste3 = empresas.buscarPorNome(nomeEmpresa);

		System.out.println(teste2 == null?("Empresa com codigo " + codEmpresa + " nao encontrado") : teste2.getNome());
		System.out.println(teste3 == null?("Empresa com nome " + nomeEmpresa + " nao encontrado") : teste3.getNome());

	}
}
