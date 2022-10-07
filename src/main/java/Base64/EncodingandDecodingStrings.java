package Base64;


import org.apache.commons.codec.binary.Base64;

public class EncodingandDecodingStrings {

    public static void main(String[]args){

        String Password = "Test@123";

        byte[] encodedstring = Base64.encodeBase64(Password.getBytes());
        System.out.println("Encoded string "+new String(encodedstring));

        byte[] decodedstring = Base64.decodeBase64(encodedstring);
        System.out.println("Decoded string "+new String(decodedstring));

    }

}
