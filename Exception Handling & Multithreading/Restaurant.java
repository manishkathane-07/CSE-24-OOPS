/*
21. Producer Consumer System
Create a class Restaurant. Chef prepares food and waiter servesit using wait() and notify().
Output: 'Chef prepared food' and 'Waiter served food'
*/

class Restaurant {
    boolean available = false;

    synchronized void prepareFood() {
        try {
            while (available)
                wait();

            System.out.println("Chef prepared food");
            available = true;

            notify();
        } catch (Exception e) {}
    }

    synchronized void serveFood() {
        try {
            while (!available)
                wait();

            System.out.println("Waiter served food");
            available = false;

            notify();
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            r.prepareFood();
        });

        Thread waiter = new Thread(() -> {
            r.serveFood();
        });

        chef.start();
        waiter.start();
    }
}