/**
 * Created by Yevhenii on 27.04.2016.
 */
public class LinkSysRouter implements RouterType {
    @Override
    public void accept(RouterTypeVisitor routerTypeVositor) {
        routerTypeVositor.visit(this);
    }
}
