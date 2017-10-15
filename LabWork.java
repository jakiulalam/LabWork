public class LabWork{
	public static String y;
	public static String x;
	public void extractinfo(String y,String x){
		
		
		 System.out.println("Day :" + y.substring(0, y.indexOf("/")));
		 System.out.println("Montth :"+ y.substring(3,5));
		System.out.println("Year :"+y.substring(6,10));
		
		
		 System.out.println("Day :" + x.substring(0, y.indexOf("/")));
		 System.out.println("Montth :"+ x.substring(3,5));
		System.out.println("Year :"+x.substring(6,10));
		
		int day=Integer.parseInt(x.substring(0, x.indexOf("/")));
		
		int day1=Integer.parseInt(y.substring(0, y.indexOf("/")));
		
		int interval=day1-day;
		
		System.out.println("Interval :"+interval);
	}
	
	public static void main(String[] args){
		
		LabWork ob=new LabWork();
		ob.extractinfo("15/10/2017","12/10/2017");
			
			
	}
	
	
	
	
	
}