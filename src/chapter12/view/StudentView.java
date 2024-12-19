package chapter12.view;

import chapter12.controller.StudentController;
import chapter12.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final StudentController controller;
    private final Scanner scanner;

    public StudentView() {
        this.controller = new StudentController();
        this.scanner = new Scanner(System.in);
    }
    public void showMenu() {
        int choice = 0;
        while (true) {
            System.out.println("=== 학생 관리 시스템 ===");
            System.out.println("1. 학생 추가 기능");
            System.out.println("2. 전체 학생 조회 기능");
            System.out.println("3. 특정 학생 조회 기능");
            System.out.println("4. 학생 수정 기능");
            System.out.println("5. 학생 삭제 기능");
            System.out.println("6. 프로그램 종료");
            System.out.println("=== 메뉴를 선택해주세요 ===");
            choice = scanner.nextInt();
            scanner.nextLine();

        switch(choice) {
            case 1:
                addStudentView();
                break;
            case 2:
                showAllStudentsView();
                break;
            case 3:
                findStudentView();
                break;
            case 4:
                updateStudentView();
                break;
            case 5:
                removeStudentView();
                break;
            case 6:
                System.out.println("===프로그램 종료===");
                return;
            }
        }
    }


    private void addStudentView() {
        System.out.println("Enter Student Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Student ID : ");
        String id = scanner.nextLine();

        controller.addStudent(name, age, id);
        System.out.println("학생정보가 정상적으로 추가되었습니다.");
    }

    private void findStudentView() {
        System.out.println("Enter Student ID to find: ");
        String id = scanner.nextLine();
        Student student = controller.findStudentById(id);
        if (student != null) {
            System.out.println(student.toString());
        }else {
            System.out.println("Student not found");
        }
    }

    private void showAllStudentsView() {
        List<Student> students = controller.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void updateStudentView() {
        System.out.println("Enter Student Id to update: ");
        String id = scanner.nextLine();
        System.out.println("Enter new Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Age: ");
        int newAge = scanner.nextInt();

        if(controller.updateStudent(id, newName, newAge)) {
            System.out.println("Student updated successfully");
        }else {
            System.out.println("Student not found");
        }

    }
    private void removeStudentView() {
        System.out.println("Enter Student Id to remove: ");
        String id = scanner.nextLine();

        if (controller.removeStudent(id)) {
            System.out.println("Student removed successfully");
        }else {
            System.out.println("Student not found");
        }
    }
}
