package workspace.goormChallenge.src.week1;
    
import java.io.*;

class AthleticPlayer230814 {
	public static void main(String[] args) throws Exception {
		//W, R 값 저장할 변수 선언
		int W = 0;
		int R = 0;
		
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		//입력값이 숫자일 때만 int로 변환해주고, 숫자가 아닐 시 다시 입력하도록 한다.
		boolean validInput = false;
		while(!validInput){
			//입력받은 문자열을 공백을 기준으로 나누어 배열로 저장
			String[] values = input.split(" ");
		if(values.length >= 2){
			try{
				W = Integer.parseInt(values[0]);
				R = Integer.parseInt(values[1]);
				validInput = true;
			} catch(NumberFormatException e) {
				System.out.println("올바른 숫자 형식이 아닙니다. 다시 입력해주세요.");
				input = br.readLine();
			} //trycatch

		} else {
				System.out.println("무게(W)와 반복횟수(R) 모두 입력해주세요.");
				input = br.readLine();
		}//if
		}//while
		
		//RM 계산
		double RM = W * (1 + ((double)R / 30));
		RM = (int)RM;
		// 소수점 이하를 없애고 형식에 맞게 출력
		System.out.printf("%.0f%n", RM);
		
	} //main()
} //class