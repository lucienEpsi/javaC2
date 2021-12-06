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
public class Main {
    public static void main(String[] args) {
        Chargeur chargeur = new Chargeur();
        IChargeable monCadeau = new TelCarouf();
        
        chargeur.brancherPortable(monCadeau);
        
        PortableSamSaoule sam = new PortableSamSaoule();
        
        IChargeable sam2 = new AdaptateurSamSaoule(sam);
        chargeur.brancherPortable(sam2);
        
        
        PortableSonneEricSonne erick = new PortableSonneEricSonne();
         IChargeable adaptateurErick = new AdaptateurSonneEricSonne(erick);
        
        chargeur.brancherPortable(adaptateurErick);
    }
}
