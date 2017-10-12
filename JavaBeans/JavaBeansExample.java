/** Pachakge to keep track whether or not a server has met its SLA regarding backups **/
package backups;

import java.io.Serializable;
/** Class must be serializable **/
public class ServerBean implements java.io.Serializable {

    /** Properties **/
    private boolean metSLA = false;
    private String serverName = null;
	private String ipAddress = null;
	
    public ServerBean() {
    }

	/**
	 * @param serverName
	 * @param ipAddress
	**/
	
	public ServerBean(String serverName, String IpAddress, boolean metSLA) {
		this.serverName = serverName;
		this.IpAddress = IpAddress;
		this.metSLA = metSLA;
	}
	
	/** Getter for Server Name **/
    public String getServerName() {
        return serverName;
    }

    /** Setter for Server Name **/
    public void setServerName(final String value) {
        this.serverName = value;
    }

	/** Getter for IP Address **/
    public String getIpAddress() {
        return ipAddress;
    }

    /** Setter for IP Address **/
    public void setIpAddress(final String value) {
        this.ipAddress = value;
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