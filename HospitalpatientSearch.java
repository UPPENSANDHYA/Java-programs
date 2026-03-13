public class HospitalPatientSearch1 {
    public static int linearSearch(int[] list,int patientID,int[] comparisons){
        for (int i=0;i<list.length;i++){
            comparisons[0]++;
            if(list[i]==patientID)return i;
        }
        return -1;
    }
    public static int binarySearch(int[] sortedList,int patientID,int[] comparisons){
        int left=0,right=sortedList.length-1;
        while(left<=right){
            comparisons[0]++;
            int mid=(left+right)/2;
            if(sortedList[mid]==patientID)return mid;
            else if(sortedList[mid]<patientID)left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] generalList={105,203,401,150,302};
        int[] emergencyList={101,150,203,302,401};
        int targetID=302;
        int[] linearComparisons={0};
        int linearPos=linearSearch(generalList,targetID,linearComparisons);

        int[] binaryComparisons={0};
        int binaryPos=binarySearch(emergencyList,targetID,binaryComparisons);

        System.out.println("Searching for Patient ID:"+targetID);
        System.out.println();
        System.out.println("Generalwaiting list(unsorted)-LinearSearch:");
        if(linearPos!=-1) {
            System.out.println("Position found:" + linearPos);
        }
        else {
            System.out.println("Patient not found");
        }
        System.out.println("Comparisons made:"+linearComparisons[0]);
        System.out.println("Tiem Complexity:O(n)");
        System.out.println();

        System.out.println("Emergency register(sorted)-Binary Search:");
        if(binaryPos!=-1){
            System.out.println("Position found:"+binaryPos);
        }
        else {
            System.out.println("Comparisons made:"+binaryComparisons[0]);
            System.out.println("Time Complexity:O(logn)");
        }
    }
}
