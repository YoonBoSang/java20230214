package ch15.sec06.exam02;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		//Queue 컬렉션 생성
	Queue<Message> messageQueue = new LinkedList<>();
	
	//메시지 넣기
	messageQueue.offer(new Message("snedMail", "홍길동"));
	messageQueue.offer(new Message("snedSMS", "신용권"));
	messageQueue.offer(new Message("snedKakaotalk", "감자바"));
	
	//메세지를 하나씩 꺼내어 처리
	while(!messageQueue.isEmpty()) {
		Message message = messageQueue.poll();
		switch(message.command) {
		case "sendMail": 
			System.out.println(message.to + "님에게 메일을 보냅니다.");
			break;
		case "sendSMS": 
		System.out.println(message.to + "님에게 SMS를 보냅니다.");
		break;
		case "sendKakaotalk": 
			System.out.println(message.to + "님에게 Kakaotalk를 보냅니다.");
			break;
		}
	}
	}
}
