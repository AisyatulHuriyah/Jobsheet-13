public class Greetings_04 {

    public static void sayThankyou() {
        System.out.println("Thank you for being the best teacher in the world.\n" +
                           "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    
    // Code Baru: Function with parameter (String greeting) (Penambahan Fungsi sayAdditionalGreetings)
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }

    public static void main(String[] args) {
        sayThankyou();
        // Code Baru: Calling sayAdditionalGreetings()
        String expression = "Thankyou...wish you all the best!!";
        sayAdditionalGreetings(expression);
    }
}