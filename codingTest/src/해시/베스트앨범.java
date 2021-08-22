package �ؽ�;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ����Ʈ�ٹ� {

	static class Music {
		int seqno;
		int number;
		String genre;
		
		public Music(int seqno, int number, String genre) {
			super();
			
			this.seqno = seqno;
			this.genre = genre;
			this.number = number;
		}
	}

	public int[] solution(String[] genres, int[] plays) {
		
		// �帣 ũ�� map ó��
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int a = 0; a < genres.length; a++) {
			if(map.containsKey(genres[a])) {
				map.put(genres[a], map.get(genres[a])+plays[a]);
			}else {
				map.put(genres[a], plays[a]);
			}
		}
		
		ArrayList<String> best_genres = new ArrayList<String>();
		
		// �帣 �ִ밪 ó��
		while(map.size()!=0) {
			int max = -1;
			String max_key ="";
			
			for(String key: map.keySet()) {
				int temp = map.get(key);
				if(temp > max) {
					max = temp;
					max_key = key;
				}
			}
			best_genres.add(max_key);
			map.remove(max_key);
		}
		
		ArrayList<Music> result = new ArrayList<Music>();
		
		
		// �帣�� ����Ʈ �̾Ƽ� ���� ���� �ֱ�
		for(String genre : best_genres) {
			ArrayList<Music> list = new ArrayList<Music>();
			for(int a = 0 ; a < genres.length; a++) {
				if(genres[a].equals(genre)) {
					list.add(new Music(a, plays[a] , genres[a]));
				}
			}
			
			// ��ü ���� �ѹ� ����
			Collections.sort(list, (o1, o2) -> o2.number - o1.number);
			
			result.add(list.get(0));
			if(list.size()!=1) {
				result.add(list.get(1));
			}
		}
		
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++) {
        	answer[i] = result.get(i).seqno;
        }
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500]
		
		����Ʈ�ٹ� a = new ����Ʈ�ٹ�();
		String [] genres = {"classic", "pop", "classic", "classic", "pop"};
	         	int []plays = {500,     600,   150,       800,       2500};
		
		a.solution(genres, plays);
		
		for(int gene: a.solution(genres, plays)) {
			System.out.println(gene);
		}
	}
}
