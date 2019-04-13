import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DesignDSO1 {
	
	HashMap<Integer, Integer> valToInd;
    List<Integer> list;
    int ind = 0;
    
    /** Initialize your data structure here. */
    public DesignDSO1() {
        valToInd = new HashMap<>();
        list = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(valToInd.containsKey(val)) return false;
        list.add(val);
        valToInd.put(val,list.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        int ind = valToInd.getOrDefault(val,-1);
        if(ind == -1) return false;
        Collections.swap(list,ind,list.size()-1);
        int swappedWith = list.get(ind);
        valToInd.put(swappedWith,ind);
        list.remove(list.size()-1);
        valToInd.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int max = list.size();
        int min = 0;
        int ind = (int)(Math.random() * (max - min) + min);
        return list.get(ind);
    }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesignDSO1 obj = new DesignDSO1();
		 boolean param_1 = obj.insert(1);
		 boolean param_2 = obj.remove(2);
		int param_3 = obj.getRandom();
		 
		 System.out.println(param_1);
		 System.out.println(param_2);
		System.out.println(param_3);

	}

}
