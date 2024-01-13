// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int finalValueAfterOperations(String[] operations) {

        int Xval = 0;

        for (String operation : operations) {
            if (operation == "++X" || operation == "X++") {
                Xval = Xval + 1;
            }

            if (operation == "--X" || operation == "X--") {
                Xval = Xval - 1;
            }
        }

        return Xval;

    }


    public static void main(String[] args) {
        int res = 0;
        String[] oper = new String[]{"--X","X++","X++"};
        res = finalValueAfterOperations(oper);
        System.out.println(res);

        }
}
