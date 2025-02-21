package com.neeko.quiz.level01.basic.student.model.dto;
/* private -
 * protected #
 * default ~
 * public +
 * 첫번째 칸 필드
 * 두번째 칸 생성자
 * 세번째 칸 메소드
 */
public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {}
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }



    public String getInformation() {
        return "학년="+grade+", 반= "+classroom+", 이름= "+name+", 국어= "+kor+", 영어= "+eng+", 수학= "+math + ", 평균 "+(kor+eng+math)/3;
    }
}
