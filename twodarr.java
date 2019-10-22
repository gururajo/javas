import java.util.Scanner;

public class twodarr
{   
    private static Scanner sc;
    static int[][] alloc()
    {
        sc = new Scanner(System.in);

          int a[][];
          int x=sc.nextInt();
          a=new int[x][x];
        for(int i=0;i<a.length;i++)
        for (int j = 0; j<a[i].length; j++) 
        {
            a[i][j]=sc.nextInt();
        }
        return(a);
               
    }
    static void display(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j<a[i].length; j++) 
                System.out.print(a[i][j]+"  ");
                System.out.println();
        }
        
    }
    public static void main(String[] args)
    {
        int a[][]=alloc();
        display(a);
    }
	
}
