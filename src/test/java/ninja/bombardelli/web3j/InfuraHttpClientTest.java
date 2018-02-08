package ninja.bombardelli.web3j;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

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

}
