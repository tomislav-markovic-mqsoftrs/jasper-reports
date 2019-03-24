package jasper.jasperreports.workflow;

public abstract class UsualWorkflow {

    protected abstract void input();
    protected abstract void edit();
    protected abstract void output();

    public void runWorkflow(){
        input();
        edit();
        output();
    }



}
