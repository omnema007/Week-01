public class PenDistribution {
public static void main(String[] args) {

//total pens and number of students
int totalPens = 14;
int numberOfStudents = 3;

//calculate pens per students
int pensPerStudent = totalPens / numberOfStudents;

//calculate remainings pen
int remainingPens = totalPens % numberOfStudents;

//display the result
System.out.println("The Pen per student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
}
}

