package OCP.Chapter_14.locks.shop;

/**
 * Created by LitVV on 16.08.2016.
 */
public class Producer implements Runnable {

    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            shop.putProduct();
        }
    }
}
