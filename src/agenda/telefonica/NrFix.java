/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.telefonica;

import javax.swing.JOptionPane;

/**
 *
 * @author AGStan
 */
public class NrFix extends NrTel {
    private String fix;

    //constructor
    public NrFix(String fix) {
        super(fix);
        this.fix = fix;
        
    }
    //getter pentru clasa Fix
    public String getFix(){
        return fix;
    }
    
    //setter pentru clasa Fix
    public void setFix(String fix){
        this.fix = fix;
    }
    
    @Override
    public String toString(){
        return fix;
    }

    public boolean verificareNrTel(String fix) {
        if((fix == null) || (fix.length() != lungimeNumar)){
            JOptionPane.showMessageDialog(null, "Lungimea numarului fix introdus trebuie sa fie de 10 caractere!");
            return false;
        }
        if(fix.startsWith(formatFix)){
             return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Formatul introdus este unul gresit! Trebuie sa inceapa cu 021.");
            return false;
        }
    }

    public int compareTo(NrFix nrFix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
