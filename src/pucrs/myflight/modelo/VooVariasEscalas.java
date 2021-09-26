package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo{
    private ArrayList<Voo> escalas;

    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao, ArrayList<Voo> escalas) {
        super(rota, datahora, duracao);
        this.escalas = escalas;
    }

     @Override
     public String toString() {
        String res = "";
        for(Voo voo : escalas) {
            res += voo.toString() + "\n";
        }

        return "Voo com varias escalas: -------------------------------\n" 
             + super.toString() + "\n" + res 
             + "-------------------------------------------------------";
    }

}
