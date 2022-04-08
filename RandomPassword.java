public class RandomPassword {

    public static void main (String[] args) throws Exception{
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        int string_length = 8;
        String password = "";
        for (int i = 0; i < string_length; i++) {
            double rnum = Math.floor(Math.random() * chars.length());
            password += chars.substring((int) rnum, (int) rnum + 1);
        }
        System.out.println("password =" + password);
    }
}
