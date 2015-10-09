package team14.model;


public class StUnit extends Unit {

	private int id, unitID, squadID, stratID, equipID;
	
	/**
	 * Creates new Unit
	 */
	public StUnit(int id, int unitID, int squadID, String name, String unitClass, int rank, int exp, int hp, int atk, int def, int spd,
			String description, int stratID, int equipID) {
		super(unitID, name, unitClass, rank, exp, hp, atk, def, spd, description, 0);
		setID(id);
		setSquadID(squadID);
		setDescription(description);
		setStratID(stratID);
		setEquipID(equipID);
	}
	
	@Override
	public String toString() {
		return "Unit[id=" + getID() + ", unitID=" + getUnitID() + ", name=" + getName() + ", class=" + getUnitClass() + ", rank=" + getRank() + ", exp=" + getExp() +
				", hp=" + getHP() + ", atk=" + getAtk() + ", def=" + getDef() + ", spd=" + getSpd() + ", description=" + getDescription() +
				  "]";
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

	public int getUnitID() {
		return unitID;
	}

	public void setUnitID(int unitID) {
		this.unitID = unitID;
	}

	public int getStratID() {
		return stratID;
	}

	public void setStratID(int stratID) {
		this.stratID = stratID;
	}

	public int getEquipID() {
		return equipID;
	}

	public void setEquipID(int equipID) {
		this.equipID = equipID;
	}

	public int getSquadID() {
		return squadID;
	}

	public void setSquadID(int squadID) {
		this.squadID = squadID;
	}
}
