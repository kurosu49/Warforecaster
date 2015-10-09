package team14.model;

/**
 * Strategist Class
 * @author mirafcry
 * @version 11/24/14
 */
public class Strategist {
	
	private String name, username, password;
	private int id, level, exp, balance, tID;
	
	/**
	 * Create a new Strategist.
	 * @param name
	 * @param username
	 * @param password
	 * @param level
	 * @param exp
	 * @param balance
	 * @throws IllegalArgumentException if name, username, and/or password are invalid and if level, exp,
	 * and/or balance is less than 0.
	 */
	public Strategist(int id, String name, String username, String password, int level,
			int exp, int balance, int tID) {
		setID(id);
		setName(name);
		setUsername(username);
		setPassword(password);
		setLevel(level);
		setExp(exp);
		setBalance(balance);
		setTournamentID(tID);
	}
	
	@Override 
	public String toString() {
		return "Strategist[id="+ getID()  + " name=" + getName() + ", username=" + getUsername() + ", password=" + getPassword() + ", level="
				+ getLevel() + ", exp=" + getExp() + ", balance=" + getBalance() + "]";		
	}
	
	
	/**
	 * Returns level.
	 * @return level
	 */
	public int getID() {
		return id;
	}
	
	/**
	 * Modifies level of the Strategist.
	 * @param level
	 */
	public void setID(int id) {
		if(level < 0) {
			throw new IllegalArgumentException("Please supply a level greater than or equal to 0.");
		}
		this.id = id;
	}
	
	/**
	 * Returns name.
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Modifies the name of the Strategist.
	 * @param name
	 */
	public void setName(String name) {
		if(name == null || name.length() == 0) {
			throw new IllegalArgumentException("Please supply a valid name.");
		}
		this.name = name;
	}
	
	/**
	 * Returns username.
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Modifies username of the Strategist.
	 * @param username
	 */
	public void setUsername(String username) {
		if(username == null || username.length() == 0) {
			throw new IllegalArgumentException("Please supply a valid username.");
		}
		this.username = username;
	}
	
	/**
	 * Returns password.
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Modifies password of the Strategist.
	 * @param password
	 */
	public void setPassword(String password) {
		if(password == null || password.length() == 0) {
			throw new IllegalArgumentException("Please supply a valid password");
		}
		this.password = password;
	}
	
	/**
	 * Returns level.
	 * @return level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * Modifies level of the Strategist.
	 * @param level
	 */
	public void setLevel(int level) {
		if(level < 0) {
			throw new IllegalArgumentException("Please supply a level greater than or equal to 0.");
		}
		this.level = level;
	}
	
	/**
	 * Returns exp.
	 * @return exp
	 */
	public int getExp() {
		return exp;
	}
	
	/**
	 * Modifies exp of the Strategist.
	 * @param exp
	 */
	public void setExp(int exp) {
		if(exp < 0) {
			throw new IllegalArgumentException("Please supply an exp value greater than or equal to 0.");
		}
		this.exp = exp;
	}
	
	/**
	 * Returns balance.
	 * @return balance
	 */
	public int getBalance() {
		return balance;
	}
	
	/**
	 * Modifies balance of the Strategist.
	 * @param balance
	 */
	public void setBalance(int balance) {
		if(balance < 0) {
			throw new IllegalArgumentException("Please supply a balance greater than or equal to 0.");
		}
		this.balance = balance;
	}
	
	/**
	 * Returns level.
	 * @return level
	 */
	public int getTournamentID() {
		return tID;
	}
	
	/**
	 * Modifies level of the Strategist.
	 * @param level
	 */
	public void setTournamentID(int tID) {
		if(level < 0) {
			throw new IllegalArgumentException("Please supply a level greater than or equal to 0.");
		}
		this.tID = tID;
	}

}
