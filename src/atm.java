public class atm{

    public static int totalMoney = 0;
    public static int numATMs = 0;
    public int money;


    public atm(int inputMoney){
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;

    }

    public static void main(String[] args){
        atm first_atm = new atm(100);
        atm second_atm = new atm(200);
        atm third_atm = new atm(300);
        atm fourth_atm = new atm(400);
        atm fifth_atm = new atm(500);


        System.out.println("first_atm: " + first_atm.money);
        System.out.println("second_atm: " + second_atm.money);
        System.out.println("third_atm: " + third_atm.money);
        System.out.println("fourth_atm: " + fourth_atm.money);
        System.out.println("fifth_atm: " + fifth_atm.money);

        System.out.println("total num of atms: " + atm.numATMs);
        System.out.println("total amount of money in all atms: "  + atm.totalMoney);


    }
}