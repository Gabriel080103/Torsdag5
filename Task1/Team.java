	class Team{
		private String teamName;
		private int teamRank;
		private int numberOfPlayers;
		

		public Team(String teamName, int teamRank, int numberOfPlayers){

			this.teamName = teamName;
			this.teamRank = teamRank;
			this.numberOfPlayers = numberOfPlayers;

		}
		public void setRank(int newRank){

			this.teamRank = newRank;
}
			  public String toString() {
        return "Hold: " + teamName + " Rang: " + teamRank;
        
    }

		



	}