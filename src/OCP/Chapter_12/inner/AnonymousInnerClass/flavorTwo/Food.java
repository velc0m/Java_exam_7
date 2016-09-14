package OCP.Chapter_12.inner.AnonymousInnerClass.flavorTwo;

/**
 * Created by LitVV on 13.09.2016.
 */
public class Food {

    Cookable c = new Cookable() {
        @Override
        public void cook() {
            System.out.println("Anonymous cookable implements");
        }
    };

}
