/*
8. Create a class TextProcessingBuilder.
● Use StringBuilder to create a string.
● Append additional text.
● Display modified string.
● Write a comment comparing StringBuilder and
StringBuffer.
*/

class TextProcessingBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hi");

        sb.append(" Manish");

        System.out.println("Modified String: " + sb);
    }
}