package com.example.attendance;

public class ClassItem {

    //private long cid;
    private String className;
    private String subjectName;
    private String lecturerName;

//    public ClassItem(long cid, String className, String subjectName, String lecturerName) {
//        this.cid = cid;
//        this.className = className;
//        this.subjectName = subjectName;
//        this.lecturerName = lecturerName;
//    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public ClassItem(String className, String subjectName, String lecturerName) {
        this.className = className;
        this.subjectName = subjectName;
        this.lecturerName = lecturerName;
    }

//    public long getCid() {
//        return cid;
//    }
//
//    public void setCid(int cid) {
//        this.cid = cid;
//    }
}
