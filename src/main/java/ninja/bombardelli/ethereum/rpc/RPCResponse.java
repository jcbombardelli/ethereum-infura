package ninja.bombardelli.ethereum.rpc;

/**
 * @author jcbombardelli
 * @since 17/02/2018
 * @version 1.0
 */
public class RPCResponse extends JsonRPC{

	
	private String result;
	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public RPCResponse() {
		super();
	}

}
