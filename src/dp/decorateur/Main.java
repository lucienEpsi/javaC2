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
public class Main {
    public static void main(String[] args) {
        Facture fs = new FactureSimple();
        fs.imprimeToi();
        System.out.println("**************");
        //verification que le decorateur n'affecte pas le comportement
        Facture fd = new DecorateurFacture(fs);
        fd.imprimeToi();
        //on decore veritablement avec entete
        System.out.println("*******Entete**********");
        Facture fe = new Entete(fs, "EPSI");
        fe.imprimeToi();
        
        System.out.println("Pub");
        Facture fp = new Pub(fs,"Chez Dell ...");
        fp.imprimeToi();
        
        System.out.println("*************************");
        Facture f = new FactureSimple();
        Facture fp0 = new Pub(f,"Chez Dell ...");
        Facture fp1 = new Pub(fp0,"Nouvelle Pub");
        Facture fe0 = new Entete(fp1, "EPSI Montpellier");
        Facture fe1 = new Entete(fe0, "EPSI");
        fe1.imprimeToi();
        
        f.imprimeToi();
        System.out.println("*************************************************");
        Facture fComplexe = new Entete(new Pub(new Pub(new FactureSimple(),"DELL"),"CASTO"),"EPSI");
        fComplexe.imprimeToi(); 
    }
}
