/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorateur;

/**
 *
 * @author 33676
 */
public class DecorateurFacture extends Facture{
    private Facture objetDecore;
    
    public DecorateurFacture(Facture decore){
        objetDecore = decore;
    }
    @Override
    public void imprimeToi() {
        objetDecore.imprimeToi();
    }
    
}
