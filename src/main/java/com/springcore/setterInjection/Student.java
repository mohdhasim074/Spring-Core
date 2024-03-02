package com.springcore.setterInjection;

//   this is bean class

public class Student {
    private int Studentid;
    private String studentName;
    private String studentAddress;

    public Student(int studentid, String studentName, String studentAddress) {
        super();
        Studentid = studentid;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    //	getters and Setters
    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
//	constructors

    public String getStudentAddress() {
        return studentAddress;
    }
//	generate constructors using superclass

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    //	generate toString method
    @Override
    public String toString() {
        return "Student [Studentid=" + Studentid + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }

}
