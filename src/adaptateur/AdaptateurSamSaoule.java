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
public class AdaptateurSamSaoule implements IChargeable {
    private PortableSamSaoule monTel;
    public AdaptateurSamSaoule(PortableSamSaoule sam) {
        monTel = sam;
    }

    @Override
    public void recharger(int volts) {
        
        System.out.println("Je suis enfin en charge "+volts);
        monTel.ChargerPortable(volts);
    }
    
}
