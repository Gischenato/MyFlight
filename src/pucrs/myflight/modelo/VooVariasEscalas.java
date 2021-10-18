package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends VooDireto{
    private ArrayList<VooDireto> escalas;

    public VooVariasEscalas(Rota rota, LocalDateTime datahora, Duration duracao, ArrayList<VooDireto> escalas) {
        super(rota, datahora);
        this.escalas = escalas;
    }

     @Override
     public String toString() {
        String res = "";
        for(VooDireto voo : escalas) {
            res += voo.toString() + "\n";
        }

        return "Voo com varias escalas: -------------------------------\n" 
             + super.toString() + "\n" + res 
             + "-------------------------------------------------------";
    }

}
