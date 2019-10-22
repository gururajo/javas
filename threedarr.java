import java.util.Scanner;

public class threedarr
{   
    private static Scanner sc;
    static int[][][] alloc()
    {
        sc = new Scanner(System.in);

          int a[][][];

        System.out.println("give the no of sem");
        a=new int[sc.nextInt()][][];
        for (int i = 0; i < a.length; i++) 
          {
            System.out.println("give the no of subs for"+i+"  sem");
              a[i]=new int[sc.nextInt()][];
              for(int j=0;j<a[i].length;j++)
              {
                System.out.println("give the no of tests for "+ i+"  sem and "+j+"  sub");
                a[i][j]=new int[sc.nextInt()];
                for (int k = 0; k < a[i][j].length; k++)
                {
                    System.out.println("Give the MArks of "+i+"  sem and "+j+"  sub"+k+"  test");
                    a[i][j][k]=sc.nextInt();
                    
                }
            }
        }
        
       
        return(a);
               
    }
    static void display(int a[][][])
    {
        System.out.println("the MArks are");
        for (int i = 0; i < a.length; i++) 
        {          
            for(int j=0;j<a[i].length;j++)
            {
                for (int k = 0; k < a[i][j].length; k++)
                {
                   System.out.print(a[i][j][k]);
                    
                }
                System.out.println();
            }
            System.out.println("\n\n");
        }
        
    }
    public static void main(String[] args)
    {
        int a[][][]=alloc();
        display(a);
    }
}
