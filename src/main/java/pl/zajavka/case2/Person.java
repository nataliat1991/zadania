package pl.zajavka.case2;

record Person(String name, String surname) {

    public String whatIsYourJob() {
        return "Software developer!";
    }

    public Boolean doYouLikePizza() {
        return true;
    }
}
