/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptateur;

import commerce.PortableSamSaoule;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        Chargeur chargeur = new Chargeur();
        IChargeable monCadeau = new TelCarouf();
        
        chargeur.brancherPortable(monCadeau);
        
        PortableSamSaoule sam = new PortableSamSaoule();
        
        IChargeable sam2 = new AdaptateurSamSaoule(sam);
        chargeur.brancherPortable(sam2);
    }
}
