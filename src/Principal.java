public class Principal {
    public static void main(String[] args){
        FactoryForma factoryForma = new FactoryForma();

        Forma forma1 = factoryForma.getForma("Triangulo");
        forma1.desenhar();

        Forma forma2 = factoryForma.getForma("Quadrado");
        forma2.desenhar();

        Forma forma3 = factoryForma.getForma("Circulo");
        forma3.desenhar();
    }
}
