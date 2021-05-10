/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan5;

import java.awt.event.*;
import javax.swing.*;
import ruang.Balok;

/**
 *
 * @author Bayu Tri Nugroho
 */
public class View extends JFrame{
    //DEKLARASI KOMPONEN
    JFrame window = new JFrame("TP5");
   
    JLabel lTitle = new JLabel("KALKULATOR BALOK");
    JLabel lPanjang = new JLabel("Panjang   ");
        JTextField tfPanjang = new JTextField();
    JLabel lLebar = new JLabel("Lebar   ");
        JTextField tfLebar = new JTextField();
    JLabel lTinggi= new JLabel("Tinggi  ");
        JTextField tfTinggi = new JTextField();
        
    JLabel lHasil = new JLabel("Hasil :");
    JLabel lLuas = new JLabel("Luas Persegi : ");
    JLabel lKeliling = new JLabel("Keliling Persegi : ");
    JLabel lVolume = new JLabel("Volume Balok : ");
    JLabel lLuasPermukaan = new JLabel("Luas Permukaan Balok : ");
    
    JLabel lHasilLuas = new JLabel("");
    JLabel lHasilKeliling = new JLabel("");
    JLabel lHasilVolume = new JLabel("");
    JLabel lHasilLuasPermukaan = new JLabel("");

    JButton btnHitung = new JButton("Hitung");
    JButton btnReset = new JButton("Reset");
    
    public View() {
        window.setLayout(null);
        window.setSize(400,300);
      //  window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       //ADD COMPONENT
        window.add(lTitle);
        window.add(lPanjang);
        window.add(lLebar);
        window.add(lTinggi);
        window.add(tfPanjang);
        window.add(tfLebar);
        window.add(tfTinggi);
        
        window.add(lHasil);
        window.add(lLuas);
        window.add(lKeliling);
        window.add(lVolume);
        window.add(lLuasPermukaan);
        
        window.add(lHasilLuas);
        window.add(lHasilKeliling);
        window.add(lHasilVolume);
        window.add(lHasilLuasPermukaan);
        
        window.add(btnHitung);
        window.add(btnReset);

        lTitle.setBounds(130, 5, 200, 20);
//LABEL
        lPanjang.setBounds(10, 55, 120, 20);
        lLebar.setBounds(10, 80, 120, 20);
        lTinggi.setBounds(10,105,120,20);

//TEXTFIELD
        tfPanjang.setBounds(110, 55, 120, 20);
        tfLebar.setBounds(110, 80, 120, 20);
        tfTinggi.setBounds(110, 105, 120, 20);


//BUTTON PANEL
        btnHitung.setBounds(250, 55, 90, 20);
        btnReset.setBounds(250,80,90,20);
        
        
        lHasil.setBounds(180, 140, 200, 20);
        lLuas.setBounds(60, 160, 200, 20);
        lKeliling.setBounds(60, 180, 200, 20);
        lVolume.setBounds(60, 200, 200, 20);
        lLuasPermukaan.setBounds(60, 220, 200, 20);
        
        lHasilLuas.setBounds(150, 160, 200, 20);
        lHasilKeliling.setBounds(160, 180, 200, 20);
        lHasilVolume.setBounds(150, 200, 200, 20);
        lHasilLuasPermukaan.setBounds(205, 220, 200, 20);
        
        
         btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    Balok balok = new Balok(getPanjang(), getLebar(), getTinggi());
                    lHasilLuas.setText(Double.toString(balok.luas()));
                    lHasilKeliling.setText(Double.toString(balok.keliling()));
                    lHasilVolume.setText(Double.toString(balok.volume()));
                    lHasilLuasPermukaan.setText(Double.toString(balok.luasPermukaan()));
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
         
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");
                
                lHasilLuas.setText("");
                lHasilKeliling.setText("");
                lHasilVolume.setText("");
                lHasilLuasPermukaan.setText("");
            }
        });
    }

    public double getPanjang(){
        double panjang = Double.parseDouble(tfPanjang.getText());
        return panjang;
    }

    public double getLebar() {
        double lebar = Double.parseDouble(tfLebar.getText());
        return lebar;
    }

    public double getTinggi() {
        double tinggi = Double.parseDouble(tfTinggi.getText());
        return tinggi;
    }
}
