package classAssignment.Practice;

public class Invoice {
    public static void main(String args[]) {

        byte score1 = 70;
        byte score2 = 68;
        byte score3 = 74;
        byte score4 = 65;

        float sum = score1 + score2 + score3 + score4;
        float average = sum / 4;
        char grade = 'A';

        System.out.println(" \t  \t \t  \t  \t Department of Computer Science");
        System.out.println(" \t   \t  \t \t End Semester Results");
        System.out.println("--------------------------------------------------");
        System.out.println("|Name:-  \t \t |Roll_no:  \t \t Semester: \t \t ");
        System.out.println("________________________________________________");
        System.out.println("|Unit Code \t \t |Unit Name: \t Score");
        System.out.println("|CCS2101 \t \t |Database \t  \t " + score1);
        System.out.println("");
        System.out.println("|CCS2102 \t \t |System \t  \t " + score2);
        System.out.println("");

        System.out.println("|CCS2103 \t \t |Algorithm \t \t " + score3);
        System.out.println("");

        System.out.println("|CCS2104 \t \t |Statistics \t  \t " + score4);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|Total \t \t \t  \t \t " + sum);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("|Average \t \t \t \t  \t  " + average);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("|Grade \t \t \t  \t \t " + grade);
        System.out.println("--------------------------------------------------------------------");

        System.out.println(" \t \t \t \t \t Recommendation|");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Grading \t \t   Criteria Overall \t \t  Grade REcommend PAss");
        System.out.println("70-100  A");
        System.out.println("60-69  B");
        System.out.println("50-59  C");
        System.out.println("40-49  D");
        System.out.println("Below 40  F");
        System.out.println("--------------------------------------------------------------------");


    }
}
