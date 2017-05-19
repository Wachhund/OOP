// Aufgabe 5b (4-5)
public class Stadt2
{
    public static void main (String[] args) {
        Stadt2 lala = new Stadt2();
        lala.print("text");
    }
    public Stadt2()
    {
        String begruesungstext = "Keine Eingabe";
        print(begruesungstext);
    }
    
    public Stadt2(String begruesungstext)
    {
        print(begruesungstext);
    }
    
    public void print(String begruesungstext)
    {
        System.out.println(begruesungstext);
    }
}