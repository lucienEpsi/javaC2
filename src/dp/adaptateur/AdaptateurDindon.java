/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adaptateur;

import dp.strategie.*;

/**
 *
 * @author 33676
 */
public class AdaptateurDindon extends Canard{
    private Dodo d;
    
    public AdaptateurDindon(){
        super(new NoVol());
        d = new Dodo();
    }
    @Override
    public void afficheToi() {
        System.out.println("Je suis un Dodo");
    }
    @Override
    public void faitCoinCoin(){
        d.faitGlouGlou();
    }
    
}
