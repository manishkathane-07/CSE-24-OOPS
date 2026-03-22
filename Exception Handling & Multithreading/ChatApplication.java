/*
23. Chat Application
Create a class ChatApplication. Create threads for sending and
receiving messages. Demonstrate thread lifecycle.
Output: Sending and receiving messages.
*/

class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            System.out.println("Sending message...");
        }
    }

    static class Receiver extends Thread {
        public void run() {
            System.out.println("Receiving message...");
        }
    }

    public static void main(String[] args) {
        Sender s = new Sender();
        Receiver r = new Receiver();

        s.start();
        r.start();
    }
}