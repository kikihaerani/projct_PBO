public class pegawai {
    String namaDepan;
    String namaBelakang;
    String alamat;
    Integer umur;
    String tempatLahir;
    Integer tanggaLahir;
    Integer bulanLahir;
    Integer tahunLahir;

    void sayHello(){

        System.out.println("Nama Lengkap : "+ namaDepan +" "+ namaBelakang);
        System.out.println("Nama Panggilan : "+ namaDepan);
        System.out.println("TTL : "+tempatLahir+" - "+tanggaLahir+" - "+bulanLahir+" - "+tahunLahir);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Umur : "+umur);
    }

}
