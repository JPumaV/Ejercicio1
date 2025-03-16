public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(Math.min(c1.getX(), c2.getX()), Math.min(c1.getY(), c2.getY()));
        this.esquina2 = new Coordenada(Math.max(c1.getX(), c2.getX()), Math.max(c1.getY(), c2.getY()));
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public double calcularArea() {
        double base = Math.abs(esquina1.getX() - esquina2.getX());
        double altura = Math.abs(esquina1.getY() - esquina2.getY());
        return base * altura;
    }

    @Override
    public String toString() {
        return "([" + esquina1 + "], [" + esquina2 + "])";
    }
}
