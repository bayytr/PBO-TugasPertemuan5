/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class Lingkaran implements MenghitungBidang{
    protected double jariJari;
    
    protected double getJariJari()
    {
        return this.jariJari;
    }
    
    protected void setJariJari (double dataJariJari)
    {
        this.jariJari = dataJariJari;
    }
    
//    public Lingkaran(double inputJariJari)
//    {
//        this.jariJari = inputJariJari;
//    }
    
    @Override
    public double luas()
    {
        return luas(this.jariJari);
    }
    
    public double luas(double jariJari)
    {
        return Math.PI*jariJari*jariJari;
    }
    
    @Override
    public double keliling()
    {
        return keliling(this.jariJari);
    }
    
    public double keliling(double jariJari)
    {
        return Math.PI*2*jariJari;
    }
    
}
