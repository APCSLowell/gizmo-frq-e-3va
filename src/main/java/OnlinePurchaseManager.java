import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
    /* to be implemented in part (a) */
    int total = 0;
    for(Gizmo g: purchases) {
      if(g.getMaker().equals(maker) && g.isElectronic())
        total++;
    }
    return total;
  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
    /* to be implemented in part (b) */
    for(int i = 0; i < purchases.size()-1; i++) {
      Gizmo g1 = purchases.get(i);
      Gizmo g2 = purchases.get(i+1);
      if(g1.equals(g2))
        return true;
      else return false;
    }
  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
