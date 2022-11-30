public class App {
    public static void main(String[] args) throws Exception {
        String str = null;
        try {
            System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("NullPointerException発生");
            System.out.println(e.getMessage());
        }
    }
}
