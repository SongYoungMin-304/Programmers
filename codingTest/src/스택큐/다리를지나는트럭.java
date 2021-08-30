package 스택큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	
	class Truck{
		int position;
		int weight;
	}
	
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Truck> readyTrunk = new LinkedList<Truck>();
        Queue<Truck> truckOnBridge = new LinkedList<Truck>();
        
        for(int truck_weight : truck_weights) {
        	Truck truck = new Truck();
        	truck.position = 0;
        	truck.weight = truck_weight;
        	
        	readyTrunk.add(truck);
        }
        
        
        while(readyTrunk.size()!=0 || truckOnBridge.size()!=0) {

        	// step1 다리에 있는 트럭 옮기기
        	for(Truck truck : truckOnBridge) {
        		truck.position++;
        	}
        	
        	
        	if(truckOnBridge.size()!=0 && truckOnBridge.peek().position > bridge_length) {
        		truckOnBridge.poll();
        	}
        	
        	
        	// step2 대기 트럭 다리에 옮기기
        	int sumOfTruck = 0;
        	for(Truck truck : truckOnBridge) {
        		sumOfTruck+=truck.weight;
        	}
        	
        	if(readyTrunk.size()!=0 && sumOfTruck+readyTrunk.peek().weight <= weight) {
        		Truck truck = readyTrunk.poll();
        		truck.position = 1;
        		truckOnBridge.add(truck);
        	}
        	answer++;
        	
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		다리를지나는트럭 a = new 다리를지나는트럭();
		int[] test = {7,4,5,6};
		
		System.out.println(a.solution(2, 10, test));
		
	}

}
