package com.company;

public class Course {

    Student student;
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;

    Course(String name, String code, String prefix){

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNote = 0;
    }
    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen branşı ders ile uyuşmuyor");
        }



    }



    void printTeacherInfo(){
        this.teacher.print();
    }



}


