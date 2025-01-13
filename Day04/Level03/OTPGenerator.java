import java.util.HashSet;

public class OTPGenerator {

// Method to generate a 6-digit OTP
public static int generateOTP() {
return 100000 + (int) (Math.random() * 900000); // Generates a number between 100000 and 999999
}

// Method to ensure the OTP numbers generated are unique
public static boolean areOTPsUnique(int[] otps) {
HashSet<Integer> uniqueOTPs = new HashSet<>();
for (int otp : otps) {
uniqueOTPs.add(otp);
}
return uniqueOTPs.size() == otps.length; 
}

public static void main(String[] args) {
int[] otps = new int[10]; // Array to store 10 OTPs

// Generate 10 OTPs and store in the array
for (int i = 0; i < otps.length; i++) {
otps[i] = generateOTP();
}

// Display the generated OTPs
System.out.println("Generated OTPs:");
for (int otp : otps) {
System.out.print(otp + " ");
}
System.out.println();

// Check if the OTPs are unique
boolean isUnique = areOTPsUnique(otps);
if (isUnique) {
System.out.println("All generated OTPs are unique.");
} else {
System.out.println("Some OTPs are not unique.");
}
}
}
