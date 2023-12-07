import java.util.HashMap;

public class Course {
    private HashMap<String,Double> grades;
    private double credits;

    private String teacher;

    public HashMap<String,Double> getGrades(){
        return grades;
    }

    public void setGrades(Student aStudent, Double aGrade){
        HashMap<String,Double> aGrades = new HashMap<>();
        grades.put(aStudent.getName(),aGrade);
    }

    public double getCredits(){
        return credits;
    }

    public void setCredits(double aCredit){
        this.credits = aCredit;

    }

    public String getTeacher(){
        return teacher;
    }

    public void setTeacher(String aTeacher){
        this.teacher = teacher;
    }
}
