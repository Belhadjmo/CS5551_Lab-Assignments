package m8Package;

public class MsgUtil {

   private String say;

   public MsgUtil(String message){
      this.say = message; 
   }

   // prints the message
   public String printMessage(){
      System.out.println(say);
      return say;
   }   

   // add "Hello guys" to the message
   public String salutationMessage(){
      say = "Hello guys" + say;
      System.out.println(say);
      return say;
   }   
}  