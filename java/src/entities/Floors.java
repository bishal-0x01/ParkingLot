
package entities;
import java.util.*;
import java.io.*;


public class Floors{
	private int id;
	private boolean fullyOccupied;

	public int getId(){
		return this.id;
	}

	public boolean isFullyOccupied(){
		return this.fullyOccupied;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setFullyOccupied(boolean isOccupied){
		this.fullyOccupied = isOccupied;
	}
}