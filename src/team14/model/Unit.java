package team14.model;

/**
 * Unit Class
 * @author mirafcry
 *
 */
public class Unit {
	private String name, unitClass, description;
	private int id, rank, exp, hp, atk, def, spd, price;
	
	/**
	 * Creates new Unit
	 */
	public Unit(int id, String name, String unitClass, int rank, int exp, int hp, int atk, int def, int spd,
			String description, int price) {
		setID(id);
		setName(name);
		setUnitClass(unitClass);
		setRank(rank);
		setExp(exp);
		setHP(hp);
		setAtk(atk);
		setDef(def);
		setSpd(spd);
		setDescription(description);
		setPrice(price);
	}
	
	@Override
	public String toString() {
		return "Unit[id=" + getID() + ", name=" + getName() + ", class=" + getUnitClass() + ", rank=" + getRank() + ", exp=" + getExp() +
				", hp=" + getHP() + ", atk=" + getAtk() + ", def=" + getDef() + ", spd=" + getSpd() + ", description="
				+ ", price=" + getPrice() + "]";
	}
	
	public int getID() {
		return id;
	}
	
	private void setID(int id) {
		if(id < 0 ) {
			throw new IllegalArgumentException("Please enter valid ID.");
		}
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUnitClass() {
		return unitClass;
	}
	
	public void setUnitClass(String unitClass) {
		this.unitClass = unitClass;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public int getDef() {
		return def;
	}
	
	public void setDef(int def) {
		this.def = def;
	}
	
	public int getSpd() {
		return spd;
	}
	
	public void setSpd(int spd) {
		this.spd = spd;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
