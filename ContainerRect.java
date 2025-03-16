public class ContainerRect {
    private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private int numRec;

    public ContainerRect(int n) {
        this.n = n;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
        this.numRec = 0;
    }

    public boolean addRectangulo(Rectangulo r) {
        if (numRec < n) {
            rectangulos[numRec] = r;
            distancias[numRec] = r.getEsquina1().distancia(r.getEsquina2());
            areas[numRec] = r.calcularArea();
            numRec++;
            return true;
        } else {
            System.out.println("⚠️ No se puede agregar más rectángulos. Capacidad máxima alcanzada.");
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectángulo | Coordenadas | Distancia | Área\n");
        sb.append("-------------------------------------------------\n");
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1) + ". " + rectangulos[i] + " | "
                    + String.format("%.3f", distancias[i]) + " | "
                    + String.format("%.2f", areas[i]) + "\n");
        }
        return sb.toString();
    }
}