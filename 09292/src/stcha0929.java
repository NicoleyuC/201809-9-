//count 字元 & STR 轉換CHAR
public class stcha0929 {
    public static void main(String[] args) {
        String str = "ASIAUNIVERSITY@CSIEASIA";
        int count = 0;
        for (int i = 0; i <str.length()-1; i++) {
//            if (str.charAt(i) == 'I') {
            if (str.substring(i , i+2).equals("SI")){
                count++;
            }
        }
        System.out.println("Count = " + count );
    }
}
