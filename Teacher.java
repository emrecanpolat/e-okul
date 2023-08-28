package com.company;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    public void print(){
        System.out.println("Adı: " + this.name+

                " Telefon: " + mpno +
                " Branş Kodu: " + branch
        );
    }


}
