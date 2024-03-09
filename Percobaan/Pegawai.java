package Percobaan;

public class Pegawai {
    public String nama;
    public double gaji;

    }

class Manajer extends Pegawai { 
    public String departemen;

    public void IsiData (String n, String d) {
        super.nama=n;
        departemen=d;
    }
}
