package Percobaan;

class parent {
    public int x = 5;
}

class child extends parent{
    public int x = 10;
    public void Info(int x) {
        System.out.println("Nilai x sebagai parameter = " + x);
        System.out.println("Data member x di class child = " + this.x);
        System.out.println("Data member x di class parent = " + super.x);
    }
}

public class percobaan1{
    public static void main(String[] args) {
        child tes = new child();
        tes.Info(20);
    }
}