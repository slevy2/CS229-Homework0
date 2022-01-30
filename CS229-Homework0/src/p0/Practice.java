package p0;

public class Practice {
	
	
	/*
	 * The reversedArray variable needed to be initialized in order to reverse the array.
	 * The for loop was missing the i++ needed to increment the loop.
	 * The set function would start at size - i, which would initially be an index outside of the array's bounds. This was fixed by
	 * subtracting 1.
	 */
	/**
	 * @param MyIntArray arr
	 * @return MyIntArray reversedArray: arr in reversed order
	 */
	public static MyIntArray reverseOrder(MyIntArray arr) {
		MyIntArray reversedArray = new MyIntArray(arr.size);
		
		for (int i = 0; i < arr.size; i++) {
			int val = arr.get(i);
			reversedArray.set(reversedArray.size - 1 - i, val);
			
		}
		
		return reversedArray;
		
	}
	
	
	
	// need to initialize clumps to 0
	// need to initialize inClump to false
	// need to start from second element in list
	// move !inClump check to inside first if statement
	/*
	 * Both the clumps and inClump variables needed to be initialized to 0 and false respectively.
	 * The for loop has to start at the second element in the list in order to check the object behind it without going out of bounds
	 * of the array.
	 * Previously, the function would check if the current index is inside the clump, set inClump to true, then immediately set it to
	 * false in the next if statement. The second if statement was changed to an else if, so it's only reached if the current index
	 * does not match the previous. Finally, the !inClump check was moved inside the first if statement so the clump total is only
	 * increased if the search is not already inside of a clump.
	 */
	/**
	 * @param MyIntArray arr
	 * @return int clumps : the number of clumps found
	 */
	public static int findClumps(MyIntArray arr) {
		
		int clumps = 0;
		Boolean inClump = false;
		
		for (int i = 1; i < arr.size; i++) {
			
			if (arr.get(i) == arr.get(i - 1)) {
				if (!inClump) {
					clumps += 1;
				}
				inClump = true;
			} else if (inClump) {
				inClump = false;
			}
			
			
		}
		
		return clumps;
				
	}
	
	// need to change print to return
	// base.contents not accessible -- need to use getter
	// need to assign results of replacement to new var
	/*
	 * The function needed return a value of type MyString, so the print statement was changed to a return.
	 * The contents value of base is private, so the getter method must be used.
	 * The replace function creates a new string as well, so the value must be assigned to a new variable. That variable (newBase)
	 * is assigned to the contents value of the new MyString to be returned.
	 */
	/**
	 * 
	 * @param myString base: the original myString
	 * @param myString remove: the sequence to remove from myString
	 * @return newBase = base - remove
	 */
	public static MyString removeMyString(MyString base, MyString remove) {
		
		String newBase = base.getContents().replace(remove.getContents(), "");
		return new MyString(newBase);
		
	}
	
	
	
	/*
	 * The contents value of base is private, so the getter method must be used.
	 */
	/**
	 * @param MyString base
	 * @param char c
	 * @return the number of times c appears in base
	 */
	public static int countChar(MyString base, char c) {
			
			String baseString = base.getContents();
			return countCharHelper(baseString, c, 0);
		
	}
	
	// need base case
	/*
	 * This recursive function was missing a base case, so eventually the index would reach a value beyond the bounds of the array.
	 * A base case was added to return 0 and end the recursion once the index is outside of the bounds. 
	 */
	/**
	 * @param String baseString
	 * @param char c
	 * @param int index
	 * @return the number of times c appears in base
	 */
	public static int countCharHelper(String baseString, char c, int index) {
		if (index >= baseString.length()) {
			return 0;
		}
		if(baseString.charAt(index) == c){
			return 1 + countCharHelper(baseString, c, index+1);
		}
		
		return countCharHelper(baseString, c, index+1);
		
	}

}
