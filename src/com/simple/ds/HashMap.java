package com.simple.ds;

public class HashMap<K,V> {

  private Entry<K,V>[] buckets;
  private static int INITIAL_CAPACITY = 10;
  
  HashMap(){
    buckets = new Entry[INITIAL_CAPACITY];
    
  }
 void printAll(){
   for(int i=0;i<INITIAL_CAPACITY;i++){
     Entry<K, V> entry = buckets[i];
     while(entry !=null){
       System.out.println(entry.key + " " + entry.value);
       entry = entry.next;
     }
   }
 }
  void put(K key,V value){
    int bucket = key.hashCode() % 10;
    Entry<K, V> newEntry = new Entry<K,V>(key, value);
    if(buckets[bucket] == null){
      buckets[bucket]= newEntry;
      System.out.println("Added Key " + newEntry.key + " at " + bucket + " bucket" + " and " + 0 + " index");
    }else{
      Entry<K, V> entry = buckets[bucket];
      int cnt = 1;
      while(entry.next != null){
        entry = entry.next;
        cnt+=1;
      }
      entry.next = newEntry;
      System.out.println("Added Key " + newEntry.key + " at " + bucket + " bucket" + " and " + cnt + " index");
    }
  }
  
  V get(K key){
    int bucket = key.hashCode() % 10;
    if(buckets[bucket] == null){
      System.out.println("Not available at bucket " + bucket);
      return null;
    }
    Entry<K, V> entry = buckets[bucket];
    
    while(entry != null){
      
      if(entry.key.equals(key)){
        return entry.value;
      }
      entry = entry.next;
    }
    System.out.println("Not available in all buckets at " + bucket);
    return null;
  }
 
  class Entry<K, V> {
    final K key;
    V value;
    Entry<K,V> next;

    Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}
