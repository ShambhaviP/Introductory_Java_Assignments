import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shambhap on 24/08/15.
 */
public class Diamond_with_Name {
    public static void main(String []args)
    {
        int n,m,x=0,flag;
        flag=0;
        ArrayList<Integer> position=new ArrayList<Integer>();

        System.out.println("Enter the value of n:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();

        System.out.println("Enter your name:");
        String name=in.next();
        m=n+n-1;
        position.add(m/2);

        for(int i=0;i<m;++i)
        {
            if(i>m/2)
            {
                position.remove(new Integer(x));
                position.remove(new Integer(m - x - 1));
                x++;
                flag=1;
            }

            // System.out.println(pos);
            if(i==m/2)
            {System.out.println(name);
            }
            else {
                for (int j = 0; j < m; ++j) {


                    if (position.contains(j)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }

                }
                System.out.println("");
            }
            if(flag==0)
            {
                position.add(m/2+i+1);
                position.add(m / 2 - i - 1);
            }
        }
    }
}
