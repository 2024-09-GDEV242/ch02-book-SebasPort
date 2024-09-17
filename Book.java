/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String details; 
    private String refnumbers = "";
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookRefnumber, int bookBorrowed, boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refnumbers = bookRefnumber;
        borrowed = bookBorrowed;
        courseText = isCourseText;
        
        
        
        
    }
    
     public String getAuthor(){
        return author;
     }
     public String getTitle(){
         return title;
     }
     public int getPages(){
         return pages;
     }
     public String printAuthor(){
         System.out.println( author );
         return author;
     }
     public String printTitle(){
         System.out.println( title );
         return title;
     }
     public String printDetails(){
         System.out.println("Title: " + title+"," + " Author:" + author+"," + " Pages:" + pages);
         System.out.println("Number of times borrowed: "+ borrowed);
         System.out.println("Book is course text: " + courseText);
             if (refnumbers.length() > 0){
             System.out.println("Reference number:" + refnumbers);
             
            }
            else {
                System.out.println("Reference number: ZZZ");
            }
         return details;
     }
     public void setRefNumber(String ref){
         if (refnumbers.length() > 3){
             ref = refnumbers;
          }
        else {
         System.out.println("ERROR: REFERENCE NUMBER MUST CONTAIN ATLEAST 3 CHARACTERS");
         }
    }

    public String getRefNumber(){
          return refnumbers;
     }
    public void borrowed(){
         borrowed++;
     }
    public int getBorrowed(){
        return borrowed;
        }
    public Boolean iscourseText(){
        return courseText;
    }
    // Add the methods here ...
}
