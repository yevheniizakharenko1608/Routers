/**
 * Created by Yevhenii on 27.04.2016.
 */
public interface RouterTypeVisitor {
    void visit(Dlink dlink);
    void visit(LinkSysRouter linkSysRouter);
    void visit(TPLink tpLink);
    void visit(Router rooter);
}
