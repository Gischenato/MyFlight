package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
		empresas.add(cia);
	}

	public String listarTodas(){
		String res = "Empresas:\n";

		for(int i = 0; i<empresas.size(); i++){
			CiaAerea atual = empresas.get(i);
			res += "  ("+ atual.getCodigo() + ") - " + atual.getNome() +"\n";
		}

		return res;
	}

	public CiaAerea buscarPorCodigo(String cod){
		for(int i = 0; i<empresas.size(); i++){
			CiaAerea atual = empresas.get(i);
			if(cod == atual.getCodigo()){ return atual; }
		}

		return null;
	}

	public CiaAerea buscarPorNome(String nome){
		for(int i = 0; i<empresas.size(); i++){
			CiaAerea atual = empresas.get(i);
			if(nome == atual.getNome()){ return atual; }
		}
		return null;
	}
}
