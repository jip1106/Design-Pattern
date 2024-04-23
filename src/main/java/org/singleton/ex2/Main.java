package org.singleton.ex2;

//Q
//인스턴스 수가 3개로 제한되는 클래스 Triple을 만드세요.
//인스턴스에는 "ALPHA", "BETA", "GAMMA" 라는 이름이 붙어있고,
// getInstance(String name)으로 name이라는 이름을 가진 인스턴스를 얻을 수 있다고 가정합니다.
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");

        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");

        if (a1 == a2) {
            System.out.println("a1 == a2 (" + a1 + ")");
        } else {
            System.out.println("a1 != a2");
        }
        if (b1 == b2) {
            System.out.println("b1 == b2 (" + b1 + ")");
        } else {
            System.out.println("b1 != b2");
        }
        if (c1 == c2) {
            System.out.println("c1 == c2 (" + c1 + ")");
        } else {
            System.out.println("c1 != c2");
        }
        System.out.println("End.");
    }
}
