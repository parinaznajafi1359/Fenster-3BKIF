public class Fenster
{
   private String material;
   private int    preis;
   private boolean kippbar;
   
   public Fenster (String material , int preis, boolean kippbar)
   {
       setMaterial(material);
       setPreis(preis);
       setKippbar(kippbar);
   }

   public Fenster(int neuPreis)
   {
       setMaterial("Alu");
       setPreis(neuPreis);
       setKippbar(true);
   }
   
   public Fenster(String material, int preis)
   {
       setMaterial(material);
       setPreis(preis);
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
   
   public void setMaterial(String material)
   {
       this.material = material;
   }
   
   public void setPreis(int preis)
   {
       this.preis = preis;
   }
   
   public void setKippbar(boolean kippbar)
   {
      this.kippbar = kippbar;
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
    
}  
 
