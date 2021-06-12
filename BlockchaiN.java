import java.util.ArrayList;
import java.util.List;

public class BlockchaiN {

	private List<BlocK> chain;
	
	public BlockchaiN() {
		chain = new ArrayList<BlocK>();
		chain.add(generateGenesis());
	}
	
	private BlocK generateGenesis() {
		BlocK genesis = new BlocK("132e294", new java.util.Date(), "GENESIS");
		genesis.setPreviousHash(null);
		genesis.computeHash();
		return genesis;
	}
	
	public void addBlocK(BlocK blk) {
		BlocK newBlock = blk;
		newBlock.setPreviousHash(chain.get(chain.size()-1).getHash());
		newBlock.computeHash();
		this.chain.add(newBlock);
	}
	
	public void displayChain() {
		
		for(int i=0; i<chain.size(); i++) {
			System.out.println("Trying to Mine block "+i+"... ");
			System.out.println("Block: " + i);
			System.out.println("Version: " + chain.get(i).getVersion());
			System.out.println("Timestamp: " + chain.get(i).getTimestamp());
			System.out.println("PreviousHash: " + chain.get(i).getPreviousHash());
			System.out.println("Hash: " + chain.get(i).getHash());
			System.out.println();
		}
		
	}
	
	public BlocK getLatestBlock() {
		return this.chain.get(chain.size()-1);
	}
	
	public void isValid() {
		
		for(int i=chain.size()-1; i>0; i--) {
			if(   !(chain.get(i).getHash().equals(chain.get(i).computeHash()))   ) {
				System.out.println("Chain is not valid");
				return;
			}
			
			if(  !(chain.get(i).getPreviousHash().equals(chain.get(i-1).computeHash()))  ) {
				System.out.println("Chain is not valid");
				return;
			}
		}
		
		System.out.println("Chain is valid.");
		
	}

	
	
	
}