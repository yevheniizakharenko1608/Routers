/**
 * Created by Yevhenii on 27.04.2016.
 */
public class RouterTypeDisplayVisitor implements RouterTypeVisitor {
    @Override
    public void visit(Dlink dlink) {
        System.out.println("It's distribution by the help of Dlink router.");
    }

    @Override
    public void visit(LinkSysRouter linkSysRouter) {
        System.out.println("It's distribution by the help of LinkSysRouter router.");
    }

    @Override
    public void visit(TPLink tpLink) {
        System.out.println("It's distribution by the help of TPLink router.");
    }

    @Override
    public void visit(Router router) {
        System.out.println("It's distribution by the help of router.");
    }
}
