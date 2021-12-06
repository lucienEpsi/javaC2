/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptateur;

import commerce.PortableSamSaoule;
import commerce.PortableSonneEricSonne;

/**
 *
 * @author 33676
 */
public class AdaptateurSonneEricSonne implements IChargeable {
    private PortableSonneEricSonne monTel;
    public AdaptateurSonneEricSonne(PortableSonneEricSonne sam) {
        monTel = sam;
    }

    @Override
    public void recharger(int volts) {
        System.out.println("Je suis enfin en charge à 5 volts");
        monTel.ChargerBatteries(5);
    }
    
}
