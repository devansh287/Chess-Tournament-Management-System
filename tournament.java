import java.io.*;
public class tournament
{
    String name;
    String venue;
    int dd,mm,yy;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    tournament()
    {
        name="";
        venue="";
        dd=0;
        mm=0;
        yy=0;
    }
        
    public void input() throws IOException
    {
        System.out.print("Enter tournament name: ");
        name=br.readLine();    
        System.out.println("Enter tournament venue: ");
        venue=br.readLine();        
        System.out.println("Enter tournament starting date in date, month, year format");
        System.out.println("Day:");
        dd=Integer.parseInt(br.readLine());
        System.out.println("Month:");
        mm=Integer.parseInt(br.readLine());
        System.out.println("Year:");
        yy=Integer.parseInt(br.readLine());
    }

}
