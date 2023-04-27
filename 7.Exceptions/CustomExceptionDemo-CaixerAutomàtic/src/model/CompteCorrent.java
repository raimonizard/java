package model;

import excepcions.BalancNegatiu;
import excepcions.MassaDiners;

public class CompteCorrent {
    //attributes
    private double quantitatDiners;
    private double limitDiari;

    //constructors
    public CompteCorrent(){
        this.quantitatDiners = 0;
    }

    public CompteCorrent(double c, double ld){
        this.quantitatDiners = c;
        this.limitDiari = ld;
    }

    //methods
    public double getQuantitatDiners() {
        return this.quantitatDiners;
    }

    public void ingres(double c) throws MassaDiners{
        this.quantitatDiners +=c;
        if (this.quantitatDiners > 1000000) {
            throw new MassaDiners();
        }
    }

    public void treureDiners(double c) throws BalancNegatiu {
        if(this.quantitatDiners < c) {
            throw new BalancNegatiu("No pots treure tants diners; actualment disposes de: " + getQuantitatDiners());
        }else {
            quantitatDiners -= c;
        }
    }
}