/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategie;

//import dp.adaptateur.AdaptateurDindon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        List<Canard> canards = initCanards();
        //canards.add(new AdaptateurDindon());
        for(Canard c : canards){
            c.faitCoinCoin();
            c.afficheToi();
            c.envoleToi();
        }
        System.out.println("Le canard en bois reçoit des ailes mécaniques a Noel");
        distributCadeaux(canards, 2);
        for(Canard c : canards){
            c.afficheToi();
            c.envoleToi();
        }
    }

    private static List<Canard> initCanards() {
        List<Canard> canards = new ArrayList<>();
        canards.add( 
                new Morillon(new VolAvecAiles()));
        canards.add(
                new Colvert(new VolAvecAiles()));
        canards.add(
                new CanardEnBois(new NoVol()));
        return canards;
    }

    private static void distributCadeaux(List<Canard> canards, int indice) {
        canards.get(indice).setMaFaconDeVoler(new VolAvecAiles());
    }
}
