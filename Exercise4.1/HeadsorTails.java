import static java.lang.System.*;

 public class HeadsorTails{
     public static void main(String args[]){
         int i;
         int counts = 0;
         out.println("Tossing coin...");
         for(i=0;i<=2;i++){
             int rand = new java.util.Random().nextInt(2);
             out.print("Round"+(i+1)+":");
             if(rand == 0){
                 out.println("Heads"); counts++;
             }
             else{
                 out.println("Tails");
             }
         }
         out.println("Heads:"+counts+",Tails:"+(3-counts));
     }
 } 