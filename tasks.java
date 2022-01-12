public class tasks {
    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hey aaryan");
        }
    }
    public static void task2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("meow meow");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(){
            @Override
            public void run() {
                task1();
            }
        };
        Thread th2 = new Thread(){
            @Override
            public void run() {
                task2();
            }
        };

        // System.out.println("mew");
        Thread.sleep(3000);

        th1.start();
        th2.start();

        System.out.println("hey");

    }
}
