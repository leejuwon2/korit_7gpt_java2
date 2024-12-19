package chapter10;

// === Set 인터페이스 === //
// 중복 X, 순서 X
// : 중복된 요소를 포함하지 않는 객체의 집합
// : 객체의 저장 순서를 저장하지 않음 (삽입 순서 유지 X)


//cf) List 인터페이스
// 중복 O, 순서 O, null 요소 포함 가능
// ["사과", null,"오렌지"] 1번 인덱스 비워두면 자동으로 1번 인덱스에 null 입력됨

// == Set 컬렉션 종류 (구현체) == //
// 1. HashSet
// : 가장 많이 사용되는 Set 구현체, 빠른 데이터 접근과 삽입을 지원
// - 정렬 또는 순서 보장을 하지 않음

// 2. LinkedHashSet
// : HashSet 에서 순서를 추가한 형태
// - 중복은 안되지만 순서는 있다.

// 3. TreeSet
// : 데이터가 자동 정렬, 중복 제거와 정렬된 순서 유지가 필요할 때 사용
// - 중복 X, 순서 O
import java.util.Set;
import java.util.HashSet;

public class D_Set {
    public static void main(String[] args) {
        // == Set 컬렉션의 주요 메서드 == //
        // : add(), remove(), contains(), size(), isEmpty()

        // Set 컬렉션 선언 방법
        // Set<E> set명 = new Set컬렉션종류<>();
        Set<String> exampleSet = new HashSet<>();

        exampleSet.add("자바");
        exampleSet.add("파이선");
        exampleSet.add("C++");
        exampleSet.add("자바스크립트");

        System.out.println(exampleSet); //[C++, 자바스크립트, 파이선, 자바]

        exampleSet.remove("자바"); // remove(제거하고자 하는 데이터)
        System.out.println(exampleSet); //[C++, 자바스크립트, 파이선]

        System.out.println(exampleSet.size()); //3

        // 중복된 데이터는 추가 할 수 없음
        String py ="파이선";
        exampleSet.add("파이선");
        System.out.println(exampleSet); //[C++, 자바스크립트, 파이선]

        System.out.println(exampleSet.contains("자바스크립트")); //true
        System.out.println(exampleSet.contains("자바")); // false

        System.out.println(exampleSet.isEmpty()); //false
        exampleSet.clear(); //false
        System.out.println(exampleSet.isEmpty()); //true
    }
}