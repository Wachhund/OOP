// Aufgabe 2.3
package de.eah.core;
import de.eah.data.Buerger;
import java.util.ArrayList;
//import Buerger;

// Klasse Stadt3
public class Stadt3
{    
    //Instanzvariablen
    private static final String begruessungstext = "Hello ";
    private final int gruendungsJahr;
    private int anzahlBewohner;
    private final String stadtName;
    private String buergerMeister;
    // neue Arrayliste erstellen für die Einwohner
    private ArrayList<Buerger> einwohner = new ArrayList();

    // Hauptprogramm
    public static void main (String[] args) {
        Stadt3 Erfurt = new Stadt3();
        Stadt3 Jena = new Stadt3();
        Erfurt.print(args);
        //Erfurt.addBuerger(new Buerger("Alfred", "Otto-Schottstr. 3, 07747 Jena"));
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

    // Buerger hinzufügen
    public void newBuerger()
    {
        this.einwohner.add(new Buerger("Alfred", "Jena"));
    }

    public void addBuerger(String namePerson, String wohnhaftInStadt)
    {
        this.einwohner.add(new Buerger(namePerson, wohnhaftInStadt));
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