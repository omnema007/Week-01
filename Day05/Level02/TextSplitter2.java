import java.util.Scanner;

public class TextSplitter2{

//Method to calculate length of string without using length()
public static int findLength(String text) {
int count = 0;

for (int i = 0; ; i++) {

try {
text.charAt(i);
count++;
} catch(Exception e) {
break;
}
}

return count;
}

//Method to split the word
public static String [][] split(String str ){
String word = "";
int count =0, index = 0;
for(int i = 0; i<str.length(); i++){
if(str.charAt(i)== ' '){ count ++;}
}
String res[][] = new String[count+1][2];
for(int i = 0; i<str.length(); i++){
if(str.charAt(i)!= ' ' && i != str.length()-1){
word += str.charAt(i);
}else{
if (!word.isEmpty()) {

res[index][0] = word;
int c = word.length();
res[index][1] = String.valueOf(c); 
word = "";
index++;
}
}
}
		
return res;
		
}
	
	

public static void main (String [] args ){

Scanner sc = new Scanner (System.in);

System.out.println("Enter the String: ");
String str1 = sc.nextLine();

String [][] result = split(str1);
	
for(int i = 0; i<result.length; i++){
for(int j=0; j<result[0].length; j++){
System.out.print(result[i][j]);
}
}
	
sc.close();	
}
}