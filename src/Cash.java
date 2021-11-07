public class Cash {
    String name;
    String prof;
    int cash;

    public Cash(String name, String prof, int cash) {
        this.name = name;
        this.prof = prof;
        this.cash = cash;
    }

    String showInfo(int i) {
        return "Сотрудник "+ name+" должность "+prof+ " за "+i +" месяцев заработал "+cash*i +" денег.";
    }
}
