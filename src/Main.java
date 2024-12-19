//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // === 인터페이스 === //
// : 객체가 어떤 방식으로 동작해야 하는지 정의하는 추상 타입
// - 추상 메서드와 상수만 포함된 특수한 클래스
// - 모든 메서드는 추상 메서드로 구성
// - 상수는 public static final  특성을 가짐
// >> 실제 구현은 인터페이스를 구현한 클래스에서 담당

// == 인터페이스의 특징 == //
// 1) 메서드
//      : 모든 메서드는 기본적으로 public abstract로 선언
//      >> 생략 가능
// 2) 변수(필드)
//      : 모든 변수는 기본적으로 public static final 상수
//      >> 생략 가능

//+) 다중 구현을 지원
//      : 한 클래스에서 여러 인터페이스를 동시에 구현 가능
//+)>> 객체의 행동을 정의하는 역할

// == 추상 클래스 VS 인터페이스 == //
// 1) 추상 클래스
// - 공통적인 기능을 제공하는 '부분적 구현'
// - 구성요소: 추상 메서드, 구체 메서드, 필드, 생성자
// - 단일 상속만 가능(extends)
// >> 기본 구현을 제공하고 확장 가능

// 2) 인터페이스
// - 클래스의 행동을 정의
// - 구성요소: 추상 메서드, 상수, 디폴트 메서드, 정적 메서드
// - 다중 구현 가능 (implements)
// >> 객체가 해야 할 동작(행위)을 정의

// cf) 상속 (extends, 확장하다)

// == 인터페이스 구현 방법 == //
// : interface 키워드를 사용

// interface 인터페이스명 {}
    }
}