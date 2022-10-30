package sarmalamaerisim;

public class AccountClient {

    public void withdrawMoney(Account account, double amount) {
        System.out.println(amount + " TL para çekilmiştir.");
    }

    public void payIntoMoney(Account account, double amount) {
        System.out.println(amount + " TL  para yatırılmıştır.");
        return;
    }

    public void transfer(Account myAccount, Account transferAccount, double amount) {
        if (myAccount.getBalance() < (amount)) {
            System.out.println("Havale işlemi yapılamadi");
            return;
        }

        System.out.println(amount + "TL miktarında havale işlemi yapılmıştır.");

    }

}