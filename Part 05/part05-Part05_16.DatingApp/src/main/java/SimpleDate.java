
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    
    //advances the date by one day
    public void advance(){
        this.day++;
        
        //if after advancing the day is bigger than 30, resets the month to increases the month by one
        // and turns to the 1st day of the month
        if(this.day > 30){
            this.day = 1;
            this.month++;
        }
        
        
        //if the month count is 12, the year increases and the year us reset
        if(this.month > 12){
            this.month = 1;
            this.year ++;
        }
    }
    
    public void advance(int howManyDays){
        //repeats the advance function the number of times that is passed
        for(int i = 0; i < howManyDays; i++){
           this.advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        //creates a new SimpleDate object based on the current one, then uses the advance method and returns the result
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
