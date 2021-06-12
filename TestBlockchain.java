
public class TestBlockchain {
	//public static int difficulty = 5;
	public static void main(String args[]) {
		
		BlockchaiN KLUCoin = new BlockchaiN();
		
		//BlockchaiN.get(0).mineBlock(difficulty);
		BlocK a = new BlocK("132e294", new java.util.Date(), "Vikrant");
		//132e294 is version date 20/11/2020:HEXDECIMAL:
		BlocK b = new BlocK("132e294", new java.util.Date(), "Kunal");
		
		BlocK c = new BlocK("132e294", new java.util.Date(), "Jaya");
		
		KLUCoin.addBlocK(a);
		
		KLUCoin.addBlocK(b);
		
		KLUCoin.addBlocK(c);
		
		//KLUCoin.getLatestBlock().setPreviousHash("ABCDEFG");
		
		KLUCoin.displayChain();
		
		//System.out.println("\nBlockchain is Valid: ");
		KLUCoin.isValid();
		

	}
	
}