import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shambhap on 24/08/15.
 */
public class Horizontal_Line {
    public static void main(String args[]) throws IOException


    {
        int i,n=0;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++) {
            System.out.print("*");
        }

    }



}
