/**
 * Created by Yevhenii on 27.04.2016.
 */
public class TPLink implements RouterType {
    @Override
    public void accept(RouterTypeVisitor routerTypeVositor) {
        routerTypeVositor.visit(this);
    }
}
