public class ATM{
     public static void main(String[]args){
     
         double balance = 1000.00;
         double withdrawAmount =500.00;
     
     try{
         if(withdrawAmount > balance)

      {

	throw new Exception("insuffient balance");
	}
	balance = withdrawAmount;
     System.out.println("withdrawal successfull balance:" + balance);
    	}catch(Exception e){
        System.out.println("Error!" +e.getMessage());
        }
    }
}