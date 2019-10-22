class exceptioner extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    static int withoute(int a, int b) {
        System.out.println("inside witoute");
        int c = a / b;

        return c;
    }

    static int withe(int a, int b) {
        int c=-1;
        try {
            c= a / b;
        } catch (ArithmeticException e) {
            c=-1;
            System.out.println("exceptio   " + e);

        } finally {
           System.out.println("inside finally");
        }
        return c;
    }

    public static void main(String[] args) {
        withe(12, 0);
        withoute(12, 0);

    }
}