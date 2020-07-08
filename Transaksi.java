/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package controller;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import model.Bank;
import model.Mahasiswa;
import model.Pembayaran_spp;
/**
 *
 * @author yogi
 
public class Transaksi {
    Koneksi koneksi;
    ArrayList<Bank> arrBank;
    ArrayList<Mahasiswa> arrMahasiswa;
    ArrayList<Pembayaran_spp> arrPembayaran_spp;
    public Transaksi() throws SQLException {

        this.koneksi = new Koneksi();
        this.arrBank = new ArrayList<>();
        this.arrMahasiswa = new ArrayList<>();
        this.arrPembayaran_spp = new ArrayList<>();

    }
    public ArrayList<Pembayaran_spp> getDataPembayaran_spp() throws SQLException {

        this.arrPembayaran_spp.clear();
        ResultSet rs = this.koneksi.getData("select * from Pembayaran_spp_90491 join Mahasiswa_90491 on Pembayaran_spp_90491."
                + "NPM_Mahasiswa = Mahasiswa_90491.NPM_Mahasiswa join Mahasiswa_90491 on pemasok_90491.id_pemasok = produk_90491.id_pemasok");
        while (rs.next()) {

            Mahasiswa mahasiswa = new Mahasiswa();
            pemasok.setId_Pemasok(rs.getInt("id_pemasok"));
            pemasok.setNama_Perusahaan(rs.getString("nama_perusahaan"));
            pemasok.setAlamat(rs.getString("alamat"));
            pemasok.setKode_Pos(rs.getInt("kode_pos"));
            pemasok.setNo_Telp(rs.getString("no_tlp"));

            Kategori kategori = new Kategori();
            kategori.setId_Kategori(rs.getInt("id_kategori"));
            kategori.setNama_Kategori(rs.getString("nama_kategori"));

            Produk produk = new Produk();
            produk.setId_Produk(rs.getInt("id_produk"));
            produk.setPemasok(pemasok);
            produk.setKategori(kategori);
            produk.setNama_Produk(rs.getString("nama_produk"));
            produk.setHarga_Satuan(rs.getInt("harga_satuan"));
            produk.setStok_Produk(rs.getInt("stok_produk"));

            this.arrProduk.add(produk);
        }

        return this.arrProduk;

    }

    
}
*/
package controller;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import model.Bank;
import model.Mahasiswa;
import model.Pembayaran_spp;
public class Transaksi {
    Koneksi koneksi;
    ArrayList<Bank> arrBank;
    ArrayList<Mahasiswa> arrMahasiswa;
    ArrayList<Pembayaran_spp> arrPembayaranSpp;
    
    public Transaksi() throws SQLException{
        this.koneksi = new Koneksi();
        this.arrBank = new ArrayList<>();
        this.arrMahasiswa = new ArrayList<>();
        this.arrPembayaranSpp = new ArrayList<>();
    }
    
    public ArrayList<Bank> getDataBank() throws SQLException{
        
        this.arrBank.clear();
        ResultSet rs = this.koneksi.getData("Select * from bank_90491");
        while (rs.next()){
            
            Bank bank = new Bank();
            bank.setId_Bank(rs.getInt("Id_Bank"));
            bank.setNama_Bank(rs.getString("Nama_Bank"));
            
            this.arrBank.add(bank);
        }
        return this.arrBank;
    
    }
    
    public ArrayList<Mahasiswa> getDataMahasiswa() throws SQLException{
        
        this.arrMahasiswa.clear();
        ResultSet rs = this.koneksi.getData("Select * from Mahasiswa_90491");
        while (rs.next()){
            
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNPM_Mahasiswa(rs.getInt("Npm_Mahasiswa"));
            mahasiswa.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
            mahasiswa.setJenis_Kelamin_Mahasiswa(rs.getString("Jenis_Kelamin_Mahasiswa"));
            mahasiswa.setAlamat_Mahasiswa(rs.getString("Alamat_Mahasiswa"));
            
            this.arrMahasiswa.add(mahasiswa);
        }
        return this.arrMahasiswa;
    }
    
    public ArrayList<Pembayaran_spp> getDataPembayaranSpp() throws SQLException{
        
        this.arrPembayaranSpp.clear();
        ResultSet rs = this.koneksi.getData("select a.Npm_Mahasiswa, a.Nama_Mahasiswa, b.Id_Spp, b.Tanggal_Spp, b.Nominal_spp, b.Konfirmasi_Pembayaran_Spp from Mahasiswa_90490 a join Pembayaran_Spp_90490 b on a.Npm_Mahasiswa = b.Npm_Mahasiswa ");
        while (rs.next()){
            
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNpm_Mahasiswa(rs.getString("Npm_Mahasiswa"));
            mahasiswa.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
            mahasiswa.setJenis_Kelamin_Mahasiswa(rs.getString("Jenis_Kelamin_Mahasiswa"));
            mahasiswa.setAlamat_Mahasiswa(rs.getString("Alamat_Mahasiswa"));
            
            Bank bank = new Bank();
            bank.setId_Bank(rs.getInt("Id_Bank"));
            bank.setNama_Bank(rs.getString("Nama_Bank"));
            
            Pembayaran_spp pembayaranspp =  new Pembayaran_spp();
            pembayaranspp.setId_Spp(rs.getInt("Id_Spp"));
            pembayaranspp.setMahasiswa(mahasiswa);
            pembayaranspp.setBank(bank);
            pembayaranspp.setTanggal_Spp(rs.getDate("Tanggal_Spp"));
            pembayaranspp.setBulan_Spp(rs.getString("Bulan_Spp"));
            pembayaranspp.setNominal_Spp(rs.getDouble("Nominal_Spp"));
            pembayaranspp.setDenda_Spp(rs.getDouble("Denda_Spp"));
            pembayaranspp.setKonfirmasi_Pembayaran_Spp(rs.getString("Konfirmasi_Pembayaran_Spp"));
            
            this.arrPembayaranSpp.add(pembayaranspp);
        }
        return this.arrPembayaranSpp;
    }
    
    public ArrayList<Mahasiswa> getDataJoin() throws SQLException{
        this.arrMahasiswa.clear();
        ResultSet rs = this.koneksi.getData("SELECT * from MAHASISWA JOIN MENYIMPAN on MAHASISWA.Npm_Mahasiswa = MENYIMPAN.Npm_Mahasiswa");
        
        while(rs.next()){
            Mahasiswa M= new Mahasiswa();
            M.setNpm_Mahasiswa(rs.getString("Npm_Mahasiswa"));
            M.setNama_Mahasiswa(rs.getString("Nama_Mahasiswa"));
            
            Bank B=new Bank();
            B.setId_Bank(rs.getInt("Id_Bank"));
            B.setNama_Bank(rs.getString("Nama_Bank"));
            this.arrMahasiswa.add(M);
        }
        
        return arrMahasiswa;
    }
    
    public void tambahTransaksi(Bank Bank) {
        this.koneksi.ManipulasiData("INSERT INTO Bank_90490\n"
                + "(Id_Bank, Nama_Bank)\n"
                + " VALUES('"+Bank.getId_Bank()+ "', '" + Bank.getNama_Bank()+ ")");

    }
    
    public void deleteTransaksi(Pembayaran_spp Pembayaran) throws SQLException{
        this.koneksi.ManipulasiData("DELETE * FROM ADMIN Where Id_Spp='"+Pembayaran.getId_Spp()+"' ");
        
    }
    
    public void insertTransaksi(Pembayaran_spp P) {
        this.koneksi.ManipulasiData("INSERT INTO PembayaranSpp_90941\n"
                + "(Id_SPP, Npm_Mahasiswa, Id_Bank, Tanggal_Spp, Bulan_Spp, Nominal_Spp, Denda_Spp, Konfirmasi_Pembayaran_Spp)\n"
                + " VALUES('"+ P.getId_Spp() + "', '" + P.getMahasiswa() + "', '" + P.getBank() + "', '"+ P.getTanggal_Spp() + "', '"+ P.getBulan_Spp() +"', '"+ P.getNominal_Spp() + "', '"+ P.getDenda_Spp() +"', '"+ P.getKonfirmasi_Pembayaran()+")");

    }
    
    public void simpanTransaksi(Pembayaran_spp P) {
        this.koneksi.ManipulasiData("INSERT INTO PembayaranSpp_90940\n"
                + "(Id_SPP, Npm_Mahasiswa, Id_Bank, Tanggal_Spp, Bulan_Spp, Nominal_Spp, Denda_Spp, Konfirmasi_Pembayaran_Spp)\n"
                + " VALUES('"+ P.getId_Spp() + "', '" + P.getMahasiswa() + "', '" + P.getBank() + "', '"+ P.getTanggal_Spp() + "', '"+ P.getBulan_Spp() +"', '"+ P.getNominal_Spp() + "', '"+ P.getDenda_Spp() +"', '"+ P.getKonfirmasi()+")");

    }
    
    public ArrayList<Pembayaran_spp> getViewDataBarang() throws SQLException{
        this.arrPembayaranSpp.clear();
        ResultSet rs = this.koneksi.getData("SELECT * from Id_Spp");
        
        while(rs.next()){
            Pembayaran_spp P= new Pembayaran_spp();
            P.setId_Spp(rs.getInt("Id_barang"));
            P.setNominal_Spp(rs.getDouble("Nominal_Spp"));
            P.setDenda_Spp(rs.getDouble("Denda_Spp"));
            this.arrPembayaranSpp.add(P);
        }
        
        return arrPembayaranSpp;
    }
}
