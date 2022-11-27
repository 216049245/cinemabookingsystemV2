package za.ac.cput.cinemabookingsystem.domain.lookup;

public class Movie {

    private final String id, name;
    private Movie(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private String id, name;
    }
}
