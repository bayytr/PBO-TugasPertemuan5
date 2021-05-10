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
public class PersegiPanjang implements MenghitungBidang{
    protected double panjang, lebar;
    
    protected double getPanjang()
    {
        return this.panjang;
    }
    
    protected double getLebar()
    {
        return this.lebar;
    }
    
    protected void setPanjang(double dataPanjang)
    {
        this.panjang = dataPanjang;
    }
    
    protected void setLebar(double dataLebar)
    {
        this.lebar = dataLebar;
    }
    
//    public Lingkaran(double inputJariJari)
//    {
//        this.jariJari = inputJariJari;
//    }
    
    @Override
    public double luas()
    {
        return luas(this.panjang, this.lebar);
    }
    
    public double luas(double panjang, double lebar)
    {
        return panjang*lebar;
    }
    
    @Override
    public double keliling()
    {
        return keliling(this.panjang, this.lebar);
    }
    
    public double keliling(double panjang, double lebar)
    {
        return 2*(panjang+lebar);
    }
    
}
