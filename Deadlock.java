/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class A {
    synchronized void firstA(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "entered first A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name + "try to call last B");
            b.lastB();
        }
    }

    synchronized void lastA() {
        System.out.println("inside A last");
    }
}

class B {
    synchronized void firstB(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "entered first B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name + "try to call last A");
            a.lastA();
        }
    }

    synchronized void lastB() {
        System.out.println("inside B last");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this, "Racing Thread");
        t.start();
        a.firstA(b);
        System.out.println("Back in main");
    }

    public void run() {
        b.firstB(a);
        System.out.println("Back to Racing Thread");
    }

    public static void main(String[] args) {

        new Deadlock();
    }

}
