package p0;

public class Nation {
	String name;
	int population;
	Nation enemy;
	Nation ally;
	
	public Nation(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	public void setEnemy(Nation n) {
		this.enemy = n;
		n.enemy = this;
	}
	
	public void setAlly(Nation n) {
		this.ally = n;
		n.ally = this;
	}
	
	public void backstab() {
		Nation temp = this.ally;
		this.ally = this.enemy;
		this.enemy = temp;
	}
	
	public String getRelationship(Nation n) {
		if (n == this.enemy) {
			return "enemy";
		} else if (n == this.ally) {
			return "ally";
		} else {
			return "no relationship";
		}
	}
	
	public String toString() {
		String output = this.name + " has " + this.population + " people.";
		if (this.enemy == null) {
			output += " It has no enemy.";
			if (this.ally == null) {
				output += " It has no ally.";
			} else {
				output += " Its ally is " + this.ally.name + ".";
			}
		} else if (this.ally == null) {
			if (this.enemy == null) {
				output += " It has no enemy.";
			} else {
				output += " Its enemy is " + this.enemy.name + ".";
			}
			output += " It has no ally.";
		} else {
			output += " Its enemy is " + this.enemy.name + " and its ally is " + this.ally.name + ".";
		}
		return output;
	}
}
