import java.util.Date;

public class block
{
    String hash;
    String previousHash;
    private String date;
    private long timeStamp;
    private int nonce;


    public block(String date, String previousHash)
    {
        this.date = date;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash()
    {
        String calculatedHash = genFinger.useSHA256(previousHash+Long.toString(timeStamp)+date+Integer.toString(nonce));
        return calculatedHash;
    }


    public void mineBlock(int difficulty)
    {
        String target = new String(new char[difficulty]).replace('\0','0');
        while (!hash.substring(0, difficulty).equals(target))
        {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block mined!!! "+ hash);
    }
}
