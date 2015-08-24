import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shambhap on 24/08/15.
 */
public class PrimeFactors {
    public  static void main(String args[])throws IOException
    {

System.out.println("Enter the number whose prime factors are to be generated");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        generate(n);
    }

    private static void generate(int n) {

        for(int i=2;i<n;i++)
        {
            if(n%i==0)

            {int count=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0) count++;

                }
                if(count>0){
                    continue;
                }else System.out.println(i);
            }
        }






    }



}
