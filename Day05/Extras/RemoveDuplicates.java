import java.util.Scanner;

public class RemoveDuplicates {
    
public static String removeDuplicate(String str) {
StringBuilder sb = new StringBuilder(str.length());
boolean[] seen = new boolean[256];


for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);


if (!seen[ch]) {
sb.append(ch);
seen[ch] = true;
}
}
        
return sb.toString();
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the string: ");
String str = sc.nextLine();

System.out.println(removeDuplicate(str));
}
}