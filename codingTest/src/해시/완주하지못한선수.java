package 해시;

import java.util.HashMap;

public class 완주하지못한선수 {
	
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String part : participant) {
			if(map.containsKey(part)) {
				map.put(part, map.get(part)+1);
			}else {
				map.put(part, 1);
			}
		}
		
		for(String comp : completion) {
				map.put(comp, map.get(comp)-1);
		}
		
		for(String key : map.keySet()) {
			if(map.get(key)==1) {
				answer = key;
				break;
			}
		}
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
