public class user
{
    private Integer userId = 0;
    private Integer id = 0;
    private String title = null;
    private boolean completed = false;

    public Integer getUserId() {return userId;}
    public void setUserId(Integer userId) { this.userId = userId;}

    public Integer getId() {return  id;}
    public void setId(Integer id) { this.id = id;}

    public String getTitle() {return title;}
    public void setTtile(String title) { this.title = title;}

    public boolean isCompleted(){return completed;}
    public void setCompleated(boolean compleated){ this.completed = compleated;}
}
