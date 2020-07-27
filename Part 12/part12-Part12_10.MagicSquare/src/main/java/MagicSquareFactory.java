
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int currentRow = 0; //starting position for the magic square
        int currentCol = size / 2; //first value is in the middle of the square
        square.placeValue(currentCol, currentRow, 1); //places 1 in the middle of the top row

        for (int i = 2; i <= size*size  ; i++) { //for loop increases i until it is equal to size^2
            //using the siamese method, the next row is calculated as n-1
            int nextRow = currentRow - 1;
            //if this takes the row to a value below 0, it resets it to the bottom-most row (height-1)
            if (nextRow < 0) {
                nextRow = square.getHeight() - 1;
            }
            
            //then we calculate the next column, which is n+1
            int nextCol = currentCol + 1;
            //if this takes the column value to the further than the last column, it resets it to the first
            //column (0)
            if (nextCol == square.getWidth()) {
                nextCol = 0;
            }
            
            //once we have the new coordinates, we check if that box is already occupied with the "readValue"
            //helper provided in the magic square object
            int nextBoxValue = square.readValue(nextCol, nextRow);
            //if that box is already taken (it's not equal to 0), we reset the values to what they were before
            //and in this instance we only modify the row value in the opposite direction (+1)
            // the column value stays the same as in the previous value
            if (nextBoxValue != 0) {
                nextRow = currentRow + 1;
                nextCol = currentCol;
            }
            
            //once all of our conditions pass, we can place the i value using the placeValue method 
            square.placeValue(nextCol, nextRow, i);
            //and finally we let the program know the current value of the coordinates so that it can carry on
            //looping until the end.
            currentRow = nextRow;
            currentCol = nextCol;
        }

        return square;
    }

}
