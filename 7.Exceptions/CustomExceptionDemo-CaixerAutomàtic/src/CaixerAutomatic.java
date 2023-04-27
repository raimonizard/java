import excepcions.BalancNegatiu;
import excepcions.MassaDiners;
import model.CompteCorrent;
import utils.Utilities;

public class CaixerAutomatic {
    //attributes
    private static CompteCorrent acc;

    //methods
    public static void main(String[] args){

        acc = new CompteCorrent(100, 200);
        System.out.println("New account created. Current account balance is " + acc.getQuantitatDiners());
        newDeposit(Utilities.llegirFloat("Escriu l'import a ingressar",1,1000000000));
        newWithdraw(Utilities.llegirFloat("Escriu l'import a treure", 1, 1000000000));
    }

    public static void newDeposit(double c){
        try {
            acc.ingres(c);
        }catch(MassaDiners md){
            System.out.println(md.getMessage());
        }catch(Exception e){
            System.out.println("ERROR: Desconegut " + e);
        }finally {
            System.out.println("Deposit of " + c +" registered. New account balance is " + acc.getQuantitatDiners());
        }
    }

    public static void newWithdraw(double c){
        try {
            acc.treureDiners(c);
            System.out.println("Withdraw of " + c + " registered. New account balance is " + acc.getQuantitatDiners());
        }catch(BalancNegatiu e){
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println("Something went wrong during withdraw operation.");
        }
    }
}
