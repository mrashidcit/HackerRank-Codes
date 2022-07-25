public class MainCaesarCipher {

    public static void main(String[] args) {

//        String s = "There";
//        String s = "TWhy";
//        String s = "Hello_World!";
//        String s = "middle-Outz";
        String s = "www.abc.xy";
        int k = 87;
        System.out.println("Input : " + s);

        String outputStr = "";
        StringBuilder strBuilder = new StringBuilder();
        int smallAInt = 'a' + 0; int capitalAInt = 'A' + 0;
        int smallZInt = 'z' + 0; int capitalZInt = 'Z' + 0;
//        System.out.println(smallZInt + " , " + capitalZInt);
        int itemInt = 0; int tempInt = 0;
        for (int i = 0; i < s.length(); i++) {

            itemInt = s.charAt(i);
            if (itemInt >= capitalAInt && itemInt <= capitalZInt) { // 65 - 90
                if (itemInt + k <= capitalZInt)
                    tempInt = itemInt + k;
                else
                    tempInt = capitalAInt + (k - (capitalZInt - itemInt) - 1);
            } else if (itemInt >= smallAInt && itemInt <= smallZInt) {
                if (itemInt + k <= smallZInt)
                    tempInt = itemInt + k;
                else
                    tempInt = smallAInt + (k - (smallZInt - itemInt) - 1);
            } else {
                tempInt = itemInt;
            }



            strBuilder.append(Character.toChars(tempInt));
            System.out.println("itemInt , tempInt : " + itemInt + " , " + tempInt);
//            System.out.println(s.charAt(i) + " = " +  ((int) s.charAt(i) ) + "" );
        }


        System.out.println("Output : " + strBuilder.toString());

        /// ***Testing
//        int item = incrementInt(smallAInt, smallZInt, 119, k);
//        System.out.println("Item : " + item);

    }

    public static int incrementInt(int startInt, int endInt, int itemInt, int k) {
        int tempInt = itemInt + k;
            while (tempInt > endInt) {
                tempInt -= endInt;
                tempInt--;
            }
        return tempInt;
    }
}
