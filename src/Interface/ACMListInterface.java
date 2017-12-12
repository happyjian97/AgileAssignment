package Interface;
/**
 *
 * @author Tan Eu Tim
 */
public interface ACMListInterface<T> {

  public boolean add(T newEntry);

  public boolean add(int newPosition, T newEntry);
  //Delete Data
  public T remove(int givenPosition);

  public void clear();

  public boolean replace(int givenPosition, T newEntry);

  //Get Position
  public T getEntry(int givenPosition);

  //Check Whether list contains a given entry.
  public boolean contains(T anEntry);

  //Gets the number of entries in the list.
  public int getNumberOfEntries();

  //Check whether the list is empty.
  public boolean isEmpty();

  //Check whether the list is full.
  public boolean isFull();
}
