package 해시;

import java.util.Arrays;

public class 전화번호목록 {
	
	public boolean solution(String[] phone_book) {
		
		boolean answer = true;
		
		// 정렬을 통해서 for 한번만 돌리게 처리
		Arrays.sort(phone_book);
		
		for(int a = 0; a < phone_book.length-1; a++) {
				if(phone_book[a].startsWith(phone_book[a+1]) || phone_book[a+1].startsWith(phone_book[a])){
					answer = false;
					break;
				}
		}
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
