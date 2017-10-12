/** Pachakge to keep track whether or not a server has met its SLA regarding backups **/
package backups;

/** Class must be serializable **/
public class ServerBean implements java.io.Serializable {

    /** Properties **/
    private boolean metSLA = false;

    private List list;

    /** Properties must be writable */
    private String name = null;

    /** Must have default constructor with no arguments */
    public ServerBean() {
    }

	/** Getter for complete list **/
    public List getList() {
        return list;
    }
	
    public void setList(final List list) {
        this.list = list;
    }

    /** Getter for Server Name **/
    public String getName() {
        return name;
    }

    /** Setter for Server Name **/
    public void setName(final String value) {
        this.name = value;
    }

    /** Getter for Met SLA, which is a boolean value **/
    public boolean isMetSLA() {
        return metSLA;
    }

    /** Setter for Met SLA, which is a boolean value **/
    public void setMetSLA(final boolean value) {
        metSLA = value;
    }
}