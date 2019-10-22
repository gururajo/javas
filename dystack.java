/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author HP
 */
class stack 
{
    private int top=-1,a[];
    public void push(int e)
    {
        if(top+1==a.length)
        {
            int t[]=new int[2*a.length];
            for(int i=0;i<a.length;i++)
                t[i]=a[i];
            a=t;
            a[++top]=e;
        }
        else
            a[++top]=e;
    }
    public int pop()
    {
        return (top>-1)?a[top--]:-1;
    }
   
    stack(int...t)
    {
        if(t.length>1)
        {
              a=new int[t.length];
        for(int i=0;i<t.length;i++)
            a[i]=t[i];
        top=t.length-1;
    }else
    a=new int[t[0]];
    }
    void display()
    {
        for(int i=0;i<top+1;i++)
          System.out.println(a[i]); 
    }
    
}
class dystack
{
   
    public static void main() {
       // dystack b=new dystack();
       // b.main();
       stack s=new stack(12,32,65,54,874,464,46);
       int a[]={13,1,5,54,465,545};
       stack s2=new stack(a);
       stack s3=new stack(10);
       s.display();
       s2.display();
        for(int i=0;i<10;i++)
            s3.push(i);
       s3.display();
    }

}
