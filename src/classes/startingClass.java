package classes;

/**
 * A java class for stating class in Dark Souls
 * 
 * @author Kostas Chasapis
 *
 */

public class startingClass {

	private String name;// The name of sc
	private int numberOfStats;
	private int[] stats;// Array with current stats
	private int[] baseStats;// Array with Base stats

	/**
	 * The constructor of startingClass
	 * <p>
	 * Set all parameters to NULL or zero and numberOfStats base of the input When
	 * create an object set the number of stats <br>
	 * Each game has different number of starting classes <br>
	 * DS1 has 10. <br>
	 * DS2 has 8. <br>
	 * DS3 has also 10.
	 * 
	 * @param numberOfStats Each game has different number of stats
	 */
	public startingClass(int numberOfStats) {
		name = new String("");
		this.numberOfStats = numberOfStats;
		stats = new int[numberOfStats];
		baseStats = new int[numberOfStats];
		for (int i = 0; i < numberOfStats; i++) {
			stats[i] = 0;
			baseStats[i] = 0;
		}
	}

	/**
	 * Get for name
	 * 
	 * @return Name of the starting class
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set for name
	 * 
	 * @param name Name of the starting class
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get for numberOfStats
	 * 
	 * @return The number of stats
	 */
	public int getNumberOfStats() {
		return numberOfStats;
	}
    
	/**
	 * Get the stats array
	 * @return The array with all the stats from a game class
	 */
	public int[] getStats() {
		return stats;
	}
	
	/**
	 * Set an array with integers as stats
	 * @param Array with integers to set as stats
	 */
	public void setStats(int[] stats) {
		this.stats = stats;
	}
	
	/**
	 * Get a stat from the array
	 * 
	 * @param i The index of the stat
	 * @return The specific stat
	 */
	public int getSpecificStat(int i) {
		return stats[i];
	}

	/**
	 * Set a specific stat
	 * 
	 * @param i    Index of the stat in the array
	 * @param stat The stat to set
	 */
	public void setSpecificStat(int i, int stat) {
		this.stats[i] = stat;
	}

	/**
	 * Get the Base Stats array 
	 * @return The array with the base stats of a game class
	 */
	public int[] getBaseStats() {
		return baseStats;
	}

	/**
	 * Set the baseStats array
	 * 
	 * @param baseStats The array to set in to baseStats
	 */
	public void setBaseStats(int[] baseStats) {
		this.baseStats = baseStats;
	}

	/**
	 * Get a specific stat from the baseStats array
	 * 
	 * @param i The index of the stat
	 * @return The stat from baseStats array
	 */
	public int getSpecificBaseStats(int i) {
		return baseStats[i];
	}

}
