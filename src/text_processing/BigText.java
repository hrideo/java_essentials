/*
Text blocks: allow us to use three quotation marks(""") to open and close big block of text

- text cannot begin on same line as opening quote
 */
package text_processing;

public class BigText {

    public static void main(String[] args){
        String response = """
                [
                    {
                        "id": 123;
                        "customerID": 111;
                        "balance": 4930.00
                    }
                ]
                """;

        System.out.println(response);
    }
}
