import java.io.*;
import java.util.*;
public class Support implements Ex
{
	static String q="";
	static ArrayList<Double> gdp=new ArrayList<Double>();
	static double a=0;
	Support()
	{
		definer();
	}
	public static void create(String s)
	{
		new Support();
		File f=new File("str/"+s+".txt");
		try
		{
			PrintWriter w=new PrintWriter(f);
			w.print(q);
			w.close();
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void definer()
	{
		q=this.pre;
	}
	public static String changer(String s,String q)
	{
		for(int i=0;i<gdp.size();i++)
		{
			a=a+gdp.get(i);
		}
		a=a/gdp.size();
		String t="";
		if(s.equals("pop"))
		{
			if(Integer.valueOf(((Interface)Interface.o).igd)/Integer.valueOf(((Interface)Interface.o).pop)>=2.5)
			{
				int p=Integer.valueOf(q);
				double b=Math.random()*2;
				p=(int)(p*(1+10*(3.6*8/(a*b+8)/(a*b+8)))*Economy.z*5);
				t=String.valueOf(p);
			}
			else
			{
				int p=Integer.valueOf(q);
				double b=Math.random();
				p=(int)(p-p*b);
				t=String.valueOf(p);
			}
		}
		else if(s.equals("igd"))
		{
			int i=Integer.valueOf(q);
			if(i>=80000)
			{
				i=(int)((int)(i*(1-(8*i*80000/(i+80000)/(i+80000)))*(1+1/Math.E))-Math.random()*Integer.valueOf(((Interface)Interface.o).pop));
				t=String.valueOf(i);
			}
			else
			{
				double b=Math.random();
				i=(int)(i-i*b);
				t=String.valueOf(i);
			}
		}
		else
		{
			t=String.valueOf(Integer.valueOf(q)+1);
		}
		return t;
	}
	public static void array()
	{
		File f=new File("str");
		File[] c=f.listFiles();
		int j=0;
		for(File i:c)
		{
			try
			{
				BufferedReader b=new BufferedReader(new FileReader(i));
				try
				{
					String s=b.readLine();
					StringTokenizer t=new StringTokenizer(s,"$");
					int x=Integer.valueOf(t.nextToken());
					int y=Integer.valueOf(t.nextToken());
					double d=y/x;
					gdp.add(d);
				}catch (IOException e)
				{
					e.printStackTrace();
				}
				
			}catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void saver(String t,String p,String i,String y)
	{
		File f=new File("str/"+t+".txt");
		try
		{
			PrintWriter w=new PrintWriter(f);
			w.print(p+"$"+i+"$"+y);
			w.close();
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.exit(0);
		}
	}
}