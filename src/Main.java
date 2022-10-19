public class Main {
    public static void main(String[] args) {
        int ticketCostAmount = -20;
        int milesAmount = ticketCostAmount/20;

        if (milesAmount <= 0) {
            milesAmount = 0;
        }

        System.out.println("Количество начисленных миль: "+milesAmount);
    }
}