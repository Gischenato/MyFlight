package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		//Criando os gerenciadores
		GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
		GerenciadorCias empresas = new GerenciadorCias();
		GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();

		//Adicionando as Aeronaves
		Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
		Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
		Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
		Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);
		aeronaves.adicionar(a1);
		aeronaves.adicionar(a2);
		aeronaves.adicionar(a3);
		aeronaves.adicionar(a4);

		//Adicionando as CiaAereas
		CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aereas");
		CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aereas SA");
		CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
		CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aereas");
		empresas.adicionar(c1);
		empresas.adicionar(c2);
		empresas.adicionar(c3);
		empresas.adicionar(c4);

		//Criando as coordenadas
		Geo g1 = new Geo(-29.9939, -51.1711);
		Geo g2 = new Geo(-23.4356, -46.4731);
		Geo g3 = new Geo(38.7742, -9.1342);
		Geo g4 = new Geo(25.7933, -80.2906);

		//Adicionando os Aeroportos
		Aeroporto ap1 = new Aeroporto("POA", "Salgado Filho Intl Apt", g1);
		Aeroporto ap2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", g2);
		Aeroporto ap3 = new Aeroporto("LIS", "Lisbon", g3);
		Aeroporto ap4 = new Aeroporto("MIA", "Miami International Apt", g4);
		aeroportos.adicionar(ap1);
		aeroportos.adicionar(ap2);
		aeroportos.adicionar(ap3);
		aeroportos.adicionar(ap4);



		//////// TESTE DO GERENCIADOR DE AERONAVES ////////

		// System.out.println(aeronaves.listarTodas());

		// String codAeronave = "380";

		// Aeronave teste1 = aeronaves.buscarPorCodigo(codAeronave);

		// if(teste != null){
		// 	System.out.println("\n" + teste.getDescricao());
		// }else{
		// 	System.out.printf("Aeronave com codigo %s nao encontrado\n", cod);
		// }

		///////// TESTE DO GERENCIADOR DE CIAS ////////

		// System.out.println(empresas.listarTodas());

		// String codEmpresa = "G2";
		// String nomeEmpresa = "Azul Linhas Aereas";

		// CiaAerea teste2 = empresas.buscarPorCodigo(codEmpresa);
		// CiaAerea teste3 = empresas.buscarPorNome(nomeEmpresa);

		// System.out.println(teste2 == null?("Empresa com codigo " + codEmpresa + " nao encontrado") : teste2.getNome());
		// System.out.println(teste3 == null?("Empresa com nome " + nomeEmpresa + " nao encontrado") : teste3.getNome());

		//////// TESTE DO GERENCIADOR DE AEROPORTOS ////////
		
		System.out.println(aeroportos.listarTodos());

		String codAeroporto = "GRU";

		Aeroporto teste4 = aeroportos.buscarPorCodigo(codAeroporto);

		System.out.println(teste4 == null?("Aeroporto com codigo " + codAeroporto + " nao encontrado") : teste4.getNome());

	}
}
