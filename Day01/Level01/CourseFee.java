public class CourseFee {
public static void main(String[] args) {

//define variables
int fee = 125000;
int discountPercent = 10;

//calculate discount amount
double discount = fee * discountPercent / 100;

//calculate discounted fee
double finalFee = fee - discount;

//display the result
System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
}
}

