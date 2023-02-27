
package Exemplo03;

import java.text.DecimalFormat;

public class FormatarNum {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();
        double V1= 70.25;
        df.applyPattern("#0.00");
        System.out.println(df.format(V1));
        
        double v2 = 2583.65;
        df.applyPattern("R$ #,##0.00");
        System.out.println(df.format(v2));
                
    }
 
}
