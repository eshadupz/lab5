public class SequenceDriver
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence();
      firstSequence.add(1);
      firstSequence.add(4);
      firstSequence.add(9);
      firstSequence.add(16);
      System.out.print("First before: ");
      System.out.println(firstSequence);

      Sequence secondSequence = new Sequence();
      secondSequence.add(9);
      secondSequence.add(7);
      secondSequence.add(4);
      secondSequence.add(9);
      secondSequence.add(11);
      System.out.print("Second before: ");
      System.out.println(secondSequence);

      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.println("Appended:" + combinedSequence);
      System.out.println("Expected: [1, 4, 9, 16, 9, 7, 4, 9, 11]");

      System.out.print("First after: ");
      System.out.println(firstSequence);

      System.out.print("Second after: ");
      System.out.println(secondSequence);

      System.out.println("Merged:" + firstSequence.merge(secondSequence).toString());
      System.out.println("Expected: [1, 9, 4, 7, 9, 4, 16, 9, 11]");

   
      System.out.println("Merged + Sorted:" + firstSequence.mergeSorted(secondSequence).toString());
      System.out.println("Expected: [1, 4, 4, 7, 9, 9, 9, 11, 16]");

      Sequence seq2 = new Sequence();
      seq2.add(1);
      seq2.add(4);
      seq2.add(9);
      seq2.add(16);
      seq2.add(9);
      seq2.add(7);
      seq2.add(4);
      seq2.add(9);
      seq2.add(11);
      seq2.removeDuplicates();
      System.out.println("Remove Duplicates:" + seq2);
      System.out.println("Expected: [1, 4, 7, 9, 11, 16]");

 

}
 

/*
      ArrayList<Integer> list = new ArrayList<>(Arrays.asList(combinedSequence));
      System.out.println("ArrayList with duplicates: " + combinedSequence);
      ArrayList<Integer> newList = removeDuplicates(combinedSequence);
      System.out.println("ArrayList with duplicates removed: " + newList); */



   }
