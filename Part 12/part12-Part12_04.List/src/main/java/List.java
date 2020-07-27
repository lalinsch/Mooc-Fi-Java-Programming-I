
/**
 *
 * @author laloschjetnan
 */
public class List<Type> {
    //The instructions for this exercise were followed directly from the MOOC.fi course,
    //which explains step by step the constitution of a List object in Java

    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length){
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }
    
    public boolean contains(Type value){
        return indexOfValue(value) >= 0;
    }
    
    public void remove(Type value){
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0){
            return; //not found
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
    
    public int indexOfValue(Type value){
        for (int i = 0; i < this.firstFreeIndex; i++){
            if(this.values[i].equals(value)){
                return i;
            }
        }
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex){
        for(int i = fromIndex; i < this.firstFreeIndex - 1; i++){
            this.values[i] = this.values[i + 1];
        }
    }
    
    public Type value(int index){
        if(index < 0 || index >= this.firstFreeIndex){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is outside the range of the array");
        }
        return this.values[index];
    }
    
    public int size(){
        return this.firstFreeIndex;
    }

}
