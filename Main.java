package com.company;

public class Main {

    public static void main(String[] args) {
    //ÖĞRETMEN TANIMLAMALARI
	Teacher teacher1 = new Teacher("Mahmut Hoca", "111111111111", "TRH");
	Teacher teacher2 = new Teacher("Emel Hoca", "222222222222", "FZK");
	Teacher teacher3 = new Teacher("Ahmet Hoca", "33333333333", "MAT");

	//DERS TANIMLAMALARI
	Course tarih = new Course("Tarih", "101", "TRH");
	Course fizik = new Course("Fizik", "102", "FZK");
	Course matematik = new Course("Matematik", "103", "MAT");

	//ÖĞRENCİ TANIMLAMALARI
	Student student1 = new Student("İnek Şaban", "123", "4", tarih, fizik, matematik );
	Student student2 = new Student("Düdük Necmi", "124", "4", tarih, fizik, matematik );

	//PROGRAM ÇIKTISI
	student1.addBulkExamNote(60,40,70,80, 60, 40);
	student1.isPass();
	student2.addBulkExamNote(55,55,55,55,55,55);
	student2.isPass();



    //Course1 Dersine Öğretmen Atamaları (Course sınıfı içindeki addTeacher Metodu ile))
	tarih.addTeacher(teacher1);
	fizik.addTeacher(teacher2);
	matematik.addTeacher(teacher3);



    }

}
