package javacamp.thirdLessonWork.homework2.staticDemo;

/**
 *
 * @author seyma.deniz
 */
public class Main {
    public static void main(String[] args) {
        ProductManager manager=new ProductManager();
        Product  product=new Product();
        product.price=10;
        product.name="Mouse";
        manager.add(product);
    }
}
