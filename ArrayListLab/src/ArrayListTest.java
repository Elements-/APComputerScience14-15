import java.util.Scanner;
/**
 * @Author Cameron Kelliher
 * @Date 5/3/2015
 */
public class ArrayListTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String first, last;
        boolean done = false;

        System.out.println("Enter student first name: ");
        first = s.nextLine();
        System.out.println("Enter student last name: ");
        last = s.nextLine();

        APStudent student = new APStudent(first, last);

        while(!done) {
            String subject;
            String score;

            System.out.println("Subject: ");
            subject = s.nextLine();
            if(subject.equals("end")) { break; }

            System.out.println("Score: ");
            score = s.nextLine();

            student.addExam(new APExam(subject, Integer.parseInt(score)));
        }

        System.out.println(student.getExams());

        /**APStudent student = new APStudent("Cameron" , "Kelliher");
        student.addExam(new APExam("Science", 4));
        student.addExam(new APExam("CompSci", 5));
        student.addExam(new APExam("Turtle", 3));
        System.out.println(student.getExams());**/

        System.out.println("\nAverage: " + student.computeAverageScore());
        System.out.println("Highest: " + student.findHighestExamScore());
        System.out.println("Fives: " + student.numberOfFives());
    }
}
