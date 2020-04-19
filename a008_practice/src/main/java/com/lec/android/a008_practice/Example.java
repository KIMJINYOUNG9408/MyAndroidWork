package com.lec.android.a008_practice;

public class Example { // 동작실험용 클래스. 사용X



    public static final String [] NAME = {
            "아이언맨", "캡틴아메리카", "헐크", "블랙위도우", "팔콘", "울트론",
            "로키", "토르", "그루트", "스타로드", "비젼", "앤트맨", "윈터솔져",
            "로난", "토끼", "스파이더맨", "호크아이", "워머신", "가모라", "베놈",
            "디스트로이어"
    };

    public static final String [] AGE = {
            "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21"
              };

    public static final String [] ADDRESS = {
            "001@mail.com",
            "002@mail.com",
            "003@mail.com",
            "004@mail.com",
            "005@mail.com",
            "006@mail.com",
            "007@mail.com",
            "008@mail.com",
            "009@mail.com",
            "010@mail.com",
            "011@mail.com",
            "012@mail.com",
            "013@mail.com",
            "014@mail.com",
            "015@mail.com",
            "016@mail.com",
            "017@mail.com",
            "018@mail.com",
            "019@mail.com",
            "020@mail.com",
            "021@mail.com"
    };

    private static int idx = 0;

    public static int next(){
        idx = idx % NAME.length;
        return idx++; // idx값 리턴하고 1증가
    }

}
