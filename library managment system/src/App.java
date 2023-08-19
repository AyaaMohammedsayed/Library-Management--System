
public class App {
  
    public static void main(String[] args)  {

        System.out.println(" Hello in Selwaan  library !");
       

        // deprments object  in our library 
        Depart phisics = new Depart("phisics", "28/3/2003", 200, 50);
        Depart physycolgy = new Depart("physycolgy", "16/8/2003", 300, 80);
        Depart math = new Depart("math", "28/9/2016", 1500, 150);
        Depart earth = new Depart("earth", "28/12/2023", 100, 30);
        Library.get_depart();

         System.out.println(phisics +"\n---------------------------\n"+physycolgy+"\n---------------------------\n"+math+"\n---------------------------\n"+earth+"\n---------------------------\n");
         
         // some books to use our library service 
        Book b1 = new Book(earth, "earth and sky", "aya mohamed", " 28/3/2003", 5);
        Book b2 = new Book(earth, "earth and peaople", "asmmaa mohamed", " 21/9/2005", 8);
        Book b3 = new Book(math, "mathmatics", "any one", " 24/1/1980", 45);
        Book b4 = new Book(math, "power of math", "hana mohamed", " 8/10/1289", 78);
        Book b5 = new Book(phisics, "gravity of earth", "nuten", " 2/4/1200", 95);
        Book b6 = new Book(phisics, "amplitude", "abass", " 12/11/1500", 105);
        Book b7 = new Book(physycolgy, "earth", "mohamed", " 28/10/2000", 455);
        Book b8 = new Book(physycolgy, "sky", "ahmed", " 21/3/2003", 556);
        
        // for testing gets functions
         System.out.println("\n  Gets functions: \n" +"-Book's TITLE:" +b1.get_title()+"\n "+"-Book's authour:" +b1.get_author()+"\n "+"-Book's ISBN:" +b1.get_ISBN()+"\n "+"-Book's ISBN:" +b1.get_date()+"\n ");

         // data of book
      Book.veiwbook(b1);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b2);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b3);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b4);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b5);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b6);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b7);
        System.out.println("------------------------------------------------------------");
      Book.veiwbook(b8);
        System.out.println("------------------------------------------------------------");


       

      
        System.out.println("------------------------------------------------------------");
        //add book 
       Book.add_book();
       System.out.println("------------------------------------------------------------");
     //exception
        try{
            
            Book.Delete_book();
        }
        catch ( Exception e)
        {
            System.out.println(e.toString());
        }

        
        

     

      

    
        
  

    }
}
