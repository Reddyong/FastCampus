package ch16;

public class LeastJob implements Schedular {

	@Override
	public void getNextCall() {

		System.out.println("상담 전화를 대기가 적은 상담원에게 연결합니다.");

	}

	@Override
	public void sendCallToAgent() {

		System.out.println("대기가 적은 순서의 상담원에게 배분합니다.");
	}

}
