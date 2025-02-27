package com.neeko.section2.set;

import java.util.LinkedList;

public class Application2 {
    public static void main(String[] args) {
        /* LinkedHashSet */
        LinkedList<String> lhset = new LinkedList<String>();
        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");
        lhset.add("java");

        /* Link를 통해 저장 순서를 유지하며, 중복 저장은 불가능한 특성 */
        /* HashSet이 가지는 기능을 모두 가지고 있으므로 동일한 메소드 활용 가능 */
        System.out.println("lhset : "+lhset);

    }
}
