/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 *
 */
public class point {
private static Scanner sc;
static int pointcheck(int x, int y)
{ 
    if(x==0 && y==0)
     return 0;
 else if(x>0 && y>0)
     return 1;
 else if(x<0 && y>0)
     return 2;
 else if(x<0 && y<0)
     return 3;
 else
     return 4;
 

}
public static void main() {
sc = new Scanner(System.in);      
System.out.println("Give the co-ordinates");
int x=sc.nextInt();
int y=sc.nextInt();
System.out.println("hello world");

switch(pointcheck(x,y))
{
    case 0:System.out.println("Point lies in origin"+x+"  "+y);
           break;
           case 1:System.out.println("Point lies 1st quadrant"+x+"  "+y);
           break;
           case 2:System.out.println("Point lies 2nd quadrant"+x+"  "+y);
           break;
           case 3:System.out.println("Point lies 3rd quadrant"+x+"  "+y);
           break;
           case 4:System.out.println("Point lies 4th quadrant"+x+"  "+y);
           break;
}
    }

}
