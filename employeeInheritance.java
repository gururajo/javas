import java.util.Scanner;

class person {
    String name, aadharNO;
    byte age;

    person() {
        name = "HAyat";
        aadharNO = "454152154469";
        age = 21;
    }

    person(String n, String a, byte ag) {
        name = n;
        aadharNO = a;
        age = ag;

    }
}

class employeer extends person {
    float salary;
    int empid;
    String post;

    employeer() {
        super();
        salary = 22000.50F;
        empid = 1233434;
        post = "Worker";
    }

    employeer(String n, String a, byte ag, String po, int id, float sal) {
        super(n, a, ag);
        salary = sal;
        empid = id;
        post = po;
    }

    public String toString() {
        return ("Name is" + name + "\nAadhar No=" + aadharNO + "      Age=" + age + "\nempid=" + empid + "    post="
                + post + "  salary=" + salary);

    }
}

class employeeinheritance {
    private static Scanner sc;

    public static void main(String[] args) {

        employeer e = new employeer();
        System.out.println(e.toString());
        sc = new Scanner(System.in);
        System.out.println("Give the name,aadhar No,Age,Post ,empid,sal");
        String n = sc.nextLine();
        String a = sc.nextLine();
        byte ag = sc.nextByte();
        String po = sc.nextLine();
        int id = sc.nextInt();
        float sal = sc.nextFloat();
        employeer e1 = new employeer(n, a, ag, po, id, sal);

        System.out.println(e1.toString());
        System.out.println();
    }

}