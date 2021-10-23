package pucrs.myflight.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void adicionar(CiaAerea cia){
		empresas.add(cia);
	}

	public int getTotalCadastrados(){
        return empresas.size();
    }

    public void carregaDados() throws IOException{
		Path dados = Paths.get("src\\pucrs\\myflight\\data\\airlines.dat");
        Scanner reader = new Scanner(Files.newBufferedReader(dados));
		reader.useDelimiter("[;\n]");
		reader.nextLine();
		int erros = 0;
        while(reader.hasNext()){
            try {
                String codigo = reader.next();
                String nome = reader.next();
				CiaAerea cia = new CiaAerea(codigo, nome);
				adicionar(cia);

            } catch (Exception e) {
				erros++;
			}
        }
		if(erros > 0) System.out.println(erros + " erros ao adicionar cias");
    }

	public ArrayList<CiaAerea> listarTodos(){
        return empresas;
    }

	public String toString(){
		String res = "Empresas:\n";

		for(int i = 0; i<empresas.size(); i++){
			CiaAerea atual = empresas.get(i);
			res += "  "+ atual.toString() + "\n";
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
