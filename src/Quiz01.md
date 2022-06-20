#### 람다 규칙에 맞지 않는 표현식은?
1. `() -> {}` // 소괄호 안에 파라미터 / 중괄호 안에 메서드 식
2. `() -> "Raoul"` // 매개변수를 하나도 넣지 않는다면 Raoul 반환
3. `() -> { return "Mario" }` // return "Mairo"을 쓸거면 중괄호 생략 불가능. return 사용시 중괄호 사용!
4. `(Integer i) -> return "Alan" + i` // return 사용했느네 중괄호가 없다.
5. `(String s) -> { "Iron Man" }` // 중괄호를 사용했는데 return이 없다.
// String s, Integer i 등 매개변수 타입 생략 가능
---
정답: 4, 5