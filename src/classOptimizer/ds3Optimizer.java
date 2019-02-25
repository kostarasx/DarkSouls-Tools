package classOptimizer;

import classes.ds3Class;


/**
 * Java class for Dark Souls III optimizer
 * </p>
 * The purpose is to enter a new stat and modify the  levels of game classes</br>
 * and find the best with the lowest soul level
 * @author Kostas Chasapis
 *
 */

/*
 * Class variables
 * allClasses An array with the 10 dark souls 3 classes
 * newLevel An array with 10 integers. Each element is the soul level of a game class
 * classPointer An array with 10 integers. Each elements  at first is the index of the array in allClasses array
 * 				After the sort based of the the level, each elements is also sorted
 *
*                                   		Stats[]
 * 0.Knight             					0.Level
 * 1.Mercenary								1.Vigor
 * 2.Warrior								2.Attunement
 * 3.Herald									3.Endurance 	
 * 4.Thief									4.Vitality
 * 5.Assassin								5.Strength			
 * 6.Sorcerer								6.Dexterity						
 * 7.Pyromancer								7.Intelligence			
 * 8.Cleric									8.Faith						
 * 9.Deprived								9.Luck									
*/
public class ds3Optimizer {

		private ds3Class[] allClasses;
		public static final int NUMBER_OF_CLASSES = 10;
		private int[] newLevel; 
		private int[] classPointer; 
		
		/**
		 * The ds3Optimizer class constructor
		 * <p>
		 * Initialize all the variables and the arrays</br>
		 * And set the arrays for later usage
		 */
		public ds3Optimizer(){
			allClasses = new ds3Class[NUMBER_OF_CLASSES];
			newLevel = new int[NUMBER_OF_CLASSES];
			classPointer = new int[NUMBER_OF_CLASSES];
			setStartingStats();
			storeBaseStats();
			resetNewLevelArray();
		}
		
		/**
		 * 
		 * @return The array of integers classPointer
		 */
		public int[] getClassPointer() {
			return classPointer;
		}
		
		/**
		 * Set the starting stats for all the game classes </br>
		 * Starting with the first with the i as a counter
		 * 
		 */
		public void setStartingStats() {
			int i = 0;// counter

			// Knight
			allClasses[i].setName("Knight");
			allClasses[i].setSpecificStat(0, 9);  // Lvl = 9
			allClasses[i].setSpecificStat(1, 12); // Vgr = 12
			allClasses[i].setSpecificStat(2, 10); // Att = 10
			allClasses[i].setSpecificStat(3, 11); // End = 11
			allClasses[i].setSpecificStat(4, 15); // Vit = 15
			allClasses[i].setSpecificStat(5, 13); // Stg = 13
			allClasses[i].setSpecificStat(6, 12); // Dex = 12
			allClasses[i].setSpecificStat(7, 9);  // Int = 9
			allClasses[i].setSpecificStat(8, 9);  // Fth = 9
			allClasses[i].setSpecificStat(9, 7);  // Lck = 7
			i++; // i = 1

			// Mercenary
			allClasses[i].setName("Mercenary");
			allClasses[i].setSpecificStat(0, 8);  // Lvl = 8
			allClasses[i].setSpecificStat(1, 11); // Vgr = 11
			allClasses[i].setSpecificStat(2, 12); // Att = 12
			allClasses[i].setSpecificStat(3, 11); // End = 11
			allClasses[i].setSpecificStat(4, 10); // Vit = 10
			allClasses[i].setSpecificStat(5, 10); // Stg = 10
			allClasses[i].setSpecificStat(6, 16); // Dex = 16
			allClasses[i].setSpecificStat(7, 10); // Int = 10
			allClasses[i].setSpecificStat(8, 8);  // Fth = 8
			allClasses[i].setSpecificStat(9, 9);  // Lck = 9
			i++; // i= 2

			// 2.Warrior
			allClasses[i].setName("Warrior");
			allClasses[i].setSpecificStat(0, 7);  // Lvl = 7
			allClasses[i].setSpecificStat(1, 14); // Vgr = 14
			allClasses[i].setSpecificStat(2, 6);  // Att = 6
			allClasses[i].setSpecificStat(3, 12); // End = 12
			allClasses[i].setSpecificStat(4, 11); // Vit = 11
			allClasses[i].setSpecificStat(5, 16); // Stg = 16
			allClasses[i].setSpecificStat(6, 9);  // Dex = 9
			allClasses[i].setSpecificStat(7, 8);  // Int = 8
			allClasses[i].setSpecificStat(8, 9);  // Fth = 9
			allClasses[i].setSpecificStat(9, 11); // Lck = 11
			i++; // i = 3

			// 3.Herald
			allClasses[i].setName("Herald");
			allClasses[i].setSpecificStat(0, 9);  // Lvl = 9
			allClasses[i].setSpecificStat(1, 12); // Vgr = 12
			allClasses[i].setSpecificStat(2, 10); // Att = 10
			allClasses[i].setSpecificStat(3, 9);  // End = 9
			allClasses[i].setSpecificStat(4, 12); // Vit = 12
			allClasses[i].setSpecificStat(5, 12); // Stg = 12
			allClasses[i].setSpecificStat(6, 11); // Dex = 11
			allClasses[i].setSpecificStat(7, 8);  // Int = 8
			allClasses[i].setSpecificStat(8, 13); // Fth = 13
			allClasses[i].setSpecificStat(9, 11); // Lck = 11
			i++; // i = 4

			// 4.Thief
			allClasses[i].setName("Thief");
			allClasses[i].setSpecificStat(0, 5);  // Lvl = 5
			allClasses[i].setSpecificStat(1, 10); // Vgr = 10
			allClasses[i].setSpecificStat(2, 11); // Att = 11
			allClasses[i].setSpecificStat(3, 10); // End = 10
			allClasses[i].setSpecificStat(4, 9);  // Vit = 9
			allClasses[i].setSpecificStat(5, 9);  // Stg = 9
			allClasses[i].setSpecificStat(6, 13); // Dex = 13
			allClasses[i].setSpecificStat(7, 10); // Int = 10
			allClasses[i].setSpecificStat(8, 8);  // Fth = 8
			allClasses[i].setSpecificStat(9, 14); // Lck = 14
			i++; // i = 5

			// 5.Assassin
			allClasses[i].setName("Assasin");
			allClasses[i].setSpecificStat(0, 10); // Lvl = 10
			allClasses[i].setSpecificStat(1, 10); // Vgr = 10
			allClasses[i].setSpecificStat(2, 14); // Att = 14
			allClasses[i].setSpecificStat(3, 11); // End = 11
			allClasses[i].setSpecificStat(4, 10); // Vit = 10
			allClasses[i].setSpecificStat(5, 10); // Stg = 10
			allClasses[i].setSpecificStat(6, 14); // Dex = 14
			allClasses[i].setSpecificStat(7, 11); // Int = 11
			allClasses[i].setSpecificStat(8, 9);  // Fth = 9
			allClasses[i].setSpecificStat(9, 10); // Lck = 10
			i++; // i = 6

			// 6.Sorcerer
			allClasses[i].setName("Sorcerer");
			allClasses[i].setSpecificStat(0, 6);  // Lvl = 6
			allClasses[i].setSpecificStat(1, 9);  // Vgr = 9
			allClasses[i].setSpecificStat(2, 16); // Att = 16
			allClasses[i].setSpecificStat(3, 9);  // End = 9
			allClasses[i].setSpecificStat(4, 7);  // Vit = 7
			allClasses[i].setSpecificStat(5, 7);  // Stg = 7
			allClasses[i].setSpecificStat(6, 12); // Dex = 12
			allClasses[i].setSpecificStat(7, 16); // Int = 16
			allClasses[i].setSpecificStat(8, 9);  // Fth = 7
			allClasses[i].setSpecificStat(9, 7);  // Lck = 12
			i++; // i = 7

			// 7.Pyromancer
			allClasses[i].setName("Pyromancer");
			allClasses[i].setSpecificStat(0, 8);  // Lvl = 8
			allClasses[i].setSpecificStat(1, 11); // Vgr = 11
			allClasses[i].setSpecificStat(2, 12); // Att = 12
			allClasses[i].setSpecificStat(3, 10); // End = 10
			allClasses[i].setSpecificStat(4, 8);  // Vit = 8
			allClasses[i].setSpecificStat(5, 12); // Stg = 12
			allClasses[i].setSpecificStat(6, 9);  // Dex = 9
			allClasses[i].setSpecificStat(7, 14); // Int = 14
			allClasses[i].setSpecificStat(8, 14); // Fth = 14
			allClasses[i].setSpecificStat(9, 7);  // Lck = 7
			i++; // i = 8

			// 8.Cleric
			allClasses[i].setName("Cleric");
			allClasses[i].setSpecificStat(0, 7); // Lvl = 7
			allClasses[i].setSpecificStat(1, 10); // Vgr = 10
			allClasses[i].setSpecificStat(2, 14); // Att = 14
			allClasses[i].setSpecificStat(3, 9); // End = 9
			allClasses[i].setSpecificStat(4, 7); // Vit = 7
			allClasses[i].setSpecificStat(5, 12); // Stg = 12
			allClasses[i].setSpecificStat(6, 8); // Dex = 8
			allClasses[i].setSpecificStat(7, 7); // Int = 7
			allClasses[i].setSpecificStat(8, 16); // Fth = 16
			allClasses[i].setSpecificStat(9, 13); // Lck = 13
			i++; // i = 9

			// 9.Deprived
			allClasses[i].setName("Deprived");
			allClasses[i].setSpecificStat(0, 1);  // Lvl = 1
			allClasses[i].setSpecificStat(1, 10); // Vgr = 10
			allClasses[i].setSpecificStat(2, 10); // Att = 10
			allClasses[i].setSpecificStat(3, 10); // End = 10
			allClasses[i].setSpecificStat(4, 10); // Vit = 10
			allClasses[i].setSpecificStat(5, 10); // Stg = 10
			allClasses[i].setSpecificStat(6, 10); // Dex = 10
			allClasses[i].setSpecificStat(7, 10); // Int = 10
			allClasses[i].setSpecificStat(8, 10); // Fth = 10
			allClasses[i].setSpecificStat(9, 10); // Lck = 10
		}
		
		/**
		 * Store the base stats for each of game class for later usage.
		 * For example user maybe wants to entered the stats for the beginning 
		 * so the stats must be reseted using the baseStats array
		 */
		public void storeBaseStats() {
			for (int i = 0; i < NUMBER_OF_CLASSES; i++) {
				allClasses[i].setBaseStats(allClasses[i].getStats());
			}
		}
		
		/**
		 * Reset the the stats array with the baseStats array.
		 * Also calling the resetNewLevelArray
		 */	
		public void resetBaseStats() {
			for(int i = 0; i < NUMBER_OF_CLASSES; i ++) {
				allClasses[i].setStats(allClasses[i].getBaseStats());
			}
			resetNewLevelArray();
		}
		
		/**
		 * Update any stat for all the the game classes 
		 * <p>
		 * If new value is bigger than the previous update the stat and increase the level based of the difference.\
		 * between the new and old value.</br>
		 * If the value is smaller but not 0, update the stat and decrease the level based of the difference
		 * between the old value and the new value. Also check if the value is not smaller than the starting value
		 * of each gaming class.</br>
		 * Last if the value is 0 means that the user dont care about the value when he makes his build.
		 * So the stat for each gaming class set to the staring value and update the level with the differenced betwenn
		 * old value and the base stat.
		 * <p>
		 * 0.Soul Level</br>
		 * 1.Vigor</br>
		 * 2.Attunement</br>
		 * 3.Endurance </br>
		 * 4.Vitality</br>
		 * 5.Strength</br>	
		 * 6.Dexterity</br>					
		 * 7.Intelligence</br>		
		 * 8.Faith</br>					
		 * 9.Luck</br>
		 * 
		 * @param newStat The new stat to be updated
		 * @param index The index of the stat in the array of stats
		 */
		public void updateStat(int newStat, int index) {
			int addLevel;
			int minusLevel;
			int newLevel;
			for (int i = 0; i < NUMBER_OF_CLASSES; i++) {
				// Increase a stat
				if (newStat > allClasses[i].getSpecificStat(index)) {
					// Calculate and set the new level base on new stat
					addLevel = newStat - allClasses[i].getSpecificStat(index);//
					newLevel = allClasses[i].getSpecificStat(0) + addLevel;
					allClasses[i].setSpecificStat(0, newLevel);
					// Set the new stat
					allClasses[i].setSpecificStat(index, newStat);
				}
				// Decrease Vigor and 0 dont care
				else if (((newStat - allClasses[i].getSpecificBaseStats(index)) > 0) && newStat != 0) {
					// Calculate and set the new level base on new Vigor
					minusLevel = allClasses[i].getSpecificStat(index) - newStat;
					newLevel = allClasses[i].getSpecificStat(0) - minusLevel;
					allClasses[i].setSpecificStat(0, newLevel);
					// Set the new Stat
					allClasses[i].setSpecificStat(index, newStat);
				}
				// Dont care and set to base stat
				else if (newStat == 0) {
					minusLevel = allClasses[i].getSpecificStat(index) - allClasses[i].getSpecificBaseStats(index);
					newLevel = allClasses[i].getSpecificStat(0) - minusLevel;
					allClasses[i].setSpecificStat(0, newLevel);
					// Set the new stat
					allClasses[i].setSpecificStat(index, allClasses[i].getSpecificBaseStats(index));
				}
			}
		}
		
		/**
		 * Set the newLevel array with the starting soul level and set the classPointer array.
		 */
		public void resetNewLevelArray() {
			for(int i = 0; i < NUMBER_OF_CLASSES; i++) {
				newLevel[i] = allClasses[i].getSpecificBaseStats(0);
				classPointer[i] = i;
			}
		}
		
		/**
		 * Every time a stat changes the newLevel array musy be update with the new level
		 */
		public void updateNewLeveArray() {
			for(int i = 0; i < NUMBER_OF_CLASSES; i++) {
				newLevel[i] = allClasses[i].getSpecificStat(0);
			}
		}
		
		/**
		 * A bubble sort for the new level array. The minimum element is first. Also classpoint changes also 
		 * following the changes of the newLevel array.
		 */
		public void optimizeClass() {
			int temp1 = 0;
			int temp2 = 0;
			for (int i = 0; i < NUMBER_OF_CLASSES; i++) {
				for (int j = 0; j < (NUMBER_OF_CLASSES - i - 1); j++) {
					if (newLevel[j] > newLevel[j + 1]) {
						temp1 = classPointer[j];
						classPointer[j] = classPointer[j + 1];
						classPointer[j + 1] = temp1;
						temp2 = newLevel[j];
						newLevel[j] = newLevel[j + 1];
						newLevel[j + 1] = temp2;
					}
				}
			}
		}
}
