public class Fenster
{
   private String material;  //Alu Holz Kunstoff
   private int    preis;    //Der Preis des Fenster inkl.Steuer in Eur
   private boolean kippbar; // Kann das Fenster grkippt werden
   
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
       // Die Eigenschaft material wird mit dem Wert des ParametersneuMaterial überschreiben
       this.material = material;
   }
   
   public void setPreis(int preis)
   {
       if((preis >= 199) && (preis <= 899))
       {
           this.preis = preis;
       }
       else
       {
         System.out.println("Fehler: ungültiger Preis " + preis + "!");  
       }
   }
          
   public void setKippbar(boolean kippbar)
   {
      this.kippbar = kippbar;
   }
   
  public void testen()
  {
      //System.out.println(material.charAt(0));
      //System.out.println(material.charAt(2));
      System.out.println(material.indexOf(" "));
  }

  public String getRohstoff()
  {
     //           01234
     //material = "Alu35"
     int Pos;
     
     
     
     Pos = material.indexOf(" "); //3
     return material.substring(0,Pos);
  }
     /*
     material Fenster:preis EUR - kippbar
     Alu Fenster:399 EUR - KIPPBAR
     Holz Fenster: 499 EUR - nicht KIPPBAR
     */
    public void printFenster()
  {
    if (kippbar == true)
    {
       System.out.println(material + " Fenster: " + preis + " EUR - " + "KIPPBAR");
    }
    else
    {
       System.out.println(material + " Fenster: " + preis + " EUR - " + "nicht KIPPBAR");
    }
  }
    
}  
 