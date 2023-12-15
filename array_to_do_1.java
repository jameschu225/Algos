import java.util.Arrays;

public class array_to_do_1{
    public int[] pushFront(int[] list, int newNumber){
        int[] newlist = new int[list.length+1];
        newlist[0] = newNumber;
        for (int i=1;  i < newlist.length;  i++){
            newlist[i] = list[i-1];
        }
    return newlist;
    }

    public int popFront(int[] list){
        int[] newList = new int[list.length-1];
        int removedInt = list[0];
        for (int i=0;  i < newList.length;  i++){
            newList[i] = list[i+1];
        }
        System.out.println(Arrays.toString(newList));
        return removedInt;
    }

    public int[] insertAt(int[] list, int atIndex, int insetNumber){
        if (atIndex>=0){
            int[] newList = new int[list.length+1];
                    int j=0;
                    for (int i=0; i<newList.length; i++){
                        if (i == atIndex){
                            newList[atIndex] = insetNumber;
                        } else{
                            newList[i] = list[j];
                            j++;
                        }
                    }
                    return newList;
        } else {
            return null;
        }
    }

    public int remoteAt(int[] list, int atIndex){
        if (atIndex>=0){
            int[] newList = new int[list.length-1];
                    int removedInt =0;
                    int j=0;
                    for (int i=0; i<newList.length; i++){
                        if (i == atIndex){
                            removedInt = list[atIndex];
                            j++;
                            newList[i] = list[j];
                        } else{
                            newList[i] = list[j];
                            j++;
                        }
                    }
                    System.err.println(Arrays.toString(newList));
                    return removedInt;
        } else {
            return -1;
        }
    }

    public int[] swapPairs(int[] list){
        if (list.length%2 == 0){
            for (int i=0; i<list.length;i++){
                int temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
                i +=2;
            }
            return list;
        }else{
            for (int i=0; i<list.length-1;i +=2){
                int temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
            }
            return list;
        }
    }

    public int[] removeDuplicate(int[] list){
        int[] newList= new int[list.length];
        int j =0;
        for(int i=0; i<list.length; i++){
            if(i!=list.length-1){
                if(list[i]==list[i+1]){
                    continue;
                }else{
                    newList[j]=list[i];
                    j++;
                }
            } else {
                newList[j]=list[i];
            }
        }
        int k = newList.length-1;
        while (k!=j){
            newList = this.remoteAt1(newList, j+1);
            k--;
        }
        return newList;
    }


    public int[] remoteAt1(int[] list, int atIndex){
        if (atIndex>=0){
            int[] newList = new int[list.length-1];
                    int removedInt=0;
                    int j=0;
                    for (int i=0; i<newList.length; i++){
                        if (i == atIndex){
                            removedInt = list[atIndex];
                            j++;
                            newList[i] = list[j];
                        } else{
                            newList[i] = list[j];
                            j++;
                        }
                    }
                    return newList;
        } else {
            return null;
        }
    }
}