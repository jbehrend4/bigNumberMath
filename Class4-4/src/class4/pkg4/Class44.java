
package class4.pkg4;

import java.math.BigDecimal;

public class Class44 {

    public static void main(String[] args) {
        BigDecimal WI = new BigDecimal("5726398");
        BigDecimal CA = new BigDecimal("38041430");
        BigDecimal TX = new BigDecimal("26059203");
        BigDecimal Pay = new BigDecimal("3.23");
        BigDecimal WIletterstoCA = WI.multiply(CA);
        BigDecimal TXcopyletters = WIletterstoCA.multiply(TX);
        BigDecimal TXletterpayments = TXcopyletters.multiply(Pay);
        System.out.println(WIletterstoCA);
        System.out.println(TXcopyletters);
        System.out.println("$" + TXletterpayments);
    } 
}
