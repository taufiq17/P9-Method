public class CetakSiswa1 {

    public static void main(String[] args){
        Siswa1 sis=new Siswa1(12345, "Jonowati");
        System.out.println("NIS : " + sis.getNis());
        System.out.println("Nama : " + sis.getNama());
    }
}
/**
*pendeklarasian object pd baris 4 harus menggunakan parameter
*karena method constructor pd kelas Siswa1 memiliki parameter
 */