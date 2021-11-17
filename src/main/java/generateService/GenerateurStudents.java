package generateService;
import java.util.ArrayList;
import java.util.List;

import models.Formation;
import models.Student;



public class GenerateurStudents {

		public static GenerateurStudents instances = null;
		private List<Student> students = new ArrayList<Student>();
		private List<Formation> formations = new ArrayList<Formation>();
		
		
		private GenerateurStudents() {
			for (Student student : students) {
				for (int i = 0; i < 5; i++) {
					students.add(
							new Student("nom" + i, "prénom" + i, 19, Math.random()*20,"formation n°" + i)); 
				}
			}
		}
		public static GenerateurStudents getInstance() {
			if (GenerateurStudents.instances == null) {
				GenerateurStudents.instances = new GenerateurStudents();
			}
			return instances;
		}
		
		public List<Student> getStudents() {
			return this.students; 
		}
		
		public Student getStudentInfo(String nom) {
			Student response = null;
			for (Student post : students) {
				if (post.getNom().equals(nom)) {
					response = post;
					break;
				}
			}
			return response;
		}	
		
}
