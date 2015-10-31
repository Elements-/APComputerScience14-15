/**
 * @Author Cameron Kelliher
 * @Date 5/1/2015
 */
public class APExam {

    private String mySubject;
    private int myScore;

    public APExam() {
        this.mySubject = "";
        this.myScore = 1;
    }
    public APExam(String subject, int score) {
        this.mySubject = subject;
        this.myScore = score;
    }

    public int getScore() {
        return myScore;
    }
    public void setScore(int myScore) {
        this.myScore = myScore;
    }
    public String getSubject() {
        return mySubject;
    }
    public void setSubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public boolean equals(APExam otherExam) {
        if(otherExam.getScore() == myScore && otherExam.getSubject().equals(myScore)) {
            return true;
        }
        return false;
    }
    public String toString() {
        return mySubject + ": " + myScore;
    }
}
