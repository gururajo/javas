
import java.util.*;

class Complex
{
     double real,imaginary;
    
    public void setReal(double real) {
        this.real=real;
    }
    
    public double getReal() {
        return this.real;
    }
     
    public void setImaginary(double imaginary) {
        this.imaginary=imaginary;
    }
     
    public double getImaginary() {
        return this.imaginary;
    } 
    
    public Complex(double real,double imaginary) {
        this.setReal(real);
        this.setImaginary(imaginary);
    }
    
    public Complex() {
        this.setReal(0);
        this.setImaginary(0);
    }
    
    @Override
    public String toString() {
        return "ans:[("+real+")+("+imaginary+"i)]";
    }
    
    public Complex add(Complex x) {
        Complex result=new Complex();
        result.real=this.getReal()+x.getReal();
        result.imaginary=this.getImaginary()+x.getImaginary();
        return result;
    }
    
    public Complex sub(Complex x) {
        Complex result=new Complex();
        result.real=this.getReal()-x.getReal();
        result.imaginary=this.getImaginary()-x.getImaginary();
        return result;
    }
    
    public Complex mul(Complex x) {
        Complex result=new Complex();
        result.real=((this.getReal()*x.getReal())-(this.getImaginary()*x.getImaginary()));
        result.imaginary=((this.getReal()*this.getImaginary())+(x.getImaginary()+this.getReal()));
        return result;
    }
    
    public Complex div(Complex x) {
        Complex result=new Complex();
        result.real=((this.getReal()*x.getReal())+(this.getImaginary()*x.getImaginary()));
        result.imaginary=((this.getReal()*this.getImaginary())-(x.getImaginary()+this.getReal()));
        return result;
    }
}
public class complex{
    
    private static Scanner scan;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double real,imagine;
        scan = new Scanner(System.in);
        
        Complex complex1 = new Complex(1, 1);
        Complex complex2=new Complex(1,1);
        
        System.out.println("\n\nADDITION\t"+complex1.add(complex2));
        System.out.println("\n\nSUBTRACTION\t"+complex1.sub(complex2));
        System.out.println("\n\nMULTIPLICATION\t"+complex1.mul(complex2));
        System.out.println("\n\nDIVISION\t"+complex1.div(complex2));
        
        System.out.println("\n\nfor complex 1");
        System.out.println("enter the real part value");
        real=scan.nextDouble();
        System.out.println("enter the imaginary part value");
        imagine=scan.nextDouble();
        Complex complex3=new Complex(real,imagine);
        
        System.out.println("\n\nfor complex 2");
        System.out.println("enter the real part value");
        real=scan.nextDouble();
        System.out.println("enter the imaginary part value");
        imagine=scan.nextDouble();
        Complex complex4=new Complex(real,imagine);
        
        System.out.println("\n\nADDITION\t"+complex3.add(complex4));
        System.out.println("\n\nSUBTRACTION\t"+complex3.sub(complex4));
        System.out.println("\n\nMULTIPLICATION\t"+complex3.mul(complex4));
        System.out.println("\n\nDIVISION\t"+complex3.div(complex4));
    }

    
    }


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

