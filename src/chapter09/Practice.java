
package chapter09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import java.time.LocalDate;

public class Practice {
    public static void main(String[] args) {
        // == 생일까지 남은 일수 계산 프로그램 ==
        // : 사용자로부터 생년월일을 입력받고 다가오는 생일까지 남은 일수를 반환

        // 1. 사용자로부터 생년월일 입력 받기 (형식 YYYY-MM-DD)
        Scanner scanner = new Scanner(System.in);

        System.out.println("생년월일을 입력하세요(YYYY-MM-DD :)");
        String day = scanner.nextLine(); // 사용자에게 이런 형식으로 입력 받음

        // 2. 사용자 입력을 LocalDate로 변환 (formatter)
        // cf) Scanner를 통해 입력 받는 값의 타입: String(문자열 타입)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // parse : 분석하다
        // cf) parse(a,b): a를 b의 형태로 재구성

        try {
            // 입력받은 생일을 LocalDate로 변환
            LocalDate date = LocalDate.parse(day, formatter);
            // 3. 현재 날짜 구하기
            // 오늘 날짜
            LocalDate today = LocalDate.now();

            // 4. 올해의 생일 계산
            // .withYear()
            // 년도를 조작하는 메서드
            //LocalDate nextBirthday = Date.withYear(today.getYear());
            LocalDate thisYearsBirthday = LocalDate.of(today.getYear(), date.getMonth(), date.getDayOfMonth());

            // 5. 생일이 이미 지났다면 내년으로 설정
            if (thisYearsBirthday.isBefore(today) || thisYearsBirthday.isEqual(today)) {
                thisYearsBirthday = thisYearsBirthday.plusYears(1);
            }

            // 6. 남은 일수 계산
            long datsLeft = ChronoUnit.DAYS.between(today, thisYearsBirthday);
            System.out.println("다음 생일까지" + datsLeft + "일 남았습니다.");
            // 7. 결과 출력
        } catch (DateTimeParseException e) {
            System.out.println("잘못된 날짜 형식입니다.");
        }
        scanner.close();
    }
}