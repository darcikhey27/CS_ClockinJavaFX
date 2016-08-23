package student;

public interface ListInterface
{
   public int getSize();
   
   public boolean isEmpty();
   
   public void addNode(Object newItem);
   
   public void addNode(int index, Object newItem);
   
   public void removeNode(int index);
   
   public void removeAll();
   
   public String toString();
}