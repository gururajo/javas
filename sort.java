
import java.util.Scanner;
class sort 
{
    private static Scanner sc;
    static void sorter(int a[])
    {
        for (int i = 0; i <a.length-1; i++)
        {
            for (int j = i+1; j <a.length ; j++) 
            {
                if (a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;                    
                }
            }
        }
    }
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        System.out.println("Give the No of elements");
        int a[]=new int[sc.nextInt()];
        System.out.println("give the ele's");
        for (int i = 0; i <a.length; i++) 
        a[i]=sc.nextInt();
        sorter(a);
        for (int i = 0; i < a.length; i++) 
        System.out.println(a[i]);
    }

}