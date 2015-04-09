import java.io.*;
import java.util.Scanner;


class dbms
{
    static Scanner fscan,x;
    static String filepath;
    static String db[][];
    static String attr[];
    static int nofattr,count;
 

    public static void main(String ar[])
    {
	x=new Scanner(System.in);
	System.out.println("enter the path to file");
	//	filepath= x.nextLine();
	try{
	    fscan=new Scanner(new File("relational-algebra/student.csv"));
	    String attributes=fscan.nextLine();
            attr=attributes.split(",");
	    nofattr=attr.length;
	    db=new String[1000][nofattr];
	    while(fscan.hasNext())
		{
		    db[count]=fscan.nextLine().split(",");
		    count++;
		}
	    
	    
	    
	}
	catch(FileNotFoundException e)
	    {
		System.out.println("file not found");
	    }
	
	ab:while(true)
	    {
		System.out.println("1- Show database\n2- Show attributes\n3- Project\n4- Insert\n5- Delete\n6- :exit ");
	 int choice=x.nextInt();
			   switch(choice)
			       {
			       case 1:
				   showdb();
				   break;
			       case 2:showattr();
				   break;
				case 3:
				 project();
				 break;
			       case 4:
				   insert();
				   break;
				   //case 5:
				   //delete();
				   //break;
			       case 6:
				   break ab;
				   
			       default:
				   System.out.println("wrong choice");
				   break;
		       }
			   }
			   }


    public static void showdb()
    {  
	for(int i=0;i<count;i++)
	    {
		for(int j=0;j<nofattr;j++)
		    {
			System.out.print(db[i][j]+" ");
		    }
		System.out.println();
	    }
	    }
    
    public static void showattr()
    {
	for (int i=0;i<nofattr;i++)
	    System.out.print(attr[i]+" ");
	System.out.println();

    }

    public static void project()
    {int i=0;
	Scanner y=new Scanner(System.in);
	System.out.println("enter attribute to project ");
	String projattr= y.nextLine();
	for( i=0;i<nofattr;i++)
	    {
		if(attr[i].equals(projattr))
		    break;
	    }
	if(i==nofattr)
	    System.out.println("wrong name entered");
	else
	    {
 for(int j=0;j<count;j++)
		    {
			System.out.println(db[j][i]);
		    }
	    }
    }

    public static void insert()
    {

    }

    
    
}


