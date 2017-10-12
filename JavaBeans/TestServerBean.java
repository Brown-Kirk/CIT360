import backups.ServerBean;

/** Class TestServerBean **/
public class TestServerBean {
    /** main TestServerBean class **/
    public static void main(final String[] arguments) {
        final ServerBean server = new ServerBean();

        backups.setName("Exchange01");
        backups.setMetSLA(true);
        backups.setList(new ArrayList());

        // Output: "Exchange01 [within SLA]"
        System.out.print(backups.getName());
        System.out.println(backups.isMetSLA() ? " has failed to meet SLA." : " is within SLA.");
    }
}