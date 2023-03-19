# 01. 2차원으로 만들기

* [프로그래머스](https://school.programmers.co.kr/learn/courses/30/lessons/120842) 
* [자바 소스](../../CoTeStudy/src/programmers/Test01.java)


## **문제 설명**

정수 배열 `num_list`와 정수 `n`이 매개변수로 주어집니다. `num_list`를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.

`num_list`가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 `n`이 2이므로 `num_list`를 2 * 4 배열로 다음과 같이 변경합니다. 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

| num_list | n | result |
| --- | --- | --- |
| [1, 2, 3, 4, 5, 6, 7, 8] | 2 | [[1, 2], [3, 4], [5, 6], [7, 8]] |

### 제한사항

- `num_list`의 길이는 `n`의 배 수개입니다.
- 0 ≤ `num_list`의 길이 ≤ 150
- 2 ≤ `n` < `num_list`의 길이

### 입출력 예

| num_list | n | result |
| --- | --- | --- |
| [1, 2, 3, 4, 5, 6, 7, 8] | 2 | [[1, 2], [3, 4], [5, 6], [7, 8]] |
| [100, 95, 2, 4, 5, 6, 18, 33, 948] | 3 | [[100, 95, 2], [4, 5, 6], [18, 33, 948]] |

### 입출력 예 설명

입출력 예 #1

- `num_list`가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 `n`이 2이므로 2 * 4 배열로 변경한 [[1, 2], [3, 4], [5, 6], [7, 8]] 을 return합니다.

입출력 예 #2

- `num_list`가 [100, 95, 2, 4, 5, 6, 18, 33, 948] 로 길이가 9이고 `n`이 3이므로 3 * 3 배열로 변경한 [[100, 95, 2], [4, 5, 6], [18, 33, 948]] 을 return합니다.

---

## 풀이

```java
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }
        return answer;
    }
}
```

### 접근 방법

1. 배열 num_list 의 요소들을 n개만큼 나누어서 새로운 2차배열을 만들어야 함
    
    ```java
    int[][] answer = new int[num_list.length / n][n];
    ```
    
2. 반복문을 배열 num_list의 길이만큼 돌려야 함
    1. 이때 0 부터 num_list.length - 1 까지의 값이 필요하기때문에 for문을 사용!
    
    ```java
    for (int i = 0; i < num_list.length; i++) {
    
    }
    ```
    
3. 값이 채워질 배열의 인덱스를 어떻게 할까 수차례 고민하다가 나눗셈의 몫과 나머지를 이용하여
  n이 2일 때  
  0 / 2 = 0 , 0 % 2 = 0  
  1 / 2 = 0 , 1 % 2 = 1  
  2 / 2 = 1 , 2 % 2 = 0  
  3 / 2 = 1 , 3 % 2 = 1  
  4 / 2 = 2 , 4 % 2 = 0  
  5 / 2 = 2 , 5 % 2 = 1  
  …  
  ..  
으로  0,0 _ 0,1 _ 1,0 _ 1,1 _ 2,0 _ 2,1 의 규칙이 나타남을 발견!
    
    ```java
    for ( ... ) {
    	answer[i / n][i % n] = num_list[i];
    }
    ```
    
4. 완성!
    
    ```java
    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];
    
            for (int i = 0; i < num_list.length; i++) {
                answer[i / n][i % n] = num_list[i];
            }
            return answer;
        }
    }
    ```
    

### 느낀점

지금까지 풀었던 문제들을 돌이켜 보면 , 코딩테스트 입문 과정에서는 나눗셈과 나머지로 풀 수 있는 코딩테스트 문제가 많았다.

나눗셈과 나머지로 문제를 해결하는 사고를 늘릴 수 있는 연습을 해놓으면 좋을것 같다고 느꼈다.

화이팅💪