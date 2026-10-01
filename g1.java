import java.util.Scanner;

public class g1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int c_choice= (int)(Math.random()*100)+1;
       
        int n=10;
        while (n>0){
             System.out.println("try n guess a number  between 1 to 100 : ");
        int p_choice= sc.nextInt();
            if(p_choice>100 || p_choice<0 ){
                System.out.println("Please try to enter the number from 1 to 100");
                continue;
            }
            if (p_choice==c_choice){
                System.out.println("Congratualations!!");
                System.out.println("Your guess is right");
                 if(n==10){
                System.out.println("You guessed the number perfectly in 1 try ");
                System.out.println("Your guessing accuracy is on point ");
            }
            else if (n==9){
                System.out.println("You guessed the number perfectly in 2nd try ");
                System.out.println("Your guessing accuracy is great ");

            }
            else if (n==8){
                System.out.println("You guessed the number perfectly in 3rd try ");
                System.out.println("Your guessing accuracy is great ");
            }else if (n==7){
                System.out.println("You guessed the number perfectly in 4th try ");
                System.out.println("Your guessing accuracy is good ");
            }
            else if (n==6){
                System.out.println("You guessed the number perfectly in 5th try ");
                System.out.println("Your guessing accuracy is good   ");
            }
            else if (n==5){
                System.out.println("You guessed the number perfectly in 6th try ");
                System.out.println("Your guessing accuracy is good ");

            }
            else if (n==4){
                System.out.println("You guessed the number perfectly in 7th try ");
                System.out.println("Your guessing accuracy is okay");
            }
            else if (n==3){
                System.out.println("You guessed the number perfectly in  8th try ");
                System.out.println("Your guessing accuracy is okay ");;
            }else if (n==2){
                System.out.println("You guessed the number perfectly in 9th try ");
                
            }
            else if(n==1){
                System.out.println("You guessed the number perfectly in 10th try ");
                System.out.println("finally yo!! atleast you guessed it in the last try ");
                
            }
                
                break;
            }
            else{
                System.out.println("Sorry!!");
                System.out.println("Your guess is wrong !");
                System.out.println("Please try again");
                System.out.println("you have last "+(n-1)+" tries");
                


            }
           
            n--;
            if (p_choice > c_choice) {
             System.out.println("Too High! Try a lower number.");
           } else {

             System.out.println("Too Low! Try a higher number.");
           }
            if (n==0){
               
           System.out.println("Game Over! The secret number was: " + c_choice);
            }

            
}
}
}