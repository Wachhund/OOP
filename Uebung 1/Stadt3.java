// Aufgabe 6 (1-4)
// Aufgabe 7 (1-4)

// Klasse Stadt3
public class Stadt3
{
    //Instanzvariablen
    private static final String begruessungstext = "Hello ";
    private final int gruendungsJahr;
    private int anzahlBewohner;
    private final String stadtName;
    private String buergerMeister;
    
    // Hauptprogramm
    public static void main (String[] args) {
        Stadt3 Erfurt = new Stadt3();
        Stadt3 Jena = new Stadt3();
        Erfurt.print(args);
    }
    
    // 3x Konstruktor
    // 7.2 Konstruktor ohne Parameter
    public Stadt3()
    {
    this.gruendungsJahr = 2017;
    this.anzahlBewohner = 0;
    this.stadtName = "Leere Stadt";
    this.buergerMeister = "Keine Eingabe";
    }
    
    // 7.3 Konstruktor mit Pflichangaben
    public Stadt3(int gruendungsJahr, String stadtName , String buergerMeister)
    {
        this.gruendungsJahr = gruendungsJahr;
        this.anzahlBewohner = 0;
        this.stadtName = stadtName;
        this.buergerMeister = buergerMeister;
    }
    
    // 7.4 Konstruktor für alle Parameter
    public Stadt3(int gruendungsJahr, int anzahlBewohner, String stadtName , String buergerMeister)
    {
        this.gruendungsJahr = gruendungsJahr;
        this.anzahlBewohner = anzahlBewohner;
        this.stadtName = stadtName;
        this.buergerMeister = buergerMeister;
    }
    
    // Print-Methoden
    public void print()
    {
        System.out.println("Stadtname: " + stadtName);
    }
    
    public void print(String wert)
    {
        System.out.println(wert);
    }
    
    public void print(int wert)
    {
        System.out.println(wert);
    }
    public void print(String[] texte)
    {
        //for(int i = 0; i <= 10; i = i++)
        for(String text : texte)
        {
            System.out.println(begruessungstext + text);
        }
    }
    
    // Get-Methoden    
    public String getStadtName()
    {
       return(this.stadtName);
    }
    
    public int getGruendungsJahr()
    {
       return(this.gruendungsJahr);
    }
    
        public int getAnzahlBewohner()
    {
       return(this.anzahlBewohner);
    }
    
        public String getBuergerMeister()
    {
       return(this.buergerMeister);
    }
    
    // Set-Methoden
    public void setAnzahlBewohner(int anzahlBewohner)
    {
       this.anzahlBewohner = anzahlBewohner;
    }
    
    public void setBuergerMeister(String buergerMeister)
    {
       this.buergerMeister = buergerMeister;
    }
}