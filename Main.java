public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("HELLO! This program started itself");
        System.out.println("==================================");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

        System.out.println("Auto execution successful 🎉");
    }
}