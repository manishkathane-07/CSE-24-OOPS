/*
14. File Processing System
Create a class FileProcessingSystem. Simulate file reading using
try-catch. Use finally block to display cleanup message.
Output: 'Reading file...' and 'Closing file resources'
*/

class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file...");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}