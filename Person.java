/* Author: Harold Pham
 * Creation date: 4/26/2020
 * Latest revisions: 4/26/2020
 * Description: This class sets up a general structure for a person class holding the normal status of a person.
 * The intended purpose for this class is to be integrated into a game program.
 */

public class Person {
//FIELDS
	private String name;
	private int health;
	private int hunger;
	private int energy;
	private boolean deceased;
	private boolean starving;
	private boolean exhausted;
	
//CONSTRUCTORS
	public Person(String name) //construct the person at full status
	{
		this.name = name;
		health = 100;
		hunger = 100;
		energy = 100;
		deceased = false;
		starving = false;
		exhausted = false;
	}
	
	public Person(String name, int health, int hunger, int energy) //construct a person based off of status
	{
		this.name = name;
		this.health = health;
		this.hunger = hunger;
		this.energy = energy;
		deceased = false;
		starving = false;
		exhausted = false;
	}
	
	
//ACCESSOR METHODS
	public String getName() //get name of person
	{
		return name;
	}
	
	public int getHealth() //get health of person
	{
		return health;
	}
	
	public int getHunger() //get hunger of person
	{
		return hunger;
	}
	
	public int getEnergy() //get energy of person
	{
		return energy;
	}
	
	public String getHealthModule() //get text form for health of person
	{
		return name + "s Health: " + getHealth();
	}
	
	public String getHungerModule() //get text form for hunger of person
	{
		return name + "s Hunger: " + getHunger();
	}
	
	public String getEnergyModule() //get text form for energy of person
	{
		return name + "s Energy: " + getEnergy(); 
	}
	
	public boolean isStarving() //get starve status
	{
		return starving;
	}
	
	public boolean isExhausted() //get exhaustion status
	{
		return exhausted;
	}
	
	public boolean isDead() //get death status
	{
		return deceased;
	}
	
	
//MUTATOR METHODS
	public void eats(int amount) //adds hunger of a person for an amount
	{
		hunger += amount;
		System.out.println(name + "s hunger is refilled by " + amount + ".\n" + name + "s Hunger: " + hunger);
	}
	
	public void hungers(int amount) //subtracts hunger of a person for an amount
	{
		hunger -= amount;
		System.out.println(name + "s hunger fell by " + amount + ".\n" + name + "s Hunger: " + hunger);
		checkHunger();
	}
	
	public void recover(int amount) //adds health of a person for an amount
	{
		health += amount;
		System.out.println(name + " has recovered " + amount + " health.\n"+name+"s Health: " + health);
	}
	
	public void isHurt(int amount)//subtracts health of a person for an amount
	{
		health -= amount;
		System.out.println(name + " has lost " + amount + " health.\n"+name+"s Health: " + health);
		checkHealth();
	}
	
	public void rest(int amount) //adds energy of a person for an amount
	{
		energy+= amount;
		System.out.println(name + " has regained "+ amount + " energy.\n" + name+"s Energy: " + energy);
	}
	
	public void tires(int amount) //subtracts energy of a person for an amount
	{
		energy -= amount;
		System.out.println(name + " has lost " + amount + " energy.\n"+name+"s Energy: "+energy);
		checkEnergy();
	}
	
	
//MONITOR METHODS
	public void checkHunger() //checks hunger and changes status if necessary
	{
		if(hunger <= 0)
		{
			starving = true;
		}
		else
			starving = false;
	}
	
	public void checkEnergy() //checks energy and changes status if necessary
	{
		if(energy <= 0)
		{
			exhausted = true;
		}
		else
			exhausted = false;
	}
	
	public void checkHealth() //checks health and changes status if necessary
	{
		if(health <= 0)
		{
			deceased = true;
		}
	}
	

}
