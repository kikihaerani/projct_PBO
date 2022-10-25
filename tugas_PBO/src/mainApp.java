public class mainApp {
    public static void main(String[] args) {
        pegawai pegawai = new pegawai();
        pegawai.namaDepan="Kiki";
        pegawai.namaBelakang="Haerani";
        pegawai.tempatLahir="Bangket Tengak";
        pegawai.tanggaLahir=23;
        pegawai.bulanLahir=02;
        pegawai.tahunLahir=2000;
        pegawai.umur=22;
        pegawai.alamat="Dusun Bangke Tengak Desa Puyung Kecamatan jonggat";
        pegawai.sayHello();

    gaji G= new gaji(50000000,5000000,10000000);
        System.out.println("Gaji Pokok = " +G.gajiPokok);
        System.out.println("Gaji Tunjangan Jabatan = "+ G.gajiTunjanganJabatan);
        System.out.println("Gaji Lembur = " +G.gajiLembur);
        System.out.println("Total gaji yang diterima : "+(G.gajiPokok + G.gajiTunjanganJabatan + G.gajiLembur));

        jabatan J = new jabatan("Manager");
        System.out.println("Menjabat Sebagai : "+J.jabatan);

        status_pendidikan pendidikan = new status_pendidikan("Lulus di STMIK Lombok");
        System.out.println("Status Pendidikan : "+pendidikan.pendidikan);
    }


}
