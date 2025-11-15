import java.util.Date;

public class block
{
    String hash;
    String previousHash;
    private String date;
    private long timeStamp;

    public block(String date, String previousHash)
    {
        this.date = date;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
    }

    public String calculateHash()
    {
        String calculatedHash = genFinger.useSHA256(previousHash+Long.toString(timeStamp)+date);
        return calculatedHash;
    }

}
