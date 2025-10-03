/**
 * Print the following pattern :    *  *  *  *
                                    *  *  *  *  
                                    *  *  *  *
                                    *  *  *  *  
 */

package local.tilde.ashokit.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternOne {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for( int i = 1; i <= num; i++){
            for( int j = 1; j <= num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //br.close();
    }
}
