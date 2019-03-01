import java.io.*;
public class IA extends tournament
{
    String tournament_name, venue;
    int dd, mm, yy;
    int n;
    String names[];
    int number[];
    int points[];
    String name;
    int num;
    int point;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input1() throws IOException // to 
    //write into file in write mode
    {
        System.out.printf("\f");
        char c;
        System.out.printf("\f");
        BufferedWriter bw=new BufferedWriter(new FileWriter("records.dat"));
        PrintWriter ofile=new PrintWriter(bw);
        do
        {
            tournament abc=new tournament();
            abc.input();
            System.out.println("Enter number of students who participated from school: ");
            n=Integer.parseInt(br.readLine());
            names=new String[n];
            number=new int[n];
            points=new int[n];
            for(int i=0;i<n;i++)
            {
                ofile.println(abc.name);
	            ofile.println(abc.venue);
	            ofile.println(abc.dd);
	            ofile.println(abc.mm);
   		        ofile.println(abc.yy);
                System.out.println("Enter the name of student "+(i+1));
                names[i]=br.readLine();
                ofile.println(names[i]);
                System.out.println("Enter the school number of "+names[i]);
                number[i]=Integer.parseInt(br.readLine());
                ofile.println(number[i]);
                System.out.println("Enter the points scored by "+names[i]+" in this tournament");
                points[i]=Integer.parseInt(br.readLine());
                ofile.println(points[i]);
            }
            
            System.out.println("Add more tournaments(Y/N)");
            c=(char)br.read();
            br.read();
	        System.out.printf("\f");
        }while(c=='Y' || c=='y');
        ofile.close();
    }
    
    void Append() throws IOException
    {
        System.out.printf("\f");
        char c;
        System.out.printf("\f");
        BufferedWriter bw=new BufferedWriter(new FileWriter("records.dat",true));
        PrintWriter ofile=new PrintWriter(bw);
        do
        {
            tournament abc=new tournament();
            abc.input();
            System.out.println("Enter number of students who participated from school: ");
            n=Integer.parseInt(br.readLine());
            names=new String[n];
            number=new int[n];
            points=new int[n];
            for(int i=0;i<n;i++)
            {
                ofile.println(abc.name);
	            ofile.println(abc.venue);
	            ofile.println(abc.dd);
	            ofile.println(abc.mm);
   		        ofile.println(abc.yy);
                System.out.println("Enter the name of student "+(i+1));
                names[i]=br.readLine();
                ofile.println(names[i]);
                System.out.println("Enter the school number of "+names[i]);
                number[i]=Integer.parseInt(br.readLine());
                ofile.println(number[i]);
                System.out.println("Enter the points scored by "+names[i]+" in this tournament");
                points[i]=Integer.parseInt(br.readLine());
                ofile.println(points[i]);
            }
            
            System.out.println("Add more tournaments(Y/N)");
            c=(char)br.read();
            br.read();
	        System.out.printf("\f");
        }while(c=='Y' || c=='y');
        ofile.close();
    }
    void output()throws IOException //read 
    //& display all records from the
    {
        System.out.printf("\f");
        FileReader file=new FileReader("records.dat");
        BufferedReader br1=new BufferedReader(file);
        new BufferedReader(new FileReader("records.dat"));
        System.out.printf("\f");
        String b="";
        int f=0,g=0,h=0;
        System.out.println();
        System.out.printf("%-30s %-10s %-2s %-2s %-4s %-30s %-3s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "STUDENT NAME", "NUM", "Pt.");
        System.out.print("\n---------------------------------------------------------------------------------------------------");
        while(true)
        { 
            tournament_name=br1.readLine();
            if(tournament_name==null)break;
            venue=br1.readLine();
            dd=Integer.parseInt(br1.readLine());
            mm=Integer.parseInt(br1.readLine());
            yy=Integer.parseInt(br1.readLine());
			System.out.println();
			name=br1.readLine();
            num=Integer.parseInt(br1.readLine());
            point=Integer.parseInt(br1.readLine());
            System.out.println();
			System.out.printf("%-30s %-10s %-2d %-2d %-4d %-30s %-3d %-3d", tournament_name, venue, dd, mm, yy, name, num, point);
        }
        br1.close();
    }

    void search_date_range_student_venue() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            new BufferedReader(new FileReader("records.dat"));
            
            System.out.println("Please enter the name of the student: ");
            String N=br.readLine();
            
            System.out.println("Please enter the name of the venue: ");
            String S=br.readLine();
            
            System.out.println("Please enter the first date in the date, month, year format");
            System.out.println("Date1 ");
            int d1=Integer.parseInt(br.readLine());
            System.out.println("Month1 ");
            int m1=Integer.parseInt(br.readLine());
            System.out.println("Year1 ");
            int y1=Integer.parseInt(br.readLine());
           
            System.out.println("Please enter the second date in the date, month, year format");
            System.out.println("Date2 ");
            int d2=Integer.parseInt(br.readLine());
            System.out.println("Month2 ");
            int m2=Integer.parseInt(br.readLine());
            System.out.println("Year2 ");
            int y2=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                int x=comparison(dd,mm,yy,d1,m1,y1,d2,m2,y2);
                if(x==1&&(N.equalsIgnoreCase(name)==true)&&(S.equalsIgnoreCase(venue)))
                {
                    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-3d", tournament_name, venue, dd, mm, yy, point);
                }
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more students' performance at a particular venue  between two dates? (Y/N)\n");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');                
    }
    
    void search_date_range_student() throws IOException
    {
        System.out.printf("\f");
		char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            new BufferedReader(new FileReader("records.dat"));
            
            System.out.println("Please enter the name of the student");
            String N=br.readLine();
            
            System.out.println("Please enter the first date in the date, month, year format");
            System.out.println("Date1 ");
            int d1=Integer.parseInt(br.readLine());
            System.out.println("Month1 ");
            int m1=Integer.parseInt(br.readLine());
            System.out.println("Year1 ");
            int y1=Integer.parseInt(br.readLine());
           
            System.out.println("Please enter the second date in the date, month, year format");
            System.out.println("Date2 ");
            int d2=Integer.parseInt(br.readLine());
            System.out.println("Month2 ");
            int m2=Integer.parseInt(br.readLine());
            System.out.println("Year2 ");
            int y2=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                int x=comparison(dd,mm,yy,d1,m1,y1,d2,m2,y2);
                if(x==1&&N.equalsIgnoreCase(name)==true)
                {
                    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-3d", tournament_name, venue, dd, mm, yy, point);
                }
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more students' performance between two dates? (Y/N)\n");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');                
    }
    
    void search_date_range_tournament_name() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            new BufferedReader(new FileReader("records.dat"));
            
            System.out.println("Please enter the name of the tournament");
            String N=br.readLine();
            
            System.out.println("Please enter the first date in the date, month, year format");
            System.out.println("Date1 ");
            int d1=Integer.parseInt(br.readLine());
            System.out.println("Month1 ");
            int m1=Integer.parseInt(br.readLine());
            System.out.println("Year1 ");
            int y1=Integer.parseInt(br.readLine());
           
            System.out.println("Please enter the second date in the date, month, year format");
            System.out.println("Date2 ");
            int d2=Integer.parseInt(br.readLine());
            System.out.println("Month2 ");
            int m2=Integer.parseInt(br.readLine());
            System.out.println("Year2 ");
            int y2=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-30s %-3s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "STUDENT NAME", "NUM", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                int x=comparison(dd,mm,yy,d1,m1,y1,d2,m2,y2);
                if(x==1&&N.equalsIgnoreCase(tournament_name)==true)
                {
                    System.out.println();
                    System.out.printf("%-30s %-10s %-2d %-2d %-4d %-30s %-3d %-3d", tournament_name, venue, dd, mm, yy, name, num, point);
                }
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more tournaments between two dates? (Y/N)\n");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');        
    }
    
    void search_date_range_venue() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            new BufferedReader(new FileReader("records.dat"));
            
            System.out.println("Please enter the name of the venue");
            String N=br.readLine();
            
            System.out.println("Please enter the first date in the date, month, year format");
            System.out.println("Date1 ");
            int d1=Integer.parseInt(br.readLine());
            System.out.println("Month1 ");
            int m1=Integer.parseInt(br.readLine());
            System.out.println("Year1 ");
            int y1=Integer.parseInt(br.readLine());
           
            System.out.println("Please enter the second date in the date, month, year format");
            System.out.println("Date2 ");
            int d2=Integer.parseInt(br.readLine());
            System.out.println("Month2 ");
            int m2=Integer.parseInt(br.readLine());
            System.out.println("Year2 ");
            int y2=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-30s %-3s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "STUDENT NAME", "NUM", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                int x=comparison(dd,mm,yy,d1,m1,y1,d2,m2,y2);
                if(x==1&&N.equalsIgnoreCase(venue)==true)
                {
                    System.out.println();
        			System.out.printf("%-30s %-10s %-2d %-2d %-4d %-30s %-3d %-3d", tournament_name, venue, dd, mm, yy, name, num, point);
                }
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more tournaments at a particular venue between two dates? (Y/N)\n");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');        
    }
    
    void search_date_range_tournament() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            new BufferedReader(new FileReader("records.dat"));
            System.out.println("Please enter the first date in the date, month, year format");
            System.out.println("Date1");
            int d1=Integer.parseInt(br.readLine());
            System.out.println("Month1");
            int m1=Integer.parseInt(br.readLine());
            System.out.println("Year1");
            int y1=Integer.parseInt(br.readLine());
           
            System.out.println("Please enter the second date in the date, month, year format");
            System.out.println("Date2");
            int d2=Integer.parseInt(br.readLine());
            System.out.println("Month2");
            int m2=Integer.parseInt(br.readLine());
            System.out.println("Year2");
            int y2=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-30s %-3s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "STUDENT NAME", "NUM", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                int x=comparison(dd,mm,yy,d1,m1,y1,d2,m2,y2);              
                if(x==1)
                {
                    System.out.println();
        			System.out.printf("%-30s %-10s %-2d %-2d %-4d %-30s %-3d %-3d", tournament_name, venue, dd, mm, yy, name, num, point);
                }
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more tournaments between two dates? (Y/N)\n");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
    
    int comparison(int a, int b, int c, int a1, int b1, int c1, int a2, int b2, int c2)
    {
        int x=0;
        if(c1<c2)
        {
            if(c==c1)
            {
                if(b>b1)x=1;
                else if(b==b1)
                {
                    if(a>=a1)x=1;
                }
            }
            else if(c1<c&&c<c2)x=1;
            else if(c==c2)
            {
                if(b<b2)x=1;
                else if(b==b2)
                {
                    if(a<=a2)x=1;
                }
            }
        }
        else if(c1==c2&&c1==c)
        {
            if(b1<b2)
            {
                if(b1<b&&b<b2)x=1;
                else if(b1==b)
                {
                    if(a>=a1)x=1;
                }
                else if(b2==b)
                {
                    if(a<=a2)x=1;
                }
            }
            else if(b1==b2&&b1==b)
            {
                if((a1<=a)&&(a<=a2))x=1;
            }
        }
        return x;
    }
    
    void search_individual_student_tournament() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            
            System.out.println("Please enter the name of the student you wish to search:\n");
            String s=br.readLine();
            
            System.out.println("Please enter the tournament's name where you want to check the student's performance:\n");
            String v=br.readLine();
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine();
                if(tournament_name==null)break;
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
    			name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                if((s.equalsIgnoreCase(name)==true)&&(v.equalsIgnoreCase(tournament_name)==true))
    			{
    			    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-3d", tournament_name, venue, dd, mm, yy, point);
    			}
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more students' performance in a particular tournament? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
    
    void search_individual_student_venue() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            
            System.out.println("Please enter the name of the student you wish to search:\n");
            String s=br.readLine();
            
            System.out.println("Please enter the venue where you want to check the student's performance:\n");
            String v=br.readLine();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine();
                if(tournament_name==null)break;
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
    			name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                if((s.equalsIgnoreCase(name)==true)&&(v.equalsIgnoreCase(venue)==true))
    			{
    			    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-3d", tournament_name, venue, dd, mm, yy, point);
    			}
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more students' performance at a particular venue? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
    
    void search_individual_student() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            
            System.out.println("Please enter the name of the student you wish to search:\n");
            String s=br.readLine();
            System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "Pt.");
            System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine();
                if(tournament_name==null)break;
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
    			name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                if((s.equalsIgnoreCase(name)==true))
    			{
    			    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-3d", tournament_name, venue, dd, mm, yy, point);
    			}
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more students? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
    
    void search_venue() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            
            System.out.println("Please enter the name of the venue you wish to search:\n");
            String s=br.readLine();
            System.out.println();
		    System.out.printf("%-30s %-10s %-2s %-2s %-4s %-30s %-3s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "STUDENT NAME", "NUM", "Pt.");
		    System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine();
                if(tournament_name==null)break;
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
    			name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                if(s.equalsIgnoreCase(venue)==true)
    			{
    			    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-30s %-3d %-3d", tournament_name, venue, dd, mm, yy, name, num, point);
    			}
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more tournaments at a particular venue? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }

    void search_tournament_name() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            
            System.out.println("Please enter the name of the tournament you wish to search:\n");
            String s=br.readLine();
		    System.out.println();
            System.out.printf("%-30s %-10s %-2s %-2s %-4s %-30s %-3s %-3s", "TOURNAMENT NAME", "VENUE", "DD", "MM", "YYYY", "STUDENT NAME", "NUM", "Pt.");
		    System.out.print("\n-------------------------------------------------------------------------------------------------------------------------");
            while(true)
            {
                tournament_name=br1.readLine();
                if(tournament_name==null)break;
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
    			name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                if(s.equalsIgnoreCase(tournament_name)==true)
    			{
    			    System.out.println();
            		System.out.printf("%-30s %-10s %-2d %-2d %-4d %-30s %-3d %-3d", tournament_name, venue, dd, mm, yy, name, num, point);
    			}
            }
            br1.close();
            System.out.println("\n\nDo you wish to search for any more tournaments? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }

    void search_menu_date_range() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            System.out.println("Please enter what do you wish to search for between two dates:\n1. All tournaments\n2. Specific Tournament");
            System.out.println("3. All tournaments at a venue\n4. A student's performance\n5. A student's performance at a particular venue");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                search_date_range_tournament();
                break;
                case 2:
                search_date_range_tournament_name();
                break;
                case 3:
                search_date_range_venue();
                break;
                case 4:
                search_date_range_student();
                break;
                case 5:
                search_date_range_student_venue();
                break;
            }
            System.out.println("\n\nDo you wish to search for anything else between a date range? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
        
    }
    
    void search_menu_normal() throws IOException// Searcheing for a given name 
    {
        System.out.printf("\f");
        char ch;
        do
        {
            System.out.println("Please enter what do you wish to search for:\n1. A tournament\n2. All tournament that have taken place at a particular venue");
            System.out.println("3. A student's performance in all tournaments\n4. A student's performance in a particular tournament");
            System.out.println("5. A student's performance at a particular venue\n6. Information between date ranges");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                search_tournament_name();
                break;
                case 2:
                search_venue();
                break;
                case 3:
                search_individual_student();
                break;
                case 4:
                search_individual_student_tournament();
                break;
                case 5:
                search_individual_student_venue();
                break;
                case 6:
                search_menu_date_range();
                break;
            }
            System.out.println("\n\nDo you wish to search for anything else? (Y/N)");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
  

    void remove() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            System.out.println("Please enter what you wish to remove:\n1. Entire Tournament\n2. Individual Student records from all tournaments\n3. Individual Student Record from a specific tournament");        
            int choice=Integer.parseInt(br.readLine());
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            BufferedWriter bw=new BufferedWriter(new FileWriter("temp"));
            PrintWriter ofile=new PrintWriter(bw);
            if(choice==1)
            {
                System.out.println("Please enter the name of the tournament you wish to remove: ");
                String N=br.readLine();
                while(true)
                {
                    tournament_name=br1.readLine(); 
                    if(tournament_name==null) break;    
                    venue=br1.readLine();
                    dd=Integer.parseInt(br1.readLine());
                    mm=Integer.parseInt(br1.readLine());
                    yy=Integer.parseInt(br1.readLine());
                    name=br1.readLine();
                    num=Integer.parseInt(br1.readLine());
                    point=Integer.parseInt(br1.readLine());
                    if(!N.equals(tournament_name))
                    {
                        ofile.println(tournament_name);
    	            	ofile.println(venue);
    	            	ofile.println(dd);
    	            	ofile.println(mm);
       		        	ofile.println(yy);
    	                ofile.println(name);
    	                ofile.println(num);
                	    ofile.println(point);
                    }
                }
            }
            else if(choice==2)
            {
                System.out.println("Please enter the name of the student you wish to remove: ");
                String N=br.readLine();
                while(true)
                {
                    tournament_name=br1.readLine(); 
                    if(tournament_name==null) break;    
                    venue=br1.readLine();
                    dd=Integer.parseInt(br1.readLine());
                    mm=Integer.parseInt(br1.readLine());
                    yy=Integer.parseInt(br1.readLine());
                    name=br1.readLine();
                    num=Integer.parseInt(br1.readLine());
                    point=Integer.parseInt(br1.readLine());
                    if(!N.equals(name))
                    {
                        ofile.println(tournament_name);
    	            	ofile.println(venue);
    	            	ofile.println(dd);
    	            	ofile.println(mm);
       		        	ofile.println(yy);
    	                ofile.println(name);
    	                ofile.println(num);
                	    ofile.println(point);
                    }
                }
            }
            else if(choice==3)
            {
                System.out.println("Please enter the name of the student you wish to remove: ");
                String S=br.readLine();
                System.out.println("Please enter the name of the tournament from which the student's name is supposed to be removed: ");
                String N=br.readLine();
                while(true)
                {
                    tournament_name=br1.readLine(); 
                    if(tournament_name==null) break;    
                    venue=br1.readLine();
                    dd=Integer.parseInt(br1.readLine());
                    mm=Integer.parseInt(br1.readLine());
                    yy=Integer.parseInt(br1.readLine());
                    name=br1.readLine();
                    num=Integer.parseInt(br1.readLine());
                    point=Integer.parseInt(br1.readLine());
                
                    if(!N.equalsIgnoreCase(tournament_name))
                    {
                        ofile.println(tournament_name);
    	            	ofile.println(venue);
    	            	ofile.println(dd);
    	            	ofile.println(mm);
       		        	ofile.println(yy);
    	                ofile.println(name);
    	                ofile.println(num);
                	    ofile.println(point);
                    }
                    else if(!S.equalsIgnoreCase(name))
                    {
                        ofile.println(tournament_name);
    	            	ofile.println(venue);
    	            	ofile.println(dd);
    	            	ofile.println(mm);
       		        	ofile.println(yy);
    	                ofile.println(name);
    	                ofile.println(num);
                	    ofile.println(point);
                    }
                }
            }
            
            br1.close();
            ofile.close();
            FileReader file1=new FileReader("temp");
            BufferedReader br11=new BufferedReader(file1);
            BufferedWriter bw1=new BufferedWriter(new FileWriter("records.dat"));
            PrintWriter ofile1=new PrintWriter(bw1);
            
            while(true)
            {
                tournament_name=br11.readLine();
                if(tournament_name==null)break;
                venue=br11.readLine();
                dd=Integer.parseInt(br11.readLine());
                mm=Integer.parseInt(br11.readLine());
                yy=Integer.parseInt(br11.readLine());
                name=br11.readLine();
                num=Integer.parseInt(br11.readLine());
                point=Integer.parseInt(br11.readLine());
                ofile1.println(tournament_name);
    	      	ofile1.println(venue);
             	ofile1.println(dd);
            	ofile1.println(mm);
            	ofile1.println(yy);
                ofile1.println(name);
                ofile1.println(num);
          	    ofile1.println(point);
            }
            br11.close();
            ofile1.close();
            System.out.println("\n\nDo you wish to remove anything else (Y/N) ");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
    
    void edit_tournament() throws IOException
    {
        System.out.printf("\f");
        char cha;
        do
        {    
            BufferedWriter bw=new BufferedWriter(new FileWriter("temp"));
            PrintWriter ofile=new PrintWriter(bw);
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            //Making a duplicate over
            
            //Displaying choices
            System.out.println("Please enter the name of the tournament you wish to edit");
            String N=br.readLine();
            char bn;
            
            System.out.println("Please enter the year the tournament was held");
            int ye=Integer.parseInt(br.readLine());
            
            System.out.println("Please enter what do you wish to change:\n1. Tournament name\n2. Venue\n3. Dates\n4. Student records ");
            int ch=Integer.parseInt(br.readLine());
            String tem="";
            String x="";
            int b=0;
            int d=0,m=0,y=0;
            if(ch==1)
            {
                System.out.println("Please enter the new name of the tournament: ");
                tem=br.readLine();
            }
    		else if(ch==2)
    		{
    			System.out.println("Please enter the name of the new venue: ");
    		    tem=br.readLine();
    		}
    		else if(ch==3)
    		{
    		    System.out.println("Please enter new date in date, month, and year format: ");
    		    d=Integer.parseInt(br.readLine());
               	m=Integer.parseInt(br.readLine());
          		y=Integer.parseInt(br.readLine());
    		}
    		else if(ch==4)
    		{
    		    System.out.println("Please enter which student's records you wish to edit: ");
    		    x=br.readLine();
    		    System.out.println("Please enter what do you wish to change?\n1. Name\n2. School Number\n3. Points scored in the tournament\n");
    		    b=Integer.parseInt(br.readLine());
    		    
    		    if(b==1)
    		    {
    		        System.out.println("Please enter the new name: ");
    		        tem=br.readLine();
    		    }
    		    else if(b==2)
    		    {
    		        System.out.println("Please enter the new school number: ");
    		        d=Integer.parseInt(br.readLine());
    		    }
    		    else if(b==3)
    		    {
    		        System.out.println("Please enter the new number of points scored: ");
    		        m=Integer.parseInt(br.readLine());
    		    }
    		}
    		
    		while(true)
    		{
    		    tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                
                if(yy==ye&&(N.equalsIgnoreCase(tournament_name)==true))
                {
                    if(ch==1)tournament_name=tem;
                    else if(ch==2)venue=tem;
                    else if(ch==3)
                    {
                        dd=d;
                        mm=m;
                        yy=y;
                    }
                    else if(ch==4&&(x.equalsIgnoreCase(name)==true))
                    {
                        if(b==1)name=tem;
                        else if(b==2)num=d;
                        else if(b==3)point=m;
                    }
                }
                
                ofile.println(tournament_name);
              	ofile.println(venue);
               	ofile.println(dd);
               	ofile.println(mm);
            	ofile.println(yy);
                ofile.println(name);
                ofile.println(num);
          	    ofile.println(point);
          	}
          	
            br1.close();
            ofile.close();
            FileReader file1=new FileReader("temp");
            BufferedReader br11=new BufferedReader(file1);
            BufferedWriter bw1=new BufferedWriter(new FileWriter("records.dat"));
            PrintWriter ofile1=new PrintWriter(bw1);
            
            while(true)
            {
                tournament_name=br11.readLine();
                if(tournament_name==null)break;
                venue=br11.readLine();
                dd=Integer.parseInt(br11.readLine());
                mm=Integer.parseInt(br11.readLine());
                yy=Integer.parseInt(br11.readLine());
                name=br11.readLine();
                num=Integer.parseInt(br11.readLine());
                point=Integer.parseInt(br11.readLine());
                ofile1.println(tournament_name);
    	      	ofile1.println(venue);
             	ofile1.println(dd);
            	ofile1.println(mm);
            	ofile1.println(yy);
                ofile1.println(name);
                ofile1.println(num);
          	    ofile1.println(point);
            }
            br11.close();
            ofile1.close();    
	
            System.out.println("\n\nDo you wish to change the details of more tournaments (Y/N)\n");
            cha=(char)br.read();
            char chjjjjj=(char)br.read();
            System.out.printf("\f");
        }while(cha=='y'||cha=='Y');
    }
	
	void edit_student_details() throws IOException
	{
	    System.out.printf("\f");
	    char ch;
	    do
	    {
	        BufferedWriter bw=new BufferedWriter(new FileWriter("temp"));
            PrintWriter ofile=new PrintWriter(bw);
            FileReader file=new FileReader("records.dat");
            BufferedReader br1=new BufferedReader(file);
            //Making a duplicate over

	    	System.out.println("Please enter the name of the student whose details are to be changed: ");
	    	String N=br.readLine();
		    System.out.println("Please enter what do you wish to change about the student:\n1. His name\n2. His school number\n");
		    int choice=Integer.parseInt(br.readLine());
		    String x="";
		    int sn=0;
		    if(choice==1)
		    {
		        System.out.println("Please enter the new name: ");
		        x=br.readLine();
		    }
		    else if(choice==2)
		    {
		        System.out.println("Please enter the new school number: ");
		        sn=Integer.parseInt(br.readLine());
		    }
		    
		    while(true)
			{
    			tournament_name=br1.readLine(); 
                if(tournament_name==null) break;    
                venue=br1.readLine();
                dd=Integer.parseInt(br1.readLine());
                mm=Integer.parseInt(br1.readLine());
                yy=Integer.parseInt(br1.readLine());
                name=br1.readLine();
                num=Integer.parseInt(br1.readLine());
                point=Integer.parseInt(br1.readLine());
                
                if(N.equalsIgnoreCase(name)==true)
                {
                    if(choice==1)name=x;
                    else if(choice==2)num=sn;
                }
                
                ofile.println(tournament_name);
              	ofile.println(venue);
               	ofile.println(dd);
               	ofile.println(mm);
            	ofile.println(yy);
                ofile.println(name);
                ofile.println(num);
          	    ofile.println(point);
    		}
            br1.close();
            ofile.close();
            FileReader file1=new FileReader("temp");
            BufferedReader br11=new BufferedReader(file1);
            BufferedWriter bw1=new BufferedWriter(new FileWriter("records.dat"));
            PrintWriter ofile1=new PrintWriter(bw1);
            
            while(true)
            {
                tournament_name=br11.readLine();
                if(tournament_name==null)break;
                venue=br11.readLine();
                dd=Integer.parseInt(br11.readLine());
                mm=Integer.parseInt(br11.readLine());
                yy=Integer.parseInt(br11.readLine());
                name=br11.readLine();
                num=Integer.parseInt(br11.readLine());
                point=Integer.parseInt(br11.readLine());
                ofile1.println(tournament_name);
    	      	ofile1.println(venue);
             	ofile1.println(dd);
            	ofile1.println(mm);
            	ofile1.println(yy);
                ofile1.println(name);
                ofile1.println(num);
          	    ofile1.println(point);
            }
            br11.close();
            ofile1.close();
            System.out.println("\n\nDo you wish to change the details of more students(Y/N)\n");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
	    }while(ch=='y'||ch=='Y');
	}
    void edit() throws IOException
    {
        System.out.printf("\f");
        char ch;
        do
        {
            System.out.println("Please enter what do you wish to change:\n1. A particular tournament\n2. A student's details from all tournaments");
            int choice=Integer.parseInt(br.readLine());
            if(choice==1)edit_tournament();
            else if(choice==2)edit_student_details();
            
            System.out.println("\n\nDo you wish to change anything else? (Y/N) ");
            ch=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch=='y'||ch=='Y');
    }
    
    void menu()
    {
        System.out.println("Welcome to The Doon School Chess Tournament Managing System");
        System.out.println("Following are the choices:");
        System.out.println("1. Make a new set of students\nNote: All old records will be deleted in this process");
        System.out.println("2. Add a tournament to the existing set");
        System.out.println("3. Search for something in the data");
        System.out.println("4. Remove something from the data");
        System.out.println("5. Edit something in the data");
        System.out.println("6. Display details of the entire set");
        System.out.println("7. Terminate the program");
        System.out.println("Please enter the number that corresponds to the serial number of your choice of action\n");
    }

    void main() throws IOException
    {
        char ch1;
        int ch;
        String N;
        do
        {
            menu();
            System.out.println("Enter your choice\n");
            ch=Integer.parseInt(br.readLine());
            System.out.printf("\f");
            switch(ch)
            {
                case 1 : input1();
                break;
                case 2: Append(); 
                break;
                case 3 : 
                search_menu_normal();
                break;
                case 4 :
                remove();
                break;
                case 5 :
                edit();
                break;
                case 6 :output();
                break;
                case 7 : 
                System.out.println("----End Of Program-------");
                return;
            }
            System.out.println("\n\nTo see menu again, press y\n");
            ch1=(char)br.read();
            br.read();
            System.out.printf("\f");
        }while(ch1=='y');
        System.out.printf("\f");
        System.out.println("----End Of Program-------");
    }
}