package com.neeko.section03.reference;

public class Member {
    private String memberID;

    public Member(String memberID) {
        this.memberID = memberID;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberID='" + memberID + '\'' +
                '}';
    }
}
