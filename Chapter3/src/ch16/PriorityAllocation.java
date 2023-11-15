package ch16;

public class PriorityAllocation implements Schedular {

	@Override
	public void getNextCall() {

		System.out.println("업무능력 순으로 상담원에게 연결합니다.");
	}

	@Override
	public void sendCallToAgent() {

		System.out.println("업무능력 순서의 상담원에게 배분합니다.");
	}

}
