package vda.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//정수형(int)변수 value 선언
		   int value=0;
		
		//연산 결과를 변수 result의 초기값으로 대입
			value =value;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(value);

		//문자변수 ch1 과 ch2 에 'A'  'B'  각각 할당 하고 출력한 후 ch1 과 ch2의 값을 swap 후 출력
		char ch1 ='A';
		char ch2 = 'B';
		System.out.printf("%c,%c\n",ch1,ch2);
		char temp = ch1;
		ch1 = ch2;
		ch2 = temp;
		System.out.printf("%c,%c\n",ch1,ch2);
		System.out.println("이름은 \"HR\"");
		// \n \t

		int i =10;
		System.out.println(i);
		float f =i;
		System.out.println(f);
	}
}