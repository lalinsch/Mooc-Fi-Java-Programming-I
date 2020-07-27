/**
 *
 * @author laloschjetnan
 */
public class Hideout<T> {
    private T object;
    
    public Hideout(){
        
    }
    
    public void putIntoHideout(T toHide){
        this.object = toHide;
    }
    
    public T takeFromHideout(){
        T taken = this.object;
        this.object = null;
        return taken;
    }
    
    public boolean isInHideout(){
        if(this.object == null){
            return false;
        }
        return true;
    }
    
}
