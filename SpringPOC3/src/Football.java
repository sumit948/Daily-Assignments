
public class Football {
		private String football;

		private Predator boots;
		
		

		public Predator getBoots() {
			return boots;
		}

		public void setBoots(Predator boots) {
			this.boots = boots;
		}

		public String getFootball() {
			return football;
		}

		public void setFootball(String football) {
			this.football = football;
		}

		@Override
		public String toString() {
			return "Football [football=" + football + ", boots=" + boots + "]";
		}

		

	
		
		
}
