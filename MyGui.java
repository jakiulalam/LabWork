import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MyGui{
	
	
	
	public static void main (String[] args){
		
		
		
		JFrame f= new JFrame ("My Contact");
		f.setBounds(200,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f.setVisible(true);
		
			
		f.setLayout(null);
		 System.out.println("My Gui running......");
		 //to add a textfield component
		 JTextField tf1=new JTextField();
		 tf1.setBounds(100,15,100,30);
		 f.add(tf1);
		 
		  JTextField tf2=new JTextField();
		 tf2.setBounds(100,50,100,30);
		 f.add(tf2);
		 
		 JTextField tf3=new JTextField();
		 tf3.setBounds(100,85,100,30);
		 f.add(tf3);
		 
		 
		 
		 
		 JLabel ff=new JLabel("Name");
		 ff.setBounds(50,15,100,30);
		 f.add(ff);
		 
		 JLabel ff1=new JLabel("Phone");
		 ff1.setBounds(50,50,100,30);
		 f.add(ff1);
		 JLabel ff2=new JLabel("e-mail");
		 ff2.setBounds(50,85,100,30);
		 f.add(ff2);
		 
		 JButton button= new JButton("Delete");
		 button.setBounds(30,125,100,25);
		 f.add(button);
		 
		  JButton button1= new JButton("Save");
		 button1.setBounds(145,125,100,25);
		 f.add(button1);
		 
         f.setVisible(true);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}