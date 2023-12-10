package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        String students = "";
        for (Student student : enrolledStudents){
            students += student.getName();
        }
        return  String.format("%s is a topic taught by %s. Current enrolled students are %s",
        this.topic, instructor.getFirstName(), students);

    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if (toBeCompared.getClass() != getClass()) {
            return false;
        }
        Course course = (Course) toBeCompared;
        String instructorName1 = course.getInstructor().getFirstName();
        String topicName1 = course.getTopic();

        String instructorName = getInstructor().getFirstName();
        String topicName = getTopic();

        return ((instructorName.equals(instructorName1)) && (topicName.equals(topicName1)));
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }
}
