public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("The phone starts with +");
        }
        
        else if(telephone.length() != 12) {
            throw new PhoneException("The length of the phone must be 11");
        }
    }   
}