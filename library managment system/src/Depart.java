public  class Depart  {
    //attribuites of the departs 
    private    String name_depart, date;
    private  int no_books;
     private int no_authors;
     // for help library 
    public  static int no=0;
    public  static  String []names = new String[100];
    //for help delete function
    public  static  int  []num = new int [100];
    // constructor
   public Depart(String name, String date, int n, int no_authors)
    {
     
        this.  name_depart =name;
         this. date= date;
        this. no_books= n;
        this.no_authors=no_authors;
        names[no]= name;
        num[no]=n;
        no++;
      
     
      
    }

   // for show the user the info of the depart
    public String toString()
    {
        return ("\n-The name of Department is "+ this.name_depart+"\n"+ "-The Number of books is "+ this.no_books+"\n"+
        "-The date of building  "+ this.date+"\n"+"-The number of authors is "+ this.no_authors+"\n");

    }


 
    
 
   
    
}
