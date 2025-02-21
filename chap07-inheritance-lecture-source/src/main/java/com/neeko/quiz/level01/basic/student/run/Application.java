package com.neeko.quiz.level01.basic.student.run;

import com.neeko.quiz.level01.basic.student.model.dto.StudentDTO;
import com.neeko.quiz.level02.normal.book.model.dto.BookDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        int getGrade=0;
//        int getClassroom=0;
//        String getName="";
//        int getKor=0;
//        int getEng=0;
//        int getMath=0;
        StudentDTO[] students = new StudentDTO[10];
        Scanner scanner = new Scanner(System.in);
        int studentcount = 0;
        StudentDTO studentDTO = new StudentDTO();

        while (studentcount < 10) {

            students[studentcount] = new StudentDTO();
            System.out.print("학년 : ");
            int getGrade = scanner.nextInt();
            System.out.print("반 : ");
            int getClassroom = scanner.nextInt();

            System.out.print("이름 : ");
            String getName = scanner.next();

            System.out.print("국어 점수 : ");
            int getKor = scanner.nextInt();

            System.out.print("영어 점수 : ");
            int getEng = scanner.nextInt();

            System.out.print("수학 점수 : ");
            int getMath = scanner.nextInt();

            students[studentcount] = new StudentDTO(getGrade, getClassroom, getName, getKor, getEng, getMath);
            System.out.print("계속 추가할 겁니까? (y/n): ");
            char answer = scanner.next().charAt(0);

            if (answer == 'y') {
                studentcount++;
                continue;
            } else if (answer == 'n') {

                for (int i = 0; i <= studentcount; i++) {
                    System.out.println(students[i].getInformation());
                }
                break;
            }


        }

    }
}

