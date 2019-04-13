import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFreqElements {
	
	public static List<Integer> topKFrequent(int[] nums, int k) {
		
		HashMap<Integer, Integer> hmap = new HashMap<>();
		
		for(int i:nums)
		{
			
			hmap.put(i,hmap.getOrDefault(i, 0)+1);
						
		}
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2) 
                                                                -> hmap.get(n1) - hmap.get(n2));
        
        for(int n : hmap.keySet())
        {
            heap.add(n);
            if(heap.size() > k)
                heap.poll();
        }
        
        
		List<Integer> list = new LinkedList<>();
        while(!heap.isEmpty())
            list.add(heap.poll());
        
        Collections.reverse(list);
        return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,1,1,2,2,3};
		
		List<Integer> list = topKFrequent(nums, 2);
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		
				

	}

}
