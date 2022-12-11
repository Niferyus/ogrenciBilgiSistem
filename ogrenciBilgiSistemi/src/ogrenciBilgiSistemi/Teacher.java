package ogrenciBilgiSistemi;

public class Teacher {
	String name; 
	String mpno; 
	String branch;

	public Teacher(String name,String branch,String mpno) {
		this.name = name;
		this.branch = branch;
		this.mpno = mpno;
		
	}
	

	void print() {
		System.out.println("Adı: "+ name+ "Telefon numarası: "+ mpno+ "Bolumu: "+branch);

}
}