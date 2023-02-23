package oops;

public  class AxisBank extends BankInfo{
	@Override
       public  void deposit() {
    	   System.out.println("Deposit Cash");
       }
    	   
       public static void main(String[] args) {
    	   BankInfo obj1 = new AxisBank();
          
		obj1.saving();
		obj1.fixed();
		obj1.deposit();
		
	}
       

}
