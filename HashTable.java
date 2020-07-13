import java.util.LinkedList;

public class HashTable{

  // create a hash table object class 
  public static class HTObject{
    public String key;
    public Integer value;
  }

  // create and init the array
  public static final int ARR_SIZE = 128;
  // create an array of linked lists of type HTObject
  LinkedList<HTObject>[] table = new LinkedList[ARR_SIZE];

  // create a constructor
  public HashTable(){
    // init the vals in the array
    for (int i = 0; i < ARR_SIZE; i++){
      table[i] = null; 
    }
  }

  private HTObject getObj(String key){
    if (key == null){
      return null;
    }

    // calculate the index of the key with the hashCode
    int index = key.hashCode() % ARR_SIZE;
    LinkedList<HTObject> items = table[index];

    // if the linked list is null, return null
    if (items == null){
      return null;
    }
    // if the key is found in linked list return the item
    for (HTObject item: items){
      if (item.key.equals(key)){
        return item;
      }
    }
    // if not, return null
    return null;
  }

  public void put(String key, Integer value){
    // calculate the index of the key witht the hashCode
    int index = key.hashCode() % ARR_SIZE;
    LinkedList<HTObject> items = table[index];

    // if the linked list is null, add the item
    if (items == null) {
      items = new LinkedList<HTObject>();
      HTObject item = new HTObject();
      item.key = key;
      item.value = value;
      items.add(item);
      items.add(item);
      arr[index] = items;
    }
    else {
      // update the value if the key is already in the array
      for (HTObject item: items){
        if (item.key.equals(key)){
          item.value = value;
          return;
        }
      }
    }
    // add a new item if the key was not found in the array
    HTObject item = new HTObject();
    item.key = key;
    item.value = value;
    items.add(item);
  }

  public void delete(String key){
    // calculate the index of the key with the hashCode
    int index = key.hashCode() % ARR_SIZE;
    LinkedList<HTObject> items = table[index];

    // if the linked list is null, return null
    if (items == null){
      return null;
    }
    for (HTObject item: items){
      if (item.key.equals(key)){
        item.remove(item);
        return;
      }
    }
  }




}