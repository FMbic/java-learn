import java.util.ArrayList;
import com.google.gson.GsonBuilder;

class blockChain {


    boolean isChainValid()
    {
        return isChainValid();
    }

    public static ArrayList<block> blockchain = new ArrayList<>();

    public static void main(String[] args)
    {
        blockchain.add(new block ("First block ", "0"));
        blockchain.add(new block ("Second block ", "1"));
        blockchain.add(new block ("Third block ", "2"));

        String blockJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println (blockJson);
    }
}
