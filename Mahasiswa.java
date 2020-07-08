/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yogi
 */
public class Mahasiswa {
    private Integer NPM_Mahasiswa;
    private String Nama_Mahasiswa;
    private String Jenis_Kelamin_Mahasiswa;
    private String Alamat_Mahasiswa;

    public Integer getNPM_Mahasiswa() {
        return NPM_Mahasiswa;
    }

    public void setNPM_Mahasiswa(Integer NPM_Mahasiswa) {
        this.NPM_Mahasiswa = NPM_Mahasiswa;
    }

    public String getNama_Mahasiswa() {
        return Nama_Mahasiswa;
    }

    public void setNama_Mahasiswa(String Nama_Mahasiswa) {
        this.Nama_Mahasiswa = Nama_Mahasiswa;
    }

    public String getJenis_Kelamin_Mahasiswa() {
        return Jenis_Kelamin_Mahasiswa;
    }

    public void setJenis_Kelamin_Mahasiswa(String Jenis_Kelamin_Mahasiswa) {
        this.Jenis_Kelamin_Mahasiswa = Jenis_Kelamin_Mahasiswa;
    }

    public String getAlamat_Mahasiswa() {
        return Alamat_Mahasiswa;
    }

    public void setAlamat_Mahasiswa(String Alamat_Mahasiswa) {
        this.Alamat_Mahasiswa = Alamat_Mahasiswa;
    }

    public void setNpm_Mahasiswa(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
