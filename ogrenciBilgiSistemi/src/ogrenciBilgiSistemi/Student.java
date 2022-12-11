package ogrenciBilgiSistemi;

public class Student {
	String name;
	String classes;
	Course course1;
	Course course2;
	Course course3;
	boolean isPass;
	double avarage;
	String stuno;
	int sözlü;
	int yazılı;
	
	
 public Student(String name,String classes,Course course1,Course course2,Course course3,String stuno){
	 this.name = name;
	 this.classes = classes;
	 this.course1 = course1;
	 this.course2 = course2;
	 this.course3 = course3;
	 this.stuno = stuno;
	 this.avarage = 0.0;
	 this.isPass = false;
	}
 
 
 
 void noteCalculate(Course course){
	sözlü = course.söznote*course.sözlüYüzdesi/100;
	yazılı = course.note*(100-course.sözlüYüzdesi)/100;
	course.ort = sözlü + yazılı;
	if(course.ort<50) {
		System.out.println("Dersten kaldınız. "+"Ortalamnız: "+ course.ort);
	}
	else {
		System.out.println("Dersten geçtiniz. "+"Ortalamnız: "+ course.ort);
	}
	
 }
	 
 
 void addSözlüNote(int söznote1,int söznote2,int söznote3) {
	 if(söznote1>0 && söznote1<100) {
		 course1.note = söznote1;
	 }
	 if(söznote2>0 && söznote2<100) {
		 course2.note = söznote2;
	 }
	 if(söznote3>0 && söznote3<100) {
		 
		 course3.note = söznote3;
	 }
 }
 
 
 void addBulkExamNote(int note1,int note2,int note3) {
	 if(note1>0 && note1<100) {
		 course1.note = note1;
	 }
	 if(note2>0 && note2<100) {
		 
		 course2.note = note2;
	 }
	 if(note3>0 && note3<100) {
		 
		 course3.note = note3;
	 }
 }
 
 void printNote() {
	 System.out.println(course1.name + "Notu: " + course1.note);
	 System.out.println(course2.name + "Notu: " + course2.note);
	 System.out.println(course3.name + "Notu: " + course3.note);
 }
 
 void isPass() {
	  this.avarage = (this.course1.note+this.course2.note+this.course3.note)/3;
	 if(this.avarage>=50) {
		 System.out.println("sınıfı geçtiniz");
	 }
	 else {
		 System.out.println("sınıfta kaldınz");
	 }
 }
 
}
