public class Add extends Meta
{
	
	Add()
	{
		super(1);
		so();
	}
	static void refer(String s)
	{
		if(s.equals("so"))
			Economy.z=Economy.z+0.1;
		//else
			//;
	}
	@Override
	void so()
	{
		for(int i=0;i<Math.random()*6;i++)
			Economy.z=Economy.z+0.01;
	}/*
	@Override
	void sh()
	{
		
	}*/
	@Override
	public void definer()
	{
		Economy.s=true;
	}
}