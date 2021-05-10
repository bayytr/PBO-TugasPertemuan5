/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;
import bidang.Lingkaran;

/**
 *
 * @author Bayu Tri Nugroho
 */

//                  Inheritance          Interface
public class Kerucut extends Lingkaran implements MenghitungRuang{
    private double tinggi;
    
    public Kerucut(double jariJari, double tinggi)
    {
        this.setJariJari(jariJari);
        this.tinggi = tinggi;
    }
    
    //Overriding
    @Override
    public double volume()
    {
        return volume(this.luas(), this.tinggi);
    }
    
    //Overloading
    public double volume(double luasAlas, double tinggi){
        return (luasAlas*tinggi)/3;
    }
    
    //Overriding
    @Override
    public double luasPermukaan() {
        return luasPermukaan(this.jariJari, this.tinggi);
    }
    
    //Overloading
    public double luasPermukaan(double jariJari, double tinggi){
        double s;
        s = Math.sqrt(Math.pow(jariJari,2) + Math.pow(tinggi,2));
        return Math.PI*jariJari*(jariJari+s);
    }
}
