package ninja.bombardelli.web3j;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import com.google.gson.Gson;
import com.sun.jersey.api.client.ClientResponse;

import ninja.bombardelli.ethereum.rpc.RPCRequest;
import ninja.bombardelli.ethereum.rpc.RPCRequest.RPCMethod;
import ninja.bombardelli.ethereum.rpc.RPCResponse;
import ninja.bombardelli.rest.RESTClient;
import ninja.bombardelli.rest.RESTClient.HTTPMethod;

public class InfuraHttpClientTest {


	Web3ClientVersion web3ClientVersion;

	@Before
	public void setup() throws IOException {
		Web3j web3 = Web3j.build(new HttpService("https://rinkeby.infura.io/HTufLP2eqw4HPhy2PSeD"));
		web3ClientVersion = web3.web3ClientVersion().send();
	}

	@Test
	public void web3jClienteVersion() throws IOException {
		assertEquals("Geth/v1.7.3-stable-4bb3c89d/linux-amd64/go1.9", web3ClientVersion.getWeb3ClientVersion());
	}

	@Test
	public void transactionFounds() {

	}

	@Test
	public void rpc() {

		RESTClient rc = new RESTClient();

		Arrays.asList(RPCMethod.values()).stream().forEach(method -> {
			RPCRequest jsonRPC = new RPCRequest(method, new String[]{});
			ClientResponse response =  rc.request("https://mainnet.infura.io/HTufLP2eqw4HPhy2PSeD", HTTPMethod.POST, jsonRPC);
			RPCResponse jrpcr = new Gson().fromJson(response.getEntity(String.class), RPCResponse.class);
			System.out.println(jrpcr.getResult());
		});;





	}

}
