package constructor;

class C3_Param {
    int id;
    String name;

    // Parameterized constructor
    C3_Param(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public static void main(String[] args) {
        C3_Param c1 = new C3_Param(101, "Aniket");
        C3_Param c2 = new C3_Param(102, "Sakshi");

        System.out.println(c1.id + " " + c1.name);  // 101 Aniket
        System.out.println(c2.id + " " + c2.name);  // 102 Sakshi
    }
}
