package if1.pkg10119030.latihan43.gajipegawai;
/**
 * NAMA                 : Rendy Dermawan
 * KELAS                : IF1
 * NIM                  : 10119030
 * Deskripsi Program    : Program perhitungan Gaji Bersih Pegawai menggunakan 
 * metode pendekatan berbasis objek.
 */
public class Main {
    public static void main(String[] args) {
        GajiPegawai pegawai1 = new GajiPegawai();
        pegawai1.setNama("Rendy Dermawan");
        pegawai1.setAlamat("Jl. Perpandan III No. 65");
        pegawai1.setUangTransport(250000);
        pegawai1.setUangTunjangan(300000);
        pegawai1.setUangTunjangan(300000);
        pegawai1.setGajiPokok(4500000);
        pegawai1.setTotalGaji(pegawai1.getGajiPokok());
        pegawai1.tampilData(pegawai1.getNama(), 
                pegawai1.getAlamat(), 
                pegawai1.getUangTunjangan(), 
                pegawai1.getUangTransport(), 
                pegawai1.getGajiPokok(), 
                pegawai1.getTotalGaji());
    }
}
