package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "숫자를 입력하세요: " );
		
		int inputNumber = scanner.nextInt();
		/* 여기에 구현 코드를 작성 합니다. */
		int startNum;
		int ret = 0;
		
		if(inputNumber%2==0){
			startNum=0;
		} else {
			startNum=1;
		}
		
		while(startNum<=inputNumber){
			ret += startNum;
			startNum += 2;
		}
		
		System.out.println("결과 값 : "+ret);
		scanner.close();
	}

}
