package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return ("The course for " + topic + ", taught by " + instructor.getFirstName() + instructor.getLastName() + ". Contains the following students enrolled: " + enrolledStudents);
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Course name) {
        if (name == this) {
            return true;
        } //reference check to make sure they're both pointing to the same item!
        if (name == null) {
            return false;
        } //null check to make sure they're not comparing against a null!
        if (name.getClass() != getClass()) {
            return false;
        }//class check to make sure they're both referring to the same class!
        Course courseName = (Course) name;
        return courseName.instructor == instructor && courseName.topic == topic;
    }
}
