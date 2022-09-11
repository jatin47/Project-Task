package sep082022;

public class PrimaryCard {

    public static void main(String[] args) {
        
    long cardNo = 1236478965284566L;
    char[] arr = Long.toString(cardNo).toCharArray();

        for(int i = 0;i <= arr.length-1;i++){
            if(arr[12] == 0 && arr[13] == 0){
                System.out.println("This card is primary card");
            }
        }
        System.out.println("This is not primary card");
    }

}
