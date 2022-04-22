public class Car {

    private String company;
    private String model;
    private int year;

    public Car(String company, String model, int year) {   //this. towrzy nowe zmienne w metodzie mimo zastosowania
        // ich wczesniej w klasie
        this.company = company;
        this.model = model;
        this.year = year;
        System.out.println(company + " " + model + " " + year);

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!company.equals(car.company)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = company.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}