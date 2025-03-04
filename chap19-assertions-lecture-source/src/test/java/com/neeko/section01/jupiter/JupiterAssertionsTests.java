package com.neeko.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

/*JUnit5에서 제공하는 Assertions에 잇는 메소드ㅔㅇ 대해 이해하고 활용할 수 있다.*/
class JupiterAssertionsTests {

    /* 1. assertEquals : 예상 값과 실제 값의 일치 여부를 동일성으로 판단한다. */
    @Test
    void testAssertEquals() {
        /* given */
        int firstNum = 10;
        int secondNum = 20;
        int expectedNum = 30;
        /* when */
        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum, secondNum);
        /* then */
        //Assertions.assertEquals(expectedNum,result);
        // Assertions.assertNotEquals(expectedNum,result,1);
        Assertions.assertEquals(expectedNum, result, 1);
    }
        /* 2. assertNull : null 여부 테스트 */
        @Test
        @DisplayName(("null 여부 테스트"))
        void testAssertNull(){
            String str = null;
            Assertions.assertNull(str);

            String str2 = "hello world";
            Assertions.assertNotNull(str2);
        }
        /* 3. assertAll: 한 번에 여러 검증을 수행할 수 있는 메소드 */
    @Test
    @DisplayName("동시에 여러 값에 대한 검증 테스트 ")
    void testAssertAll(){
        String firstName = "길동";
        String lastName = "홍";
        Person person = new Person(firstName, lastName);

        Assertions.assertAll("그룹화 된 테스트의 이름(테스트 실패시 보여지는 부분)",
                () -> Assertions.assertEquals(firstName,person.getFirstName()),
                () -> Assertions.assertEquals(lastName,person.getLastName())
                );
    }
    /* 4. assertThrows/assertInstanceOf */
    @Test
    @DisplayName("exception 발생 테스트 ")
    void testAssertThrows(){
        int firstNum = 10;
        int secondNum = 0;

        NumberValidation validator = new NumberValidation();
        Exception exception =Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> validator.checkDividableNumbers(firstNum,secondNum)
        );
        Assertions.assertAll(
                ()->Assertions.assertInstanceOf(
                        IllegalArgumentException.class,
                        exception
                ),
                ()->Assertions.assertEquals(
                        "0으로 나눌 수 없다.",
                        exception.getMessage()
                )
        );

    }
}
