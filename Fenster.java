public class Fenster
{
   private String material;
   private int    preis;
   private boolean kippbar;
   
   public Fenster (String neuMaterial, int neuPreis, boolean neuKippbar)
   {
       setMaterial(neuMaterial);
       setPreis(neuPreis);
       setKippbar(neuKippbar);
   }

   public Fenster(int neuPreis)
   {
       setMaterial("Alu");
       setPreis(neuPreis);
       setKippbar(true);
   }
   
   public Fenster(String neuMaterial, int neuPreis)
   {
       setMaterial(neuMaterial);
       setPreis(neuPreis);
       setKippbar(true);
   }
   
   public Fenster()
   {
     setMaterial("Alu");
     setPreis(499);
     setKippbar(true);  
   }
   
   public String getMaterial()
   {
       return material;
   }
   
   public int getPreis()
   {
       return preis;
   }
   
   public boolean getKippbar()
   {
       return kippbar;
   }
   
   public void setMaterial(String neuMaterial)
   {
       material = neuMaterial;
   }
   
   public void setPreis(int neuPreis)
   {
       preis = neuPreis;
   }
   
   public void setKippbar(boolean neuKippbar)
   {
      kippbar = neuKippbar;
   }
   
   /*
    material Fenster: preis EUR - kippbar
    Alu Fenster: 399 EUR - true
    Holz Fenster: 499 EUR - false
   */
   public void printFenster()
   {
       System.out.println(material + " Fenster: " + preis + " EUR - " + kippbar);
   }
    
   /*
       public Fenster(String neuMaterial, int neuPreis, boolean neuKippbar)
    {
        setMaterial(neuMaterial);
        setPreis(neuPreis);
        setKippbar(neuKippbar);
    }
    

    public Fenster(String neuMaterial, int neuPreis)
    {
        setMaterial(neuMaterial);
        setPreis(neuPreis);
        setKippbar(true);
    }

    public Fenster(String neuMaterial, boolean neuKippbar)
    {
        setMaterial(neuMaterial);
        setPreis(399);
        setKippbar(neuKippbar);
    }
    
    /*
    public Fenster()
    {
        setMaterial("Alu");
        setPreis(399);
        setKippbar(true);
    }
    */
}  
 
