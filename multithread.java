class threaderclass extends Thread {
    String name;

    threaderclass(String s) {
        name = s;

    }

    public void run() {
        for (int i = 0;; i++) {
            System.out.println("inside child " + name + "  " + i);
            /*
             * try { Thread.sleep(1000); } catch (InterruptedException k) {
             * System.out.println("Excetion of sleep" + k); }
             */
        }
    }
}

class multithread {

    public static void main(String[] args) {
        threaderclass t1 = new threaderclass("t1");
        threaderclass t2 = new threaderclass("t2");
        threaderclass t3 = new threaderclass("t3");
        threaderclass t4 = new threaderclass("t4");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY + 2);
        t3.setPriority(Thread.NORM_PRIORITY - 2);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        for (int i = 0;; i++) {
            System.out.println("inside main   " + i + "\n" + t1.isAlive() + t2.isAlive() + t3.isAlive() + t4.isAlive());
            /*
             * try { Thread.sleep(1000); } catch (InterruptedException k) {
             * System.out.println("Excetion of sleep" + k); }
             */
        }

    }
}