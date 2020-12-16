public class FactoryForma {
    public Forma getForma(String nomeForma){
        if(nomeForma == null){
            return null;
        }
        if(nomeForma.equals("Circulo")){
            return new Circulo();
        }else if(nomeForma.equals("Quadrado")){
            return new Quadrado();
        }else if(nomeForma.equals("Triangulo")){
            return new Triangulo();
        }
        return null;
    }

    //A classe que vai decidir se vai instanciar uma classe Quadrado, Circulo ou Triangulo
}
