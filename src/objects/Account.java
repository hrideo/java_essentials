/*
Records: is special type of java class, that is great for simple objects that will only need fields(data)
and methods to access those fields

-don't need to create getter or setter for this; all of that is done for us under the covers
-records can be instantiated like classes
-records are immutable; so no setter methods generated for them
-records fields can be accessed; but they don't start with word get, just simply field names
(see POJOs)
 */
package objects;

public record Account(
        int id,
        int customerId,
        String type,
        double balance
) {
    public void aNewMethod() {
        //do something
    }

    public static void main(String[] args){
        Account account = new Account(13344,12212,"CHECKING", 4033.93);
        System.out.println(account);

        double balance = account.balance();
        System.out.println(balance);
    }
}
