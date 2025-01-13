public class ProfitLossCalculator {
public static void main(String[] args) {
// given values
int costPrice = 129;
int sellingPrice = 191;

//calculate profit 
int profit = sellingPrice - costPrice;

//calculate profit percentage
double profitPercentage = (double)profit / costPrice * 100;

//display the result using single print statement
System.out.println("The Cost Price is INR " + costPrice + " The Selling Price is INR " + sellingPrice + "\n" + "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
}

}

