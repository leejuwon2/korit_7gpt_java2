package chapter07.practiceApp;


/*
App클래스
    - Entitiy의 객체(부모1, 자식2) 를 활용하는 시스템 구현

    EX) (동물, 상품, 과일, 학생) 관리 시스템,
 */

import chapter07.animalApp.AnimalService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        As service = new As();

        ArrayList<Animal> animal = new ArrayList<>();

        animal.add(new Cat());

    }
}
