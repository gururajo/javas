
interface Area {
    final static float PI = 3.14F;

    public float compute(float... f);

}

class rectangle implements Area {
    // float l;
    public float compute(float... f) {
        return (f[0] * f[1]);
    }

}

class circle implements Area {
    public float compute(float... f) {
        return (PI * f[0] * f[0]);
    }
}

class interfacer {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.out.println(r.compute(12.232F, 45.85F));
        circle c = new circle();
        System.out.println(c.compute(45.85F));
    }

}