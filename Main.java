
package main;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   

public class Main {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Our movies :- 1-Joker  2-Aladdin  3-The lion King  4-Deedpool");
        System.out.println("Choose the movie :-");
        int x=input.nextInt();
        if(x!=1&&x!=2&&x!=3&&x!=4){System.out.println("Pleas choose number from 1 - 4");
         x=input.nextInt();
         ChooseMovie(x);
        }
        else {
        ChooseMovie(x);
                };
               
                
        
        
                
               
      
       
    }
    public static void ChooseMovie(int x){ 
          Scanner input=new Scanner(System.in);
          Movie m1=new Movie("Joker","Todd Phillips","Drama","31-8-2019","Todd philips","Robert De -- Brett Cillen","90 EGP");
          Movie m2=new Movie("Aladdin","Guy Ritchie","Comdy","8-5-2019","Guy Ritchie","Mena Massoud -- Will Smith","100 EGP");
          Movie m3=new Movie("The Lion King ","Jeff Nathanson","Animation","9-7-2019","Jon Favreau","Donald Glover -- James Earl","120 EGP");
          Movie m4=new Movie("Deedpool","Rhelt Reese","Comedy","8-2-2019","Tim Miller","Ryan Reynolds -- Morena Baccarin","150 EGP");
             Ticket t1 =new Ticket("17",0,90,"0");
             Ticket t2 =new Ticket("13",0,100,"0");
             Ticket t3 =new Ticket("13",0,120,"0");
             Ticket t4 =new Ticket("18",0,150,"0");
             Showtime s1=new Showtime(0,"0","0");
             Showtime s2=new Showtime(0,"0","0");
             Showtime s3=new Showtime(0,"0","0");
             Showtime s4=new Showtime(0,"0","0");
             Showroom r1=new Showroom("1",0,'A');
             Showroom r2=new Showroom("2",0,'B');
             Showroom r3=new Showroom("3",0,'C');
             Showroom r4=new Showroom("4",0,'D');
             Seat e1=new Seat("False",0);
             Seat e2=new Seat("False",0);
             Seat e3=new Seat("False",0);      
             Seat e4=new Seat("False",0);      
             
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
             LocalDateTime now = LocalDateTime.now();
   
       if(x==1){System.out.println("You have chossen :- Joker"+ "\n"+ 
               "The Movie Writer is:-"+m1.getWriter()+"\n"+
                       "The Movie Type is:-"+m1.getTypeOfMovie()+"\n"
                               +"The date of production is:-"+m1.getProductionDate()+"\n"
                                       +"The Movie director :-"+m1.getDirector()+"\n"+
                                               "The Movie Actors :-"+m1.getActors()+"\n"
                                                +"The Movie Price :-"+m1.getPrice());
                                                      System.out.println("Time Avalable :- 12pm , 3pm , 6pm");
                                                      int t=input.nextInt();
                                                     s1.setTime(t);
                                                     System.out.println("How Mnay Tickets do you Want :- ");
                                                  int m=input.nextInt();
                                                   System.out.println(); 
                                                   int a [][]={{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},{31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50}};
                                                   int s [];
                                                   s = new int[50];
                                                   for(int i = 0; i < 50;i++){
                                                       s[i] = 0;
                                                   }
                                                    System.out.println(" ---------------------- ");
                                                     for (int i = 0; i < a.length; i++) {
                                                      for (int j = 0; j < a[i].length; j++) {
                                                        System.out.printf("%d ", a[i][j]);
                                                                                         }
                                                                     System.out.println();
                                                                         }
                                                   for(int k=1;k<m+1;k++){
                                                       System.out.println("Choose the seat for Ticket "+k);
                                                       while(true){
                                                        int e=input.nextInt();
                                                        if(s[e] == 0){
                                                            e1.setSeatNumber(e);
                                                            s[e] =1;
                                                            break;
                                                        }
                                                        else
                                                            System.out.println("this seat not available enter another seat number");
                                                       }
                                                       
                                                    System.out.println("Ticket "+k+"\n"+"Day :- "+dtf.format(now));     
                                                        System.out.println("Ticket Price:- "+t1.getPrice()+"\n"+"ShowTime : "+s1.getTime()+"Pm"+"\n"+"Your Seat :- "+e1.getSeatNumber()+"\n"+"Room : "+r1.getRoomno());
                                                                 System.out.println(" ---------------------- ");}
                                                      System.out.println("Total Price : "+t1.getPrice()*m);
                                                   }
       else if (x==2){System.out.println("You have chossen :- Aladdin"+ "\n"+ 
               "The Movie Writer is:-"+m2.getWriter()+"\n"+
                       "The Movie Type is:-"+m2.getTypeOfMovie()+"\n"
                               +"The date of production is:-"+m2.getProductionDate()+"\n"
                                       +"The Movie director :-"+m2.getDirector()+"\n"+
                                               "The Movie Actors :-"+m2.getActors()+"\n"
                                                     +"The Movie Price :-"+m2.getPrice());
                                                     System.out.println("Time Avalable :- 11pm , 7pm , 1pm");
                                                      int t=input.nextInt();
                                                     s2.setTime(t);
                                                    System.out.println("How Mnay Tickets do you Want :- ");
                                                  int m=input.nextInt();
                                                  int a [][]={{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},{31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50}};
                                                  int s [];
                                                   s = new int[50];
                                                   for(int i = 0; i < 50;i++){
                                                       s[i] = 0;
                                                   }
                                                    System.out.println(" ---------------------- ");
                                                     for (int i = 0; i < a.length; i++) {
                                                      for (int j = 0; j < a[i].length; j++) {
                                                        System.out.printf("%d ", a[i][j]);
                                                                                         }
                                                                     System.out.println();
                                                                         }
                                                   for(int k=1;k<m+1;k++){
                                                       System.out.println("Choose the seat for Ticket "+k);
                                                       while(true){
                                                        int e=input.nextInt();
                                                        if(s[e] == 0){
                                                            e2.setSeatNumber(e);
                                                            s[e] =1;
                                                            break;
                                                        }
                                                        else
                                                            System.out.println("this seat not available enter another seat number");
                                                       }
                                                    System.out.println("Ticket "+k+"\n"+"Day :- "+dtf.format(now));     
                                                        System.out.println("Ticket Price: "+t2.getPrice()+"\n"+"ShowTime : "+s2.getTime()+"Pm"+"\n"+"Your Seat :- "+e2.getSeatNumber()+"\n"+"Room : "+r2.getRoomno());
                                                             System.out.println(" ---------------------- ");}
                                                        System.out.println("Total Price : "+t2.getPrice()*m);}
       
       else if(x==3){System.out.println("You have chossen :- The Lion King "+ "\n"+ 
               "The Movie Writer is:-"+m3.getWriter()+"\n"+
                       "The Movie Type is:-"+m3.getTypeOfMovie()+"\n"
                               +"The date of production is:-"+m3.getProductionDate()+"\n"
                                       +"The Movie director :-"+m3.getDirector()+"\n"+
                                               "The Movie Actors :-"+m3.getActors()+"\n"
                                                     +"The Movie Price :-"+m3.getPrice());
                                                     System.out.println("Time Avalable :- 10pm , 3pm , 9pm");
                                                      int t=input.nextInt();
                                                     s3.setTime(t);
                                                        System.out.println("How Mnay Tickets do you Want :- ");
                                                  int m=input.nextInt();
                                                  int a [][]={{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},{31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50}};
                                                  int s [];
                                                   s = new int[50];
                                                   for(int i = 0; i < 50;i++){
                                                       s[i] = 0;
                                                   }  
                                                  System.out.println(" ---------------------- ");
                                                     for (int i = 0; i < a.length; i++) {
                                                      for (int j = 0; j < a[i].length; j++) {
                                                        System.out.printf("%d ", a[i][j]);
                                                                                         }
                                                                     System.out.println();
                                                                         }
                                                   for(int k=1;k<m+1;k++){
                                                       System.out.println("Choose the seat for Ticket "+k);
                                                       while(true){
                                                        int e=input.nextInt();
                                                        if(s[e] == 0){
                                                            e3.setSeatNumber(e);
                                                            s[e] =1;
                                                            break;
                                                        }
                                                        else
                                                            System.out.println("this seat not available enter another seat number");
                                                       }
                                                    System.out.println("Ticket "+k+"\n"+"Day :- "+dtf.format(now));     
                                                        System.out.println("Ticket Price : "+t3.getPrice()+"\n"+"ShowTime : "+s3.getTime()+"Pm"+"\n"+"Your Seat :- "+e1.getSeatNumber()+"\n"+"Room : "+r3.getRoomno());
                                                                 System.out.println(" ---------------------- ");}
                                                             System.out.println("Total Price : "+t3.getPrice()*m);}
       else if(x==4){System.out.println("You have chossen :- Deedpool"+ "\n"+ 
               "The Movie Writer is:-"+m4.getWriter()+"\n"+
                       "The Movie Type is:-"+m4.getTypeOfMovie()+"\n"
                               +"The date of production is:-"+m4.getProductionDate()+"\n"
                                       +"The Movie director :-"+m4.getDirector()+"\n"+
                                               "The Movie Actors :-"+m4.getActors()+"\n"
                                                     +"The Movie Price :-"+m4.getPrice());
                                                     System.out.println("Time Avalable :- 11pm , 4pm , 7pm");
                                                      int t=input.nextInt();
                                                     s4.setTime(t);
                                                            System.out.println("How Mnay Tickets do you Want :- ");
                                                  int m=input.nextInt();
                                                  int a [][]={{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30},{31,32,33,34,35,36,37,38,39,40},{41,42,43,44,45,46,47,48,49,50}};
                                                  int s [];
                                                   s = new int[50];
                                                   for(int i = 0; i < 50;i++){
                                                       s[i] = 0;
                                                   }  
                                                  System.out.println(" ---------------------- ");
                                                     for (int i = 0; i < a.length; i++) {
                                                      for (int j = 0; j < a[i].length; j++) {
                                                        System.out.printf("%d ", a[i][j]);
                                                                                         }
                                                                     System.out.println();
                                                                         }
                                                   for(int k=1;k<m+1;k++){
                                                       System.out.println("Choose the seat for Ticket "+k);
                                                       while(true){
                                                        int e=input.nextInt();
                                                        if(s[e] == 0){
                                                            e4.setSeatNumber(e);
                                                            s[e] =1;
                                                            break;
                                                        }
                                                        else
                                                            System.out.println("this seat not available enter another seat number");
                                                       }
                                                    System.out.println("Ticket "+k+"\n"+"Day :- "+dtf.format(now));     
                                                        System.out.println("Ticket Price: "+t4.getPrice()+"\n"+"ShowTime :"+s4.getTime()+"Pm"+"\n"+"Your Seat :- "+e4.getSeatNumber()+"\n"+"Room : "+r4.getRoomno());
                                                                                            System.out.println(" ---------------------- ");}
                                                          System.out.println("Total Price :"+t4.getPrice()*m);
                                                           }
                                                    
    }
    
    
}
