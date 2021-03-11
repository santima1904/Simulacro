package enums;

public enum Nivel {
    BAJO(0.15), MEDIO(0.25), ALTO(0.35);

    private double cte;

    Nivel(double cte){this.cte = cte;}

    public double getCte() {
        return cte;
    }
}
