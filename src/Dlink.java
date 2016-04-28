/**
 * Created by Yevhenii on 27.04.2016.
 */
public class Dlink implements RouterType {
    @Override
    public void accept(RouterTypeVisitor routerTypeVisitor) {
        routerTypeVisitor.visit(this);
    }
}
