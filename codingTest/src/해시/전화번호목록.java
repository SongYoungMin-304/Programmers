package �ؽ�;

import java.util.Arrays;

public class ��ȭ��ȣ��� {
	
	public boolean solution(String[] phone_book) {
		
		boolean answer = true;
		
		// ������ ���ؼ� for �ѹ��� ������ ó��
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
