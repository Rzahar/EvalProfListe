package generateService;
import java.util.ArrayList;
import java.util.List;

import models.Formation;



public class GenerateurFormations {
/*
 * Class permettant de g�n�rer 5 formations pour nourir notre serveur  
 */
		public static GenerateurFormations instances = null;
		private List<Formation> formations = new ArrayList<Formation>();
		
		
		private GenerateurFormations() {
			for (Formation formation : formations) {
				for (int i = 0; i < 5; i++) {
					formations.add(
							new Formation("Formation n�"+i,"Intitul� random" + i,9));
				}
			}
		}
		
		public static GenerateurFormations getInstance() {
			if (GenerateurFormations.instances == null) {
				GenerateurFormations.instances = new GenerateurFormations();
			}
			return instances;
		}
		
		public List<Formation> getFormations() {
			return this.formations; 
		}
		
		public Formation getFormationByName(String title) {
			Formation response = null;
			for (Formation post : formations) {
				if (post.getTitre().equals(title)) {
					response = post;
					break;
				}
			}
			return response;
		}	
}
