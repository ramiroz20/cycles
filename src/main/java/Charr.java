

public class Charr {
    static void decompress(char[] str) {
        for (int i = 0; i < str.length; i++) {

            if (str[i] >= '1' && str[i] <= '9') {


                int count = str[i] - '0'; //5 // это говорит сколько раз строчку повторить
                // ,5,(,b,)
                i += 2;
                char sym = str[i]; // sym - символ
                for (int j = 0; j < count; j++) {
                    System.out.print(sym);
                }
                i++;
            } else {
                System.out.print(str[i]);
            }

        }
    }

    public static void main(String[] args) {
        decompress("3(s)3(b)cd".toCharArray());
    }
}

