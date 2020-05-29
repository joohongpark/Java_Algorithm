package useful;

import java.util.Scanner;

public class getInteger {
    static int getNumber(Scanner scan) {
        boolean isNumber = false;
        String str = "";
        while(!isNumber) {
            str = scan.next();
            isNumber = isNumber(str);
            if(!isNumber) {
                System.out.println("[error] 올바른 숫자를 입력해 주세요!");
            }
        }
        return Integer.parseInt(str);
    }
    static boolean isNumber(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if( ('0' > str.charAt(i)) || ('9') < str.charAt(i) ) {
                result = false;
                break;
            }
        }
        return result;
    }
}
