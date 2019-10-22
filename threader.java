class threaderclass extends Thread {
    public void run() {
        for (int i = 0;; i++) {
            System.out.println("inside child t    " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException k) {
                System.out.println("Excetion of sleep" + k);
            }
        }
    }
}

class threader {

    public static void main(String[] args) {
        threaderclass t = new threaderclass();
        t.start();
        for (int i = 0;; i++) {
            System.out.println("inside main   " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException k) {
                System.out.println("Excetion of sleep" + k);
            }
        }

    }
}