Q. 1 부터 n 사이에 있는 소수의 개수를 출력하세요

조건 : 2 ≤ n ≤ 100만

A.

1. 사용할 변수 생성 & 초기화
- 길이가 n+1인 boolean 타입의 배열 isPrime을 만듦
	-> 배열의 인덱스와 소수인지 판별할 숫자를 알아보기 쉽게 1:1로 매칭하기 위함
- isPrime 배열을 true로 초기화함 ( 기본값 false임 )
- 소수를 카운팅 할 변수 : count


boolean[] isPrime = new boolean[n + 1];
Arrays.fill(isPrime, true);
int count = 0;

--------------------------------------------------------------------------------------------------------------------------------

2. 2부터 i*i가 n보다 작을 때 까지 반복문 실행
-> 내용 : 소수인지 확인해서 isPrime 배열에 반영
         -> 소수가 아니면 false 처리
            -> 소수가 아닌 조건  = 소수*소수 + 0
                               소수*소수 + 소수
                               소수*소수 + 소수
                                ...

for (int i = 2; i * i < n; i++) {
   if (isPrime[i]) {
       for (int j = i * i; j <= n; j += i) {
           isPrime[j] = false;
       }
   }
}


n = 11일 때

i				조건문							증감식	 	if(isPrime[i])				 i*i			j <= n
2			 2*2 < 11 true				 i++			true								j				 조건문								증감식						isPrime[j]
																												 2*2		  4 <= 11		true			j += i			isPrime[4] = false
																												 4+2			6 <= 11		true									isPrime[6] = false;
																												 6+2			8 <= 11		true									isPrime[8] = false;
																												 8+2			10<= 11		true									isPrime[10]= false;

3			 3*3 < 11 true								  true							 3*3 			9 <= 11		true									isPrime[9] = false;
																												 9+3			12<= 11		false 종료

--------------------------------------------------------------------------------------------------------------------------------


3. 소수 개수 셈 : 2 ~ n까지 true인 값 카운팅



n = 11일 때

i					조건문							증감식		if(isPrime[i])				count
2			  2 <= 11 true				 i++				true							  1
3			  3 <= 11 true				    				true							  2
4			  4 <= 11 true				    			  false
5			  5 <= 11 true				    				true							  3
6			  6 <= 11 true				    				false
7			  7 <= 11 true				    				true							  4
8			  8 <= 11 true				    				false
9			  9 <= 11 true				    				false
10		  10<= 11 true				    				false
11		  11<= 11 true				    				true							  5
12			12<= 11 false


--------------------------------------------------------------------------------------------------------------------------------

결과 = 5













