import java.util.Scanner;
public class Book  {
    public static   Scanner input = new Scanner(System.in);
    // attributes of book clss
    private   String Title,author,Date;
    private   int ISBN;
    private   Depart depart;
    // for helping search function 
    private   static int n=0;
    //to store name of the book
    private   static  String []nam = new String[100];
    //to store name of author
    private   static  String []namm = new String[100];
    //construct for book clss
    public Book( String Title, String author,String Date,int ISBN)
    {
        this.Title=Title;
        this.Date=Date;
        this.author=author;
        this.ISBN=ISBN;
        nam[n]=Title;
        namm[n]=author;
        n++;
  
    }
    //overloading construct 

    public Book(  Depart depart,String Title, String author,String Date,int ISBN)
    {
      this(Title, author, Date, ISBN);
        this.depart=depart;
    }
  // get functions for book data items 
    public String get_title()
    {
        return Title;
    }
    public String get_author()
    {
        return author;
    }
    public String get_date()
    {
        return Date;
    }
    public int get_ISBN()
    {
        return ISBN;
    }
      public void set_title(String Title )
    {
        this.Title=Title;
    }
    public void set_author( String author)
    {
          this.author=author;
      
    }
    public void  set_date( String Date)
    {
       this.Date= Date;
    }
    public void set_ISBN( int ISBN)
    {
        this.ISBN=ISBN;
    }
   
    // for veiw book's info for each book
    // implements library service 
    public  static   void  veiwbook( Book b) 
    {
        System.out.println(" Hello in veiw book's data service!\n ");
        System.out.println("Depart info is  :\n"+ b.depart+"\nThe info of book is: "+" \n"+ "\n-the name of book is: "+ b.get_title()+ "\n"+"-The author is: "+b.get_author()
        +"\n"+"-the date of publication :"+ b.get_date()+ "\n"+"-Its ISBN :"+b.get_ISBN() );
    }
     // implements search service 
       
        private static  Boolean Search_book( String T, String a) 
        {
           for(int i=0;i<n;i++)
           {
          
            if(nam[i].equals(T)&&namm[i].equals(a))
            {
             
                return true;
            }
          
           }
           return false;
        } 
   


     // implements library service
     
     
     public  static   void add_book()
    {
        
        System.out.println(" hello in adding book service");
        System.out.println( " Which depart do you want to adding this book?");
        Library.get_depart();
        String x = input.next();
    
        for( int i=0;i<Depart.no;i++)
        {
           
            if(x.equals(Depart.names[i]))
            {
                System.out.println(" of course , enter data of book ( the name , author, data  And ISBN)");
               
                 String title= input.next();
                  String Author=input.next();
                 String date= input.next();
                int iSBN= input.nextInt();
                System.out.println(" Hello in veiw book's data service!\n ");
                System.out.println("Depart info is  :\n"+ x+"\nThe info of book is: "+" \n"+ "\n-the name of book is: "+ title+ "\n"+"-The author is: "+Author
                             +"\n"+"-the date of publication :"+ date+ "\n"+"-Its ISBN :"+iSBN );
                             Depart.num[i]+=1;
                System.out.println("The book is added and the number of books in the Depart become: "+(Depart.num[i]));
                //for store the added book in memory and we can delete it later
           
                Book newbook = new Book(title, Author, date, iSBN);
                 
                
                
                
            }
          
          
        }

    }


    
     // implements library service 
    public static   void Delete_book(){
        System.out.println(" hello in Deleting  book service");
        System.out.println( " Which depart do you want to delete  this book?");
        Library.get_depart();
        String x = input.next();
     
            
          
           
               for( int i=0;i<Depart.no;i++)
               {
                  
                   if(x.equals(Depart.names[i]))
                   {
                       System.out.println(" of course , enter data of book ( the name , author)");
                       String s=input.next();
                       String y= input.next();
                     
                      if( Search_book( s, y))
                      {
                       System.out.println(" yes this book is found and it is  deleted");
                       Depart.num[i]-=1;
                       System.out.println("The number of books in the Depart become: "+(Depart.num[i]));
                     //line 160 is very important as number of depart is static so it is constant
                     // if we add books ore deleted by the functions the number isn't affected so line 160 make it affected 
       
                      }
                      else
                      {
                        
                        throw new NOTFOUND(" THIS book is not found");
                      }
                     
                   
                   
                     
                    
                       
                       
                   }
                 
                 
               }
            
            
        




    }


    
}
