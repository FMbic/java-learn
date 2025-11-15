import java.util.ArrayList;
import com.google.gson.GsonBuilder;

class blockChain {

    public static int difficulty = 50;
    boolean isChainValid;


    public static ArrayList<block> blockchain = new ArrayList<>();


    public static void main(String[] args) {
        blockchain.add(new block("First block ", "0"));
        System.out.println("Trying to Mine block 1... ");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new block("Second block ", "1"));
        System.out.println("Trying to Mine block 2... ");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new block("Third block ", "2"));
        System.out.println("Trying to Mine block 3... ");
        blockchain.get(0).mineBlock(difficulty);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

        String blockJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println(blockJson);
    }

    public static Boolean isChainValid() {
        block currentBlock;
        block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        //loop through blockchain to check hashes:
        for (int i = 1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);
            //compare registered hash and calculated hash:
            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }
            //compare previous hash and registered previous hash
            if (!previousBlock.hash.equals(currentBlock.previousHash)) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
            //check if hash is solved
            if (!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
                System.out.println("This block hasn't been mined");
                return false;
            }
        }
        return true;

    }
}
