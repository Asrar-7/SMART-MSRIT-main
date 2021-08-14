package com.capricious.asrar.gitstudent;

public class UserInformation {
    public String Name_Of_Student;
    public String USN;
    public String Programme;
    public String Semester;
    public String Year;

    public UserInformation(){

    }

    public UserInformation(String name_Of_Student, String USN, String programme, String semester, String year) {
        Name_Of_Student = name_Of_Student;
        this.USN = USN;
        Programme = programme;
        Semester = semester;
        Year = year;
    }
}
