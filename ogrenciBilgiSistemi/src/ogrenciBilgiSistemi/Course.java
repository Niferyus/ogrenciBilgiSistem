package ogrenciBilgiSistemi;

public class Course {
	
String name;
int code;
String prefix;
Teacher teacher;
int note;
int sözlüYüzdesi;
int söznote;
int ort;
	
public Course(String name,int code,String prefix,int sözlüYüzdesi){
	this.name = name;
	this.code = code;
	this.prefix = prefix;
	this.note = 0;
	this.sözlüYüzdesi = sözlüYüzdesi; 
	}	

void printTeacherInfo() {
	this.teacher.print();
}

void addTeacher(Teacher teacher) {
	if(teacher.branch.equals(this.prefix)){
		this.teacher = teacher;
	}
	else {
		System.out.println("Öğretmen ve ders uyuşmuyor");
	}

}



}
