/**
 * Created by Yevhenii on 27.04.2016.
 */
public class Router implements RouterType {
    RouterType[] types;

    public Router(){
        types = new RouterType[] {new Dlink(), new LinkSysRouter(), new TPLink()};
    }

    @Override
    public void accept(RouterTypeVisitor routerTypeVisitor) {
        for (int i = 0; i <types.length; i++) {
            types[i].accept(routerTypeVisitor);
        }
        routerTypeVisitor.visit(this);
    }

}
