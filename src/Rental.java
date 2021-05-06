class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    double getCharge() {
        return getMovie().price.getCharge(getDaysRented(), getMovie());
    }

    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }
}