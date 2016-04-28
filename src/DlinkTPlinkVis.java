/**
 * Created by Yevhenii on 28.04.2016.
 */
public class DlinkTPlinkVis implements RouterTypeVisitor {
    @Override
    public void visit(Dlink dlink) {
        System.out.println("It's distribution by the help of Dlink router.");
    }

    @Override
    public void visit(LinkSysRouter linkSysRouter) {
        return;
    }

    @Override
    public void visit(TPLink tpLink) {
        System.out.println("It's distribution by the help of TPLink router.");
    }

    @Override
    public void visit(Router rooter) {
        return;
    }
}
