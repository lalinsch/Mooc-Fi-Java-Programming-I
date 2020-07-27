

/**
 *
 * @author laloschjetnan
 */
public class HashMap<K, V>{
    //The methods in this class were followed step by step by the exercise in Part 12 of the Mooc.Fi
    //Java Programming course
    private List<Pair<K,V>>[] values;
    private int firstFreeIndex;
    
    public HashMap(){
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }
    
    public V get(K key){
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if(this.values[hashValue] == null){
            return null;
        }
        
        List<Pair<K,V>> valuesAtIndex = this.values[hashValue];
        
        for (int i = 0; i < valuesAtIndex.size(); i++){
            if(valuesAtIndex.value(i).getKey().equals(key)){
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }
    
    public void add(K key, V value){
        List<Pair<K,V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        
        if (index < 0){
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else{
            valuesAtIndex.value(index).setValue(value);
        }
        
        if(1.0 * this.firstFreeIndex / this.values.length > 0.75){
            grow();
        }
    }
    
    private List<Pair<K,V>> getListBasedOnKey(K key){
        int hashValue = Math.abs(key.hashCode() & values.length);
        if(values[hashValue] == null){
            values[hashValue] = new List<>();
        }
        
        return values[hashValue];
    }
    
    private int getIndexOfKey(List<Pair<K,V>> myList, K key){
        for(int i = 0; i < myList.size() ; i++){
            if(myList.value(i).getKey().equals(key)){
                return i;
            }
        }
        return -1;
    }
    
    public void grow(){
        List<Pair<K,V>>[] newValues = new List[this.values.length*2];
        
        for(int i = 0; i < this.values.length; i++){
            copy(newValues, i);
        }
        
        this.values = newValues;
    }
    
    private void copy(List<Pair<K,V>>[] newArray, int fromIndex){
        for(int i = 0; i < this.values[fromIndex].size(); i++){
            Pair<K,V> value = this.values[fromIndex].value(i);
            
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if(newArray[hashValue] == null){
                newArray[hashValue] = new List<>();
            }
            
            newArray[hashValue].add(value);
        }
    }
    
    public V remove(K key){
        List <Pair<K,V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0){
            return null;
        }
        
        int index = getIndexOfKey(valuesAtIndex, key);
        if(index < 0){
            return null;
        }
        
        Pair <K,V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

}
