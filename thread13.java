class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) { 
            System.out.println("OddThread: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PrimeThread implements Runnable {

    
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.println("PrimeThread: " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}


public class thread13{
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        PrimeThread primeRunnable = new PrimeThread();
        Thread primeThread = new Thread(primeRunnable);

        
        oddThread.start();
        primeThread.start();
    }
}
