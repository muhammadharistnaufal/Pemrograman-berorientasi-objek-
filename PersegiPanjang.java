/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionFive;

/**
 *
 * @author marse
 */


public class PersegiPanjang extends BangunDatar {
    
    PersegiPanjang (int p, int l) {
        super (p,l);
        
    }
    
    int HitungLuas(){
        int p = super.getP();
        int l = super.getL();
        return p * l ;
    }
    
    int HitungKeliling(){
        int p = super.getP();
        int l = super.getL();
        return 2*(p+l);
    }
    public String toString(){
        String hasil = "Luas Persegi Panjang : " + HitungLuas() + "\n" + 
                "Keliling Persegi Panjang : " + HitungKeliling ();
       
        return hasil;
    }
}
