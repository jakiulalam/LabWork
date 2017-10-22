public class MobilePhn{
	private  int simno;
	public  static int id =0;
	private  String customername;
	private double balance;
	private double callrate;
	private MobilePhn object;
		
	
	public  MobilePhn(String customername1,double balance1,double callrate1){
		
		this(id);
		id++;
		customername=customername1;
		balance=balance1;
		callrate=callrate1;	
		
	}
	
		private  MobilePhn(int simno){
		
		this.simno=simno;
	}
	

	public double call(double Duration,MobilePhn object){
		
		balance=balance-(callrate*Duration);
		this.object=object;
		return balance;
		
	}
	public void displayinfo(){
		
		
		System.out.println(balance);
		System.out.println(customername);
		System.out.println(simno);
		System.out.println(callrate);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}