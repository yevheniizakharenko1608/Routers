/**
 * Created by Yevhenii on 27.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        RouterType router = new Router();
        router.accept(new RouterTypeDisplayVisitor());
        router.accept(new DlinkTPlinkVis());
    }
}
