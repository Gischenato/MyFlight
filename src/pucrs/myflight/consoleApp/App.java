package pucrs.myflight.consoleApp;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.CiaAerea;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;
import pucrs.myflight.modelo.Rota;
import pucrs.myflight.modelo.Voo;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		//Criando os gerenciadores
		GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
		GerenciadorCias empresas = new GerenciadorCias();
		GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();
		GerenciadorRotas rotas = new GerenciadorRotas();
		GerenciadorVoos voos = new GerenciadorVoos();

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

		//Adicionando as Rotas
		Rota r1 = new Rota(c1, ap1, ap2, a1);
		Rota r2 = new Rota(c2, ap3, ap1, a4);
		Rota r3 = new Rota(c3, ap4, ap2, a2);
		Rota r4 = new Rota(c4, ap2, ap3, a3);
		rotas.adicionar(r1);
		rotas.adicionar(r2);
		rotas.adicionar(r3);
		rotas.adicionar(r4);

		//Criando Data/hora e duracao
		LocalDateTime dh1 = LocalDateTime.of(2020, Month.APRIL, 28, 15, 30);
		LocalDateTime dh2 = LocalDateTime.of(2020, Month.AUGUST, 16, 17, 15);
		LocalDateTime dh3 = LocalDateTime.of(2020, Month.AUGUST, 10, 12, 00);
		LocalDateTime dh4 = LocalDateTime.of(2020, Month.JANUARY, 1, 14, 00); //nao utilizada
		Duration d1 = Duration.ofMinutes(120);
		Duration d2 = Duration.ofMinutes(300);

		//Adicionando os Voos
		Voo v1 = new Voo(r1, dh1, d1);
		Voo v2 = new Voo(r2, dh2, d2);
		Voo v3 = new Voo(r3, dh2, d1);
		Voo v4 = new Voo(r4, dh3, d2);
		voos.adicionar(v1);
		voos.adicionar(v2);
		voos.adicionar(v3);
		voos.adicionar(v4);


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
		
		// System.out.println(aeroportos.listarTodos());

		// String codAeroporto = "GRU";

		// Aeroporto teste4 = aeroportos.buscarPorCodigo(codAeroporto);

		// System.out.println(teste4 == null?("Aeroporto com codigo " + codAeroporto + " nao encontrado") : teste4.getNome());

		//////// TESTE DO GERENCIADOR DE ROTAS ////////

		// System.out.println(rotas.listarTodas());

		// ArrayList<Rota> teste5 = rotas.buscarPorDestino(ap2);
		// if(teste5 != null){
		// 	System.out.printf("Foram encontrados %d rotas:\n", teste5.size());
		// 	for (int i = 0; i < teste5.size(); i++) {
		// 		Rota atual = teste5.get(i);
		// 		System.out.println("  " + atual.toString());
		// 	}
		// }else{
		// 	System.out.println("Nenhuma rota encontrada.");
		// }

		//////// TESTE DO GERENCIADOR DE VOOS ////////

		System.out.println(voos.listarTodos());

		ArrayList<Voo> teste6 = voos.buscarPorData(dh4);
		if(teste6 != null){
			System.out.printf("Encontrei %d voo(s)", teste6.size());
		}else{
			System.out.println("Nao encontrei nenhum voo.");
		}
	}
}