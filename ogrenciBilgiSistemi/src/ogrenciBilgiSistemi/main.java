package ogrenciBilgiSistemi;

public class main {

	public static void main(String[] args) {
		
	Teacher teacher = new Teacher("Furkan", "MAT", "0531914154648");
	
	Teacher teacher1 = new Teacher("Şahin", "FZK", "05315486141754");
	
	Teacher teacher2 = new Teacher("Kemal", "TRH", "05314895456");
	
	teacher.print();
	
	teacher1.print();
	
	teacher2.print();
	
	
	Course tarih = new Course("Tarih",58,"TRH",50);
	
	Course fizik = new Course("Fizik",58,"FZK",30);
	
	Course matematik = new Course("math",789,"MAT",20);
	
	tarih.addTeacher(teacher);
	
	fizik.addTeacher(teacher);
	
	matematik.addTeacher(teacher);
	
	//tarih.printTeacherInfo();
	
	//fizik.printTeacherInfo();
	
	//matematik.printTeacherInfo();
	
	
	Student student = new Student("Furkan","2",matematik,fizik,tarih,"211");
	
	student.addBulkExamNote(40, 30, 70);
	
	student.addSözlüNote(80, 50, 60);
	
	student.noteCalculate(matematik);
	student.noteCalculate(fizik);
	student.noteCalculate(tarih);
	
	student.printNote();
	
	student.isPass();
	
	
	
	
	
	
	

	}

}
