package ninja.bombardelli.ethereum.rpc;


/**
 * @author jcbombardelli
 * @since 17/02/2018
 * @version 1.0
 */
public class RPCRequest extends JsonRPC{

	public enum RPCMethod { web3_clientVersion, web3_sha3,	net_version, net_peerCount,	net_listening, eth_protocolVersion,
		eth_syncing, eth_coinbase, eth_mining, eth_hashrate, eth_gasPrice, eth_accounts, eth_blockNumber, eth_getBalance,
		eth_getStorageAt, eth_getTransactionCount, eth_getBlockTransactionCountByHash, eth_getBlockTransactionCountByNumber,
		eth_getUncleCountByBlockHash, eth_getUncleCountByBlockNumber, eth_getCode, eth_sign, eth_sendTransaction,
		eth_sendRawTransaction, eth_call, eth_estimateGas, eth_getBlockByHash, eth_getBlockByNumber, eth_getTransactionByHash,
		eth_getTransactionByBlockHashAndIndex, eth_getTransactionByBlockNumberAndIndex,	eth_getTransactionReceipt,
		eth_getUncleByBlockHashAndIndex, eth_getUncleByBlockNumberAndIndex, eth_getCompilers, eth_compileLLL, eth_compileSolidity,
		eth_compileSerpent, eth_newFilter, eth_newBlockFilter, eth_newPendingTransactionFilter,	eth_uninstallFilter,
		eth_getFilterChanges, eth_getFilterLogs, eth_getLogs, eth_getWork, eth_submitWork,	eth_submitHashrate,	db_putString,
		db_getString, db_putHex, db_getHex, shh_post, shh_version, shh_newIdentity, shh_hasIdentity, shh_newGroup, shh_addToGroup,
		shh_newFilter, shh_uninstallFilter, shh_getFilterChanges, shh_getMessages;}


	private RPCMethod method;
	private String[] params;

	public RPCMethod getMethod() {
		return method;
	}
	public void setMethod(RPCMethod method) {
		this.method = method;
	}
	public String[] getParams() {
		return params;
	}
	public void setParams(String[] params) {
		this.params = params;
	}

	public RPCRequest(RPCMethod method, String[] params) {
		super();
		this.method = method;
		this.params = params == null ? new String[] {} : params;
	}

	public RPCRequest(String versionRPC, int id, RPCMethod method, String[] params ) {
		super(versionRPC, id);
		this.method = method;
		this.params = params == null ? new String[] {} : params;
	}

	
}
