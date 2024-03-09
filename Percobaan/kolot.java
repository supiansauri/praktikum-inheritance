package Percobaan;

public class kolot {
    String parentName;

    // Konstruktor tanpa parameter
    kolot() {
        System.out.println("Konstruktor parent");
    }

    // Konstruktor dengan parameter
    kolot(String parentName) {
        this.parentName = parentName;
        System.out.println("Konstruktor parent");
    }
}

class Baby extends kolot {
    String babyName;

    // Konstruktor dengan parameter
    Baby(String babyName) {
        super(); // Memanggil konstruktor kelas induk
        System.out.println("Konstruktor Baby");
        System.out.println(babyName);
        this.babyName = babyName;
    }

    // Metode Cry untuk menampilkan respons bayi
    public void Cry() {
        System.out.println("Owek owek");
    }
}

