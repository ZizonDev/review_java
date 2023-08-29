package Chapter06_객체_Ex02;

public class iPadMain {
    public static void main(String[] args) {
        while (true) {
            iPad iPad10 = new iPad("iPad Series 10");
            if(!iPad10.orderSystem()) break;
            iPad10.setSize();
            iPad10.setColor();
            iPad10.setMemory();
            iPad10.setNetwork();
            iPad10.setCalving();
            iPad10.setPencil();
            iPad10.setKeyboard();
            iPad10.setAppleCare();
            iPad10.setSerialNumber();
            iPad10.setPrice();
            iPad10.printOrder();
        }
    }
}
