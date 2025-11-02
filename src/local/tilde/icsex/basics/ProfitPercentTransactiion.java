/**
 * Problem statement : Write a program using variables to find profit and profit percent of a certain transaction.
                       where cp = , sp = 10000 and cp = 7000
 */

package local.tilde.icsex.basics;

public class ProfitPercentTransactiion {
    public static void main(String[] args) {
        float sp = 10000;
        float cp = 7000;

        float profit = sp - cp;
        float profitPercent = (profit / cp) * 100;

        System.out.println("Profit : " + profit);
        System.out.println("Profit Percent : " + profitPercent);
    }
}
