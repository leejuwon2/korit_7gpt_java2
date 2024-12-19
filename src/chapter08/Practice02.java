package chapter08;

// === 인터페이스 === //
// Fruit 과일 인터페이스 정의
// - color: 추상 메서드
// - describe: 디폴트 메서드
// - printType: 정적 메서드

interface Fruit {
    // 인터페이스의 추상 메서드
    // : public abstract이 생략 되어 있음 (cf. 추상 클래스의 추상 메서드와 다름!)
    String color(); // 추상 메서드

    // 디폴트 메서드 : 재정의(오버라이딩) 가능
    default void describe() {
        System.out.println("과일의 색상은" + color() +"이며, 모양은 동그랗습니다.");
    }

    // 정적 메서드 : 재정의(오버라이딩) 불가능
    static void printType() {
        System.out.println("과일(Fruit)의 타입입니다.");
    }
}

class Apple implements Fruit {
    public String color() {
        return "red";
    }
}

class Orange implements Fruit {
    public String color() {
        return "orange";
    }
}

class Banana implements Fruit {
    public String color() {
        return "yellow";
    }

    @Override
    public void describe() {
        System.out.println("과일의 색상은" + color() +"이며, 모양은 깁니다.");
    }
}
//=== 또 다른 인터페이스 === //
interface TropicalFruit extends Fruit {
    // extends (상속 - 확장하다)
    // : 클래스 간에, 인터페이스 간에 가능

    // cf) implements (구현 - 구현하다)
    // : 인터페이스를 클래스로 구현
    default void tropicalFeature() {
        // 열대 과일의 특징
        System.out.println("열대 과일은 후숙하면 더 맛있습니다.");
    }
}





class Mango implements TropicalFruit {
    public String color () {
        return "golden";
    }

    @Override
    public void describe() {
        System.out.println("과일의 색상은" + color() + "이며, 모양은 타원형입니다.");
    }
}



public class Practice02 {
    public static void main(String[] args) {
        // 다형성 적용
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        Fruit banana = new Banana();
        TropicalFruit mango = new Mango();

        //== 다형성 예제 == //
        // mango가 Fruit로 형 변환 (업캐스팅)
        Fruit[] fruits = {apple, orange, banana, mango};
        // 자동으로 망고는 부모객체로 소속됨 네개 다 Fruit 소속

        for (Fruit fruit : fruits) {
            fruit.describe();

            if (fruit instanceof TropicalFruit) { // 네개중에 TropicalFruit 에 들어 갈 수 있는 애를
                TropicalFruit tropicalFruit = (TropicalFruit) fruit; // 다운 캐스팅 시키고 TropicalFruit에 담음
                tropicalFruit.tropicalFeature();  //열대 과일은 후숙하면 더 맛있습니다.
            }
        }

        //cf) instanceof 연산자
// : "A 객체가 B 클래스(종류)와 같은지 확인해줘" 도구
// >> 확인의 결과값을 boolean 으로 반환 같은면 트루
        class 동물 {}
        class 고양이 extends 동물 {}
        class 강아지 extends 동물 {}

        동물 애니멀 = new 동물();
        동물 나비 = new 고양이();
        동물 멍멍이 = new 강아지 ();

        if (애니멀 instanceof  고양이) {
            System.out.println("실행 되지 않음");
        }

        if (나비 instanceof 고양이 && 나비 instanceof 동물) {
            // 실행 O
        }
        if (멍멍이 instanceof 고양이) {
            // 실행 X
        }

        if (mango instanceof Fruit) {
            Fruit mangoAsFruit = (Fruit) mango;
            mangoAsFruit.describe(); //과일의 색상은golden이며, 모양은 타원형입니다.
        }

        if (banana instanceof TropicalFruit) {
            TropicalFruit bananaAsTropical = (TropicalFruit) banana;
            bananaAsTropical.tropicalFeature();
        }else {
            System.out.println("바나나는 열대과일이 아닙니다."); //바나나는 열대과일이 아닙니다.
        }

        Fruit.printType(); //과일(Fruit)의 타입입니다.
    }
}
