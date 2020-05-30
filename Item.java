/* Author: Harold Pham
 * Creation date: 4/26/2020
 * Latest revisions: 5/29/2020
 * Description: This class will set up the required system for Item objects. Will mostly be utilized within the Main class.
 */
public class Item {
//FIELDS
	private String name;
	private int size;
	
//CONSTRUCTORS
	public Item(String name, int size)
	{
		this.name = name;
		this.size = size;
	}

//ACCESSOR METHODS	
	public String getName() //Returns the name of the object
	{
		return name;
	}
	
	public int getSize() //Returns the size of the specific object
	{
		return size;
	}
}
