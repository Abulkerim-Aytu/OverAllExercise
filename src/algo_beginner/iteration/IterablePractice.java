package algo_beginner.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,23,4,5,1,2,3,4,5));

        //remove all th element that are less than 4

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) < 4 ){
                list.remove(i);
            }
        }
        System.out.println(list);


        System.out.println("-------------------------------------------");

        List<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
               Iterator<Integer> it =list2.iterator();
               boolean r1= it.hasNext(); //boolean
               System.out.println(r1);
        System.out.println(it.next()); //1

        boolean r2=it.hasNext();
        System.out.println(r2);
        System.out.println(it.next());//2

        System.out.println("-----------------------------------------");

        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        Iterator<Integer> i= list3.iterator();
        while (i.hasNext()){
            if (i.next()<4){
                i.remove();
            }
        }
        System.out.println(list3);


        System.out.println("------------------------------------------");
        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        for (Iterator<Integer>j= list4.iterator(); j.hasNext()  ; ) {
            if (j.next()<4){
                j.remove();
            }

        }
        System.out.println(list4);

        System.out.println("-----------------------------------------");
        List<Integer>list5=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));
        list5.removeIf (each -> each < 4 );
        System.out.println(list5);

    }

}
