// main java

public class Main {
    public static void main(String[] args) {
        //              -> Construtor
        Retangulo r = new Retangulo();
        r.setLargura(-10);
        r.setAltura(-10);
        Retangulo r2 = new Retangulo(-10,-20);
        r2.setAltura(10);
        System.out.println(r2.getAltura());
        System.out.println(r2.getLargura());
        System.out.println(r2.isQuadrado());
    }
}
//Modele uma classe que represente um retˆangulo. O retˆangulo n˜ao pode ter uma dimens˜ao negativa.

public class Retangulo {
    private double largura;
    private double altura;

    // Construtor gerado automaticamente
    // Não parametros
    // corpo vazio
    public Retangulo(){
        System.out.println("Construtor");
    }

    //
    public Retangulo(double altura, double largura){
        // this -> referência ao seu próprio objeto
        setAltura(altura);
        setLargura(largura);
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if(altura < 0) return; // Encerra a execução do método.
        this.altura = altura;
    }
    public void setLargura(double largura){
        if(largura >= 0) {
            this.largura = largura;
        }
    }
    public double getLargura(){
        return largura;
    }

    public boolean isQuadrado(){
        return largura == altura;
    }

}


