public class MethodReferrence {
    public static void main(String [] args){

        Thread thread1 = new Thread(MethodReferrence::th1Even);
        Thread thread2 = new Thread(MethodReferrence::th2Odd);

        thread1.start();
        thread2.start();
    }
    public static void th1Even(){
        long start = System.currentTimeMillis();
        for(int i=0; i<10; i+=2) {
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end =System.currentTimeMillis();
        System.out.printf("EXECUTION TIME IS = %d ms\n", (end - start));
    }

    public static void th2Odd(){
        for(int i=1; i<10; i+=2){
            System.out.println(Thread.currentThread().getName()+": "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}