/**
 * 
 */
package ninja.bombardelli.ethereum.rpc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jcbombardelli
 * @since 17/02/2018
 * @version 1.0
 */
public abstract class JsonRPC {

	public static final String VERSION = "2.0";
	public static final int ID_DEFAULT = 1;
	
	@JsonProperty("jsonrpc")
	private String versionJsonRPC;
	
	private int id;
	
	public String getVersion() {
		return versionJsonRPC;
	}

	public int getId() {
		return id;
	}
	
	public String getVersionJsonRPC() {
		return versionJsonRPC;
	}

	public void setVersionJsonRPC(String versionJsonRPC) {
		this.versionJsonRPC = versionJsonRPC;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 */
	public JsonRPC() {
		versionJsonRPC = VERSION;
		id = ID_DEFAULT;
		
	}
	
	public JsonRPC(String versionJsonRPC, int id) {
		this.versionJsonRPC = versionJsonRPC;
		this.id = id;
	}

}
