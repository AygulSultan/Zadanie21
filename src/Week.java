public enum Week {
    SANDAY("Jekshenbi"),
    MONDAY("Duyshonbu"),
    TUESDAY("Sheyshembi"),
    WEDNESDAY("Sharshembi"),
    THURSDAY("Beyshembi"),
    FRIDAY("juma"),
    SATURDAY("ishembi");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
