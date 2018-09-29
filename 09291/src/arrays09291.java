public class arrays09291 {
    public static void main(String[] args) {
        String str = "IWANTTOSLEEP";
        char what [ ] = str.toCharArray();
        for (int i = 0; i < what.length ; i++){
            System.out.print( what[i] + "\t");
            what[i] = (char)((int)what[i]+5);
//            System.out.print(what [i] + "\t");
        }
        String cipherText = new String(what);
        System.out.print("\n Cipher Text = " + cipherText);

    }
}
