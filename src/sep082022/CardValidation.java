package sep082022;

// 1. If the cardnumber length is not 16 then throw user defined exception "invalid cardnumber"

// 2. Cardnumber should be print as : XXXXXXXXXX654098

public class CardValidation {
    public static void main(String[] args) {

        long cardNo = 1236478965284566L;
        System.out.println(cardNoSize(cardNo));
        
        //Card No Masking
        String number = cardNo + "";
        String mask = number.replaceAll("\\w(?=\\w{6})", "*");
        System.out.println(mask);
        
        //Card Validity
        try {
            cardValidity(cardNo);
        }catch (InvalidCardException e){
            System.out.println(e);
        }

    }
    public static  void cardValidity(long l) throws InvalidCardException {
        if(cardNoSize(l) <16 || cardNoSize(l) > 16){
            throw  new InvalidCardException("card no is wrong");
        }else {
            System.out.println("Card no is valid");
        }
    }
    public  static int cardNoSize(long l){
        String s = l + "";
        return s.length();
    }
}
class InvalidCardException extends Throwable {
    InvalidCardException(String message){
        System.out.println(message);

    }
}

