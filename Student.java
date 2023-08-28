package com.company;

public class Student {

    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double averageMain;
    double averageTarih;
    double averageFizik;
    double averageMatematik;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.averageMain= 0.0;
        this.averageTarih = 0.0;
        this.averageFizik = 0.0;
        this.averageMatematik = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int sozluNote1, int sozluNote2, int sozluNote3){
        if (note1>=0 && note1<=100){
            c1.note = note1;
        }
        if (note2>=0 && note2<=100){
            c2.note = note2;
        }
        if (note3>=0 && note3<=100){
            c3.note = note3;
        }
        if (sozluNote1>=0 && sozluNote1<=100){
            c1.sozluNote = sozluNote1;
        }
        if (sozluNote2>=0 && sozluNote2<=100){
            c2.sozluNote = sozluNote2;
        }
        if (sozluNote3>=0 && sozluNote3<=100){
            c3.sozluNote = sozluNote3;
        }

    }

    void isPass(){
//        c1.note = tarih notu
//        c2.note = fizik notu
//        c3.note = matematik notu
//        c1.sozluNote = tarih sözlü notu
//        c2.sozluNote  = fizik sözlü notu
//        c3.sozluNote  = matematik sözlü notu

        this.averageTarih = (c1.note*0.8)+(c1.sozluNote*0.2);
        this.averageFizik = (c2.note*0.8)+(c2.sozluNote*0.2);
        this.averageMatematik = (c3.note*0.8)+(c3.sozluNote*0.2);

        this.averageMain = (this.averageTarih+this.averageFizik+this.averageMatematik)/3.0;

        if (this.averageMain>=55){
            System.out.println("----------------------");
            System.out.println(name+ "\t"+ "Sınıfı Geçti");
            isPass=true;
        }else {
            System.out.println(name+ "\t"+ "Sınıfta Kaldı");
            isPass=false;
        }
        System.out.println("Ortalaması: " + averageMain);


        printNote();

    }


    void printNote(){
        System.out.println(c1.name + "Notu\t:\t" + averageTarih);
        System.out.println(c2.name + "Notu\t:\t" + averageFizik);
        System.out.println(c3.name + "Notu\t:\t" + averageMatematik);
        System.out.println("----------------------");
    }



    }





