package sep092022;

public class VowelCount {
    public static void main(String[] args) {
        String str ="Top brands for Phones and Electronics. Latest trends in Fashion. Free Shipping available* Vast selection. Best prices.";

        // //Cahracter count without space
        int charCount = str.replace(" ", "").length();
        System.out.println(charCount);

        // //Word count
        String[] word = str.split(" ");
        int count = 0;
        for (String s : word) {
            count++;
        }
        System.out.println(count);

        // //Vowels count
        str = str.toLowerCase();
        int vowelCount = 0;
        for(int i = 0;i <= str.length()-1;i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);

    }
    

}
