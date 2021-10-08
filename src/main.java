import java.util.Locale;

public class  main {
    public static void main(String[] args) {
        boolean isBorring = false;
        System.out.println(" Hi everyone !  Bla bla bl bla bla.....bla bla bla");

        isBorring = true;

        if(isBorring){
            System.out.println("Как понять, что вы одиноки? Дождитесь августа. Если вам никто не предложил кабачок - вы одиноки.");
        }
//
//            StringBuilder temp = new StringBuilder("home");
//             StringBuilder temp2 = new StringBuilder(temp);
//             temp2.reverse();
//            System.out.println(temp.toString().equals(temp2.toString()) );

        String fullName = "national aeronautics space administration 1";

       char[] arr = fullName.toCharArray();
        int length = 1;
        for(char temp : arr) {
            if(temp == ' ') {
                length++;
            }
        }
        char[] abbr = new char[length];
        abbr[0] = arr[0];
        length = 1;
        for(int i = 1; i < arr.length-1 ; i++) {
            if(arr[i] == ' ') {
                abbr[length] = arr[++i];
                length++;
            }
        }
        String result = String.valueOf(abbr);

        System.out.println(result.toUpperCase());

//        public static char[] removeLetter (String "Remove Letters") {
              String  exem = "Remove Letters" ;
//            if (exem == null) {
//                char[] arr12 = new char[0];
//            }
//            char[] arr12 = exem.toLowerCase().toCharArray();char[] arr12 = new char[exem.length()];
//        if (exem.equals(null)) {
//          System.out.println(arr12);
//        }
//        arr = exem.toLowerCase().toCharArray();
//
//            for (int i = 0 ; i<arr12.length ; i++) {
//                if (arr12[i] == 'r') {
//                    arr12[i] = '!';
//                }
//            }

//            return arr;
//        }
        String str = "dfdfdf";
//        if(str.length() == 0) {
//            str = "no";
//        }
//        int middle = str.length() / 2;
//
//        if (str.length() % 2 == 0) {
//             str.substring(middle - 1, middle + 2);
//        }
//        else(str.length() % 2 == 1){
//            str.substring(middle, middle + 1);
//        }

//            char[] arrStr = str.toCharArray();
//            int len = 0;
//
//            if (arrStr.length % 2 == 0){
//                len = arrStr.length  / 2;
//            }
//            else {
//                len = arrStr.length  / 2 + 1;
//            }
//            char[] result = new char[len];
//            for (int i = 0,  j = 0; i < arrStr.length; i+=2, j++) {
//                result[j] = arrStr[i];
//            }
//
//            return String.valueOf(result);
        char first = Character.toUpperCase(str.charAt(0));
        char last = Character.toUpperCase(str.charAt(str.length() - 1));


        String str1 = String.valueOf(first) + str.substring(1);
        String str2 = str.substring(str.length() - 1) + String.valueOf(last);
        String[] arrStr = {str1, str2};
        System.out.println(arrStr);
//
    }
}
