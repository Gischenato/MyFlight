package pucrs.myflight.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GerenciadorAeroportos {
     private ArrayList<Aeroporto> aeroportos;

     public GerenciadorAeroportos(){
          aeroportos = new ArrayList<>();
     }

     public void adicionar(Aeroporto aeroporto){
          aeroportos.add(aeroporto);
     }

     public int getTotalCadastrados(){
          return aeroportos.size();
     }

     public void carregaDados() throws IOException{
               Path dados = Paths.get("src/pucrs/myflight/data/airports.dat");
          Scanner reader = new Scanner(Files.newBufferedReader(dados));
          reader.useDelimiter("[;\n]");
          reader.nextLine();
          int erros = 0;
          while (reader.hasNext()) {
               try {
                    String codigo = reader.next();
                    double latitude = Double.parseDouble(reader.next());
                    double longitude = Double.parseDouble(reader.next());
                    String nome = reader.next();
                    reader.next();
                    Geo loc = new Geo(latitude, longitude);
                    Aeroporto aeroporto = new Aeroporto(codigo, nome, loc);
                    adicionar(aeroporto);
                    
               } catch (Exception e) {
                    erros++;
               }
          }
          if(erros > 0) System.out.println(erros + " erros ao adicionar aeroportos");
          
     }

     public ArrayList<Aeroporto> listarTodos(){
          return aeroportos;
     }

     public void ordenaDescricao() {
          Collections.sort(aeroportos);
     }

     public String toString(){
          String res = "Aeroportos:\n";

          for(int i = 0; i<aeroportos.size(); i++){
               Aeroporto atual = aeroportos.get(i);
               res += "  " + atual.toString() + "\n";
          }
          return res;
     }

     public Aeroporto buscarPorCodigo(String cod) throws NoSuchElementException{
          var optional = aeroportos.stream()
                                   .filter(p -> p.getCodigo().equals(cod))
                                   .findFirst();

          return (optional.isEmpty()) ? null : optional.get();
     }
}
