public abstract class Library {
 
   

   //for show the user the departs in the library and thier name
    public   static   void get_depart()
{
     int j=1;
    System.out.println(" The No of Department in our Library is  "+ Depart.no+"\n"+" And their name is: ");
    for(int i=0;i<Depart.no;i++)
    {
        System.out.println( j+")- "+Depart.names[i]);
        j++;
    }


}


}
