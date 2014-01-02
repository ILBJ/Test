package p6_1;

public class Combinationlock {
	
	/**
	 * Program that asks the creates a combination lock and locks/unlocks it. 
	 */
	
		  private boolean open;     		
		  private String combo; 	
		  private String enteredCombo;   
		  
		/**
		 * @param combination is the combination the user tries to unlock the lock.
		 */		
		  
		  public Combinationlock(String combination) {		
		    combo = combination;		
		    open = false;
		    enteredCombo = "";
		  }
		  
		  /**
		   * @param setCombo sets the original combination.
		   */
		  
		  public void dial(String setCombo) {
		    enteredCombo += setCombo;	
		  }	
		  
		/**
		 * Tests to see if the user's inputed combination matches the correct original combination
		 */
		  
		  public void unlock() {
			  if(!open){
		    int lastThree = enteredCombo.length() - 3;		
		    String correct;
		    if(enteredCombo.length() >= 3) 
		    	correct = enteredCombo.substring(lastThree, enteredCombo.length());		
		     else correct = enteredCombo;
		    if(enteredCombo.length() >= 3 && combo.equals(correct)) {		
		      open = true;		
		    }
		    else open = false;
		  }	
				  
		  }
		   /**
		    * returns if the locker is open or not.
		    * @return if the locker is open or not.
		    */	
		  
		  public boolean isOpen() {		
		    return open;	
		  }	
		  
		 /**
		  * Closes the locker after the user is done.
		  */	
		  
		  public void closeLock() {
		    combo = "";	
		    open = false;	
		  }
		
		     
		
		     
		
	}
	
