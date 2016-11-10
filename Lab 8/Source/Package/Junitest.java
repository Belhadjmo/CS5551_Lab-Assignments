package m8Package;

public class Junitest {

   String say = "Its Okay";	
   MsgUtil meUtil = new MsgUtil(say);
   
  
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(say, meUtil.printMessage());     
   }


private void assertEquals(String message2, String printMessage) {
	// TODO Auto-generated method stub
	
}
}