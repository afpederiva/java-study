package lab;

public class Musician extends Person {

    private String instrument;

    private void validateInstrument(String instrument) {

        if (instrument == null) {
            throw new IllegalArgumentException("instrument cannot be null");
        }

        if (instrument.isBlank()) {
            throw new IllegalArgumentException("instrument cannot be blank");
        }
    }

    public Musician(String instrument) {
        validateInstrument(instrument);
        this.instrument = instrument;
    }

    public void setInstrument(String instrument) {
        validateInstrument(instrument);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " and I play " +getInstrument() + ".");
        System.out.println("My favorite person is " + getFavoritePerson().getName());
    }

}