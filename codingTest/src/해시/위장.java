package 해시;

import java.util.HashMap;

public class 위장 {
	
	public int solution(String[][] clothes) {
		
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String[] cloth : clothes) {
			if(map.containsKey(cloth[1])) {
				map.put(cloth[1], map.get(cloth[1])+1);
			}else {
				map.put(cloth[1], 1);
			}
		}
		
		for(String key : map.keySet()) {
			answer *= (map.get(key)+1);
		}
        
        return answer-1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
