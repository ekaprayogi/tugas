/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yogi
 */
public class Pembayaran_spp {
    private Integer Id_Spp;
    private Mahasiswa npm_mahasiswa;
    private Bank id_Bank;
    private Date Tanggal_Spp;
    private String Bulan_Spp;
    private Double Nominal_Spp;
    private Double Denda_Spp;
    private String Konfirmasi_Pembayaran;

    public Integer getId_Spp() {
        return Id_Spp;
    }

    public void setId_Spp(Integer Id_Spp) {
        this.Id_Spp = Id_Spp;
    }

    public Mahasiswa getMahasiswa() {
        return npm_mahasiswa;
    }

    public void setMahasiswa(Mahasiswa npm_mahasiswa) {
        this.npm_mahasiswa = npm_mahasiswa;
    }
    
     public Bank getBank() {
        return id_Bank;
    }

    public void setBank(Bank id_Bank) {
        this.id_Bank = id_Bank;
    }
      public Date getTanggal_Spp() {
        return Tanggal_Spp;
    }
    public void setTanggal_Spp(Date Tanggal_Spp) {
        this.Tanggal_Spp = Tanggal_Spp;
    }

    public String getBulan_Spp() {
        return Bulan_Spp;
    }

    public void setBulan_Spp(String Bulan_Spp) {
        this.Bulan_Spp = Bulan_Spp;
    }

    public Double getNominal_Spp() {
        return Nominal_Spp;
    }

    public void setNominal_Spp(Double Nominal_Spp) {
        this.Nominal_Spp = Nominal_Spp;
    }
    
    public Double getDenda_Spp() {
        return Denda_Spp;
    }

    public void setDenda_Spp(Double Denda_Spp) {
        this.Denda_Spp = Denda_Spp;
    }

    public void setKonfirmasi_Pembayaran_Spp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKonfirmasi_Pembayaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKonfirmasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
