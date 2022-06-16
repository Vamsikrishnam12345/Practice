public class program_polymorphism {

    void run() {
        System.out.println("running");
    }
    class fortuner extends Bike{
        void run(){System.out.println("running safely with 120km");}

        public static void main(String args[]){
            car b = new Splendor();
            b.run();
        }
    }

