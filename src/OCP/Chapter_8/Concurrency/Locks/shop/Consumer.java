package OCP.Chapter_8.Concurrency.Locks.shop;

/**
 * Created by LitVV on 16.08.2016.
 */
public class Consumer implements Runnable {

    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            shop.getProduct();
        }
    }
}
