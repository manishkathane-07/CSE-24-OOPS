/*
15. Bank Application
Create a class BankApplication. Define method that throws
exception using throws. Call method in main and handle
exception.
Output: 'Transaction processed' or 'Exception handled in main'
*/

class BankApplication {

    static void process() throws Exception {
        throw new Exception("Error");
    }

    public static void main(String[] args) {
        try {
            process();
            System.out.println("Transaction processed");
        } catch(Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}