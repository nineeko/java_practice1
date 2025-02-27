package com.neeko.section01.list.run;

import com.neeko.section01.list.comparator.AscendingPrice;
import com.neeko.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 정의 자료형으로 ArrayList 생성하고 정렬하기 */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        for(BookDTO bookDTO : bookList){
            System.out.println(bookDTO);
        }
        /* implements Comparable 을 통해 compareTo 메소드(정렬 기준 반환)가 재정의 되어야만
        * 사용 가능한데 현재 정의되어 있지 않다.*/
//        Collections.sort(bookList);
        /* 도서 제목 오름차순 기준으로 구현한 뒤 확인 */
      Collections.sort(bookList);
      System.out.println("제목 오름차순: "+bookList);
        /* Comparator 인터페이스를 구현한 정렬 기준을 사용한다.*/
        Collections.sort(bookList,new AscendingPrice());
        Collections.sort(bookList, new AscendingPrice());
        System.out.println("가격 오름차순 : "+bookList);

        /* 정렬 기준을 계속해서 사용하는 경우 별도의 클래스를 선언해도 되지만
        * 한 번만 사용할 경우 더 간편하게 익명 클래스(Annoymous Class)를 활용할 수도 있다.*/

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getPrice() - o1.getPrice();

            }
        });
        System.out.println("가격 내림차순 : "+bookList);

    }
}
