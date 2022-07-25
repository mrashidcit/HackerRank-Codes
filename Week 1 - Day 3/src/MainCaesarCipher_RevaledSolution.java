public class MainCaesarCipher_RevaledSolution {

    public static void main(String[] args) {


//        String s = "TWhy";
//        String s = "Hello_World!";
//        String s = "middle-Outz";
        String s = "www.abc.xy"; int k = 87;
        int n = s.length();

        StringBuilder strBuilder = new StringBuilder();
//        System.out.println("Input : " + s);

        k %= 26;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += k;
                if (c > 'z') {
                    c = 96 + (c % 122);
                }

            } else if (c >= 'A' && c <= 'Z') {
                c += k;
                if (c > 'Z') {
                    c = 64 + (c % 90);
                }

            }
            strBuilder.append(Character.toChars(c));
        }


        System.out.println("Output : " + strBuilder.toString());



    }

}
