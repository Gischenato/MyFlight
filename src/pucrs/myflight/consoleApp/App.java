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
import pucrs.myflight.modelo.VooDireto;
import pucrs.myflight.modelo.VooEscalas;

public class App {

     public static void main(String[] args) {
          System.out.println("\nMyFlight project...");

          // Criando os gerenciadores
          GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
          GerenciadorCias empresas = new GerenciadorCias();
          GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();
          GerenciadorRotas rotas = new GerenciadorRotas();
          GerenciadorVoos voos = new GerenciadorVoos();
          
          try {
               empresas.carregaDados();
          } catch (Exception e) {
               System.out.println("Erro de IO ao carregar dados.");
          }

          System.out.println(empresas.getTotalCadastrados());

          // // Adicionando as Aeronaves
          // Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
          // Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
          // Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
          // Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);
          // aeronaves.adicionar(a1);
          // aeronaves.adicionar(a2);
          // aeronaves.adicionar(a3);
          // aeronaves.adicionar(a4);

          // // Adicionando as CiaAereas
          // CiaAerea c1 = new CiaAerea("JJ", "LATAM Linhas Aereas");
          // CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aereas SA");
          // CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
          // CiaAerea c4 = new CiaAerea("AD", "Azul Linhas Aereas");
          // empresas.adicionar(c1);
          // empresas.adicionar(c2);
          // empresas.adicionar(c3);
          // empresas.adicionar(c4);

          // // Criando as coordenadas
          // Geo g1 = new Geo(-29.9939, -51.1711);
          // Geo g2 = new Geo(-23.4356, -46.4731);
          // Geo g3 = new Geo(38.7742, -9.1342);
          // Geo g4 = new Geo(25.7933, -80.2906);

          // // Adicionando os Aeroportos
          // Aeroporto ap1 = new Aeroporto("POA", "Salgado Filho Intl Apt", g1);
          // Aeroporto ap2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", g2);
          // Aeroporto ap3 = new Aeroporto("LIS", "Lisbon", g3);
          // Aeroporto ap4 = new Aeroporto("MIA", "Miami International Apt", g4);
          // aeroportos.adicionar(ap1);
          // aeroportos.adicionar(ap2);
          // aeroportos.adicionar(ap3);
          // aeroportos.adicionar(ap4);

          // // Adicionando as Rotas
          // Rota r1 = new Rota(c1, ap1, ap2, a1);
          // Rota r2 = new Rota(c2, ap3, ap1, a4);
          // Rota r3 = new Rota(c3, ap4, ap2, a2);
          // Rota r4 = new Rota(c4, ap2, ap3, a3);
          // Rota r5 = new Rota(c2, ap3, ap4, a1);
          // rotas.adicionar(r1);
          // rotas.adicionar(r2);
          // rotas.adicionar(r3);
          // rotas.adicionar(r4);
          // rotas.adicionar(r5);

          // // Criando Data/hora e duracao
          // LocalDateTime dh1 = LocalDateTime.of(2020, Month.APRIL, 28, 15, 30);
          // LocalDateTime dh2 = LocalDateTime.of(2020, Month.APRIL, 28, 20, 00);
          // LocalDateTime dh3 = LocalDateTime.of(2020, Month.APRIL, 10, 12, 00);
          // LocalDateTime dh4 = LocalDateTime.of(2020, Month.APRIL, 28, 20, 00);
          // Duration d1 = Duration.ofMinutes(120);
          // Duration d2 = Duration.ofMinutes(300);
          // Duration d3 = Duration.ofMinutes(200);
          // Duration d4 = Duration.ofMinutes(600);

          // // Adicionando os Voos
          // VooDireto v1 = new VooDireto(r1, dh1);
          // VooDireto v2 = new VooDireto(r2, dh2);
          // VooDireto v3 = new VooDireto(r3, dh2);
          // VooDireto v4 = new VooDireto(r4, dh3);
          // VooDireto v5 = new VooDireto(r5, dh1);

          // ArrayList<VooDireto> listaEscalaDeVoos = new ArrayList<>();
          // listaEscalaDeVoos.add(v2);
          // listaEscalaDeVoos.add(v1);
          // listaEscalaDeVoos.add(v4);
          // listaEscalaDeVoos.add(v5);

          // voos.adicionar(v1);
          // voos.adicionar(v2);
          // voos.adicionar(v3);
          // voos.adicionar(v4);
          // voos.adicionar(v5);

          // // ////// TESTE DO GERENCIADOR DE AERONAVES ////////

          // // System.out.println(aeronaves.toString());
          // // aeronaves.ordenaDescricao(); //Ordenando a lista.
          // // System.out.println("Ordendado");
          // // System.out.println(aeronaves.toString());

          // // String codAeronave = "380";

          // // Aeronave teste1 = aeronaves.buscarPorCodigo(codAeronave);

          // // if(teste1 != null){
          // // System.out.println("\n" + teste1.getDescricao());
          // // }else{
          // // System.out.printf("Aeronave com codigo %s nao encontrado\n", codAeronave);
          // // }

          // // /////// TESTE DO GERENCIADOR DE CIAS ////////

          // // System.out.println(empresas.toString());

          // // String codEmpresa = "G2";
          // // String nomeEmpresa = "Azul Linhas Aereas";

          // // CiaAerea teste2 = empresas.buscarPorCodigo(codEmpresa);
          // // CiaAerea teste3 = empresas.buscarPorNome(nomeEmpresa);

          // // System.out.println(teste2 == null?("Empresa com codigo " + codEmpresa + " nao
          // // encontrado") : teste2.getNome());
          // // System.out.println(teste3 == null?("Empresa com nome " + nomeEmpresa + " nao
          // // encontrado") : teste3.getNome());

          // // ////// TESTE DO GERENCIADOR DE AEROPORTOS ////////

          // // System.out.println(aeroportos.toString());
          // // aeroportos.ordenaDescricao(); //Ordenando a lista.
          // // System.out.println("Ordendado");
          // // System.out.println(aeroportos.toString());

          // // String codAeroporto = "GRU";

          // // Aeroporto teste4 = aeroportos.buscarPorCodigo(codAeroporto);

          // // System.out.println(teste4 == null?("Aeroporto com codigo " + codAeroporto + "
          // // nao encontrado") : teste4.getNome());

          // // ////// TESTE DO GERENCIADOR DE ROTAS ////////

          // // System.out.println(rotas.toString());
          // // rotas.ordenaDescricao();
          // // System.out.println("Ordendado");
          // // System.out.println(rotas.toString());

          // // ArrayList<Rota> teste5 = rotas.buscarPorDestino(ap2);
          // // if(teste5 != null){
          // // System.out.printf("Foram encontrados %d rotas:\n", teste5.size());
          // // for (int i = 0; i < teste5.size(); i++) {
          // // Rota atual = teste5.get(i);
          // // System.out.println(" " + atual.toString());
          // // }
          // // }else{
          // // System.out.println("Nenhuma rota encontrada.");
          // // }

          // // ////// TESTE DO GERENCIADOR DE VOOS ////////
          // // ArrayList<VooDireto> listaDeVoos = voos.listarTodos();

          // // System.out.println(voos.toString());
          // // System.out.println("\n");
          // // // System.out.println("Lista de voos: (usando foreach e listarTodos())");
          // // // for (Voo voo : listaDeVoos) {
          // // // System.out.println(voo.toString());
          // // // }

          // // ArrayList<VooDireto> teste6 = voos.buscarPorData(dh4);
          // // if(teste6 != null){
          // // System.out.printf("Encontrei %d voo(s)", teste6.size());
          // // }else{
          // // System.out.println("Nao encontrei nenhum voo.");
          // // }

          // // //////// TESTANDO A FUNCAO DISTANCIA ////////

          // // Aeroporto salgadoFilho = aeroportos.buscarPorCodigo("POA");
          // // Aeroporto guarulhos = aeroportos.buscarPorCodigo("GRU");

          // // double distancia = Geo.distancia(salgadoFilho.getLocal(),
          // // guarulhos.getLocal());

          // // System.out.printf("A distancia entre %s e %s eh
          // // %.2fkm\n",salgadoFilho.getCodigo(), guarulhos.getCodigo(), distancia);

          // // System.out.println(g1.distancia(g2));

         

     }
}
