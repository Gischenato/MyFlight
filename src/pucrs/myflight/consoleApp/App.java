package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.GerenciadorAeronaves;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");

		GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();

		Aeronave a1 = new Aeronave("122", "nave1", 144);
		Aeronave a2 = new Aeronave("123", "nave2 testada", 144);
		Aeronave a3 = new Aeronave("124", "nave3", 144);

		aeronaves.adicionar(a1);
		aeronaves.adicionar(a2);
		aeronaves.adicionar(a3);

		System.out.println(aeronaves.listarTodas());

		String cod = "122";

		Aeronave teste = aeronaves.buscarPorCodigo(cod);

		if(teste != null){
			System.out.println("\n" + teste.getDescricao());
		}else{
			System.out.printf("Aeronave com codigo %s nao encontrado\n", cod);
		}

	}
}
