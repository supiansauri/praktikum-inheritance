package Percobaan;


class MoodyObject {
    protected String getMood() {
        return "moody";
    }

    public void speak() {
        System.out.println("I am " + getMood());
    }

    void laugh() {}

    void cry() {}
}

class SadObject extends MoodyObject {
    protected String getMood() {
        return "sad";
    }

    public void cry() {
        System.out.println("Hoo hoo");
    }
}

class HappyObject extends MoodyObject {
    protected String getMood() {
        return "happy";
    }

    public void laugh() {
        System.out.println("Hahaha");
    }
}

public class MoodyTest {
    public static void main(String[] args) {
        MoodyObject m = new MoodyObject();
        // Test perent class
        m.speak();

        // Test inheritance class HappyObject
        m = new HappyObject();
        m.speak();
        ((HappyObject) m).laugh();

        // Test inheritance class SadObject
        m = new SadObject();
        m.speak();
        ((SadObject) m).cry();
    }
}
