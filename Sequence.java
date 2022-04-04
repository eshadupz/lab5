import java.util.ArrayList;
import java.util.*;  

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

   public void add(int n)
   {
      values.add(n);
   }

   public String toString()
   {
      return values.toString();
   }

   public Sequence append(Sequence other) {

      Sequence list1 = new Sequence();
         for (int value : this.values) {
            list1.add(value);
         }
         for (int value : other.values) {
            list1.add(value);
         }

      return list1;
   }

   public Sequence merge(Sequence other) {

      ArrayList<Integer> list1 = this.values;
      ArrayList<Integer> list2 = other.values;
      Sequence s = new Sequence();

      if (list1.size() < list2.size()) {
         int i = 0;
         for (i = 0; i < list1.size(); i++) {
            s.add(list1.get(i));
            s.add(list2.get(i));
         }

      while(i<list2.size()){
         s.add(list2.get(i));
         i = i + 1;
      }
   }
      else if(list1.size()==list2.size()){
         int i = 0;

      for (i = 0; i < list1.size(); i++) {
         s.add(list1.get(i));
         s.add(list2.get(i));
      }
   }
   else {
      int i =0;

   for (i = 0; i < list2.size(); i++) {
      s.add(list1.get(i));
      s.add(list2.get(i));
   }

   while(i<list1.size()){
      s.add(list1.get(i));
      i = i + 1;
   }
   
   }
return s;
}


public Sequence mergeSorted(Sequence other) {

   ArrayList<Integer> list1 = this.values;
   ArrayList<Integer> list2 = other.values;

   Collections.sort(list1);
   Collections.sort(list2);
   Sequence s = new Sequence();

   if (list1.size() < list2.size()) {
      int i = 0;
      for (i = 0; i < list1.size(); i++) {
         s.add(list1.get(i));
         s.add(list2.get(i));
      }
         while (i < list2.size()) {
            s.add(list2.get(i));
            i = i + 1;
         }
   } 

   else if (list1.size() == list2.size()) {
      int i = 0;
      for (i = 0; i < list1.size(); i++) {
         s.add(list1.get(i));
         s.add(list2.get(i));
      }
   } 

   else {
      int i = 0;
      for (i = 0; i < list2.size(); i++) {
         s.add(list1.get(i));
         s.add(list2.get(i));
      }

      while (i < list1.size()) {
         s.add(list1.get(i));
         i = i + 1;
      }
   }

   Collections.sort(s.values);
   return s;

}

public void removeDuplicates() {
   Sequence s = new Sequence();
   for (int i = 0; i < this.values.size(); i++)
   {
      if (s.values.contains(this.values.get(i)))
      {
      }
      else {
         s.values.add(this.values.get(i));
      }
   }
   this.values = s.values;
}
}








