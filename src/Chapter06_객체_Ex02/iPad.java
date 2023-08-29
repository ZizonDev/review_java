package Chapter06_객체_Ex02;

import java.util.Scanner;

public class iPad {
    protected final static String size = "10.9 inch";
    protected int color;         // blue, pink, yello, silver (무료)
    protected int memory;        // 64GB(679,000원), 256GB(919,000원)
    protected int network;       // Wi-Fi Only, Wi-Fi+Cellular (Wi-Fi는 무료, Cellular는 +240,000원)
    protected int isCalving;    // 각인 추가 금액은 무료.
    protected String message;          // 각인 추가 선택 시 새겨 넣을 문구.
    protected int isPencil;     // 애플 펜슬 추가 시 +149,000원
    protected int isKeyboard;   // 키보드 추가 시 +380,000원
    protected int isAppleCare;  // 애플 케어 추가 시 +109,000원
    protected String serialNumber;  // serialNumber = 모델명 + 화면 크기 숫자 + 네트워크 옵션 + 용량 숫자 + color
    protected int price;

    iPad (String name) {

    }
    boolean orderSystem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(20) + "Order iPad" + "=".repeat(20));
        System.out.print("[1]Order iPad [2]Exit : ");
        int order = sc.nextInt();
        if(order == 1) return true;
        else return false;
    }
    void setSize() {
        System.out.println("=".repeat(17) + "Choice Screen Size" + "=".repeat(17));
        System.out.println("iPad(Series 10) is 10.9 Inch Only.");
    }
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(19) + "Choice Color" + "=".repeat(19));
            System.out.print("[1]Blue [2]Pink [3]Yellow [4]Silver : ");
            color = sc.nextInt();
            if (color > 0 && color < 5) return;
            System.out.println("Invalid Color Choice.");
        }
    }
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(15) + "Choice Memory Storage" + "=".repeat(15));
            System.out.print("[1]64GB [2]256GB : ");
            memory = sc.nextInt();
            if (memory == 1 | memory == 2) return;
            System.out.println("Invalid Memory Storage.");
        }
    }
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=".repeat(15) + "Choice Network Option" + "=".repeat(15));
            System.out.print("[1]Wi-Fi Only [2]Wi-Fi + Cellular : ");
            network = sc.nextInt();
            if (network == 1 | network == 2) return;
            System.out.println("Invalid Network Option.");
        }
    }
    void setCalving() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(15) + "Choice Calving Option" + "=".repeat(15));
        System.out.print("[1]Add Calving Option [2]No Calving : ");
        isCalving = sc.nextInt();
        if(isCalving == 1) {
            System.out.print("Insert Your Own Calving Message : ");
            message = sc.nextLine();
            System.out.println();
        }
    }
    void setPencil() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=".repeat(15) + "Choice Apple Pencil" + "=".repeat(15));
            System.out.print("[1]Add Apple Pencil [2]No Apple Pencil : ");
            isPencil = sc.nextInt();
            if(isPencil == 1 | isPencil ==2) return;
            System.out.println("Invalid Option.");
        }
    }
    void setKeyboard() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=".repeat(11) + "Choice Apple Magic Keyboard" + "=".repeat(11));
            System.out.print("[1]Add Keyboard [2]No Keyboard : ");
            isKeyboard = sc.nextInt();
            if(isKeyboard == 1 | isKeyboard ==2) return;
            System.out.println("Invalid Option.");
        }
    }
    void setAppleCare() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("=".repeat(15) + "Choice Apple Care Option" + "=".repeat(15));
            System.out.print("[1]Add Apple Care [2]No Apple Care : ");
            isAppleCare = sc.nextInt();
            if(isAppleCare == 1 | isAppleCare ==2) return;
            System.out.println("Invalid Option.");
        }
    }
    void setSerialNumber() {
        String sizeStr = "10.9";
        String memoryStr = (memory == 1) ? "64" : "256";
        String networkStr = (network == 1) ? "Wi-Fi" : "Cellular";
        String[] colorStr = {"", "Blue", "Pink", "Yellow", "Silver"};
        serialNumber = "iPad" + sizeStr + memoryStr + networkStr + colorStr[color];
    }
    void setPrice() {
        int memoryPrice = (memory == 1) ? 679000 : 919000;
        int networkPrice = (network == 1) ? 0 : 240000;
        int pencilPrice = (isPencil == 1) ? 0 : 149000;
        int keyboardPrice = (isKeyboard == 1) ? 0 : 380000;
        int carePrice = (isAppleCare == 1) ? 0 : 109000;
        price = memoryPrice + networkPrice + pencilPrice + keyboardPrice + carePrice;
    }
    void printOrder() {
        final String[] colorType = {"", "Blue", "Pink", "Yellow", "Silver"};
        final String[] memoryType = {"", "64GB", "256GB"};
        final String[] networkType = {"", "Wi-Fi Only", "Wi-Fi + Cellular"};
        final String[] optionType = {"", "YES", "NO"};

        System.out.println(" ");
        System.out.println("=".repeat(18) + "About Your iPad" + "=".repeat(18));
        System.out.println("Screen Size : 10.9 Inch");
        System.out.println("Color : " + colorType[color]);
        System.out.println("Memory Storage : " + memoryType[memory]);
        System.out.println("Network Option : " + networkType[network]);
        System.out.println("Calving Message : " + message);
        System.out.println("Add Apple Pencil : " + optionType[isPencil]);
        System.out.println("Add Apple Magic Keyboard : " + optionType[isKeyboard]);
        System.out.println("Add Apple Care : " + optionType[isAppleCare]);
        System.out.println("Serial Number : " + serialNumber);
        System.out.println("Total Cost : KRW " + price);
    }
}
