import java.util.ArrayList;

/**
 * @Author Cameron Kelliher
 * @Date 5/1/2015
 */
public class APStudent {

    private String myFirstName;
    private String myLastName;
    ArrayList<APExam> myExams = new ArrayList<APExam>();

    public APStudent() {
        this.myFirstName = "";
        this.myLastName = "";
    }
    public APStudent(String firstName, String lastName) {
        this.myFirstName = firstName;
        this.myLastName = lastName;
    }

    public void addExam(APExam exam) {
        myExams.add(exam);
    }
    public int computeAverageScore() {
        int count = 0;
        int total = 0;
        for(APExam e : myExams) {
            total += e.getScore();
            count++;
        }
        return total/count;
    }
    public int findHighestExamScore() {
        int highest = myExams.get(0).getScore();
        for(APExam e : myExams) {
            if(highest < e.getScore()) {
                highest = e.getScore();
            }
        }
        return highest;
    }
    public int numberOfFives() {
        int count = 0;
        for(APExam e: myExams) {
            if(e.getScore() == 5) {
                count++;
            }
        }
        return count;
    }

    public String getFirstName() {
        return myFirstName;
    }
    public void setFirstName(String myFirstName) {
        this.myFirstName = myFirstName;
    }
    public String getLastName() {
        return myLastName;
    }
    public void setLastName(String myLastName) {
        this.myLastName = myLastName;
    }
    public ArrayList<APExam> getExams() {
        return myExams;
    }
}
