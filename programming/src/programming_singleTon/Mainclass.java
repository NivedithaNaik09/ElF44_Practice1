package programming_singleTon;

public class sample {
	static int count=0;
	static sample s;
	int x=10;
	private sample()
	{
		count++;
	}
	public static sample getInstance()
	{
		if (count<1)
		{
			s=new sample();
		}
	return s;
	}
	public static void setInstance(int y)
	{
		s.x=y;
	}
	}
	class Mainclass
	{
		public static void main(String[] args) {
			sample a= sample.getInstance();
			System.out.println(a.x);
			sample b= sample.getInstance();
			System.out.println(b.x);
			sample.setInstance(143);
			sample c= sample.getInstance();
			System.out.println(c.x);
		}
	}

	