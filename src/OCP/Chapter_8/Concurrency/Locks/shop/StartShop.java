package OCP.Chapter_8.Concurrency.Locks.shop;

/**
 * Created by LitVV on 16.08.2016.
 */
public class StartShop {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread tProducer = new Thread(new Producer(shop));
        Thread tConsumer = new Thread(new Consumer(shop));

        tProducer.start();
        tConsumer.start();
    }
}
