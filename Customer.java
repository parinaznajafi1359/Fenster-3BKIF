public class Customer 
{
    private String name; // "Max Mustermann"
    private int geld;    // 1000 0..5000
    
    public Customer (String name , int geld)
    {
        setName(name);
        setGeld(geld);
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getGeld()
    {
        return geld;
    }
    
    public void setName(String neuName)
    {
        name = neuName;
    }
    
    public void setGeld(int neuGeld)
    {
        geld = neuGeld;
    }
    
    
    public void printCustomer()
    {
    if (geld >=1000)
        {
        System.out.println(name + "Customer:" + geld + "EUR_ hat genung Geld");
        }
    else
        {
        System.out.println(name + "Customer:" + geld + "EUR_nicht genung");
        }
    }
        
        
    }
    