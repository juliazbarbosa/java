//correção exercicios JAVA
// main java

public class Main {
    public static void main(String[] args) {
        Dado d6 = new Dado();
        for(int i = 0; i < 10; i++){
            System.out.print(d6.rolar()+", ");
        }
        System.out.println();
        Circulo c = new Circulo();
        c.raio = 10;
        System.out.println(c.obterArea());
        Lampada l = new Lampada();
        l.ligar();
        System.out.println(l.ligado);
        l.desligar();
        System.out.println(l.ligado);
    }
}

// Exercicio 1: Modele uma classe que represente uma lˆampada. A classe deve ter um
//atributo indicando se a lˆampada est´a ligada ou desligada e m´etodos para
//poder ligar ou desligar. Crie o diagrama de classe da UML e o c´odigo java
//correspondente. Crie alguns objetos da classe e execute a a¸c˜ao de
//ligar/desligar.

public class Lampada {
    boolean ligado;
    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
}

//Exercicio 2: Modele uma classe que represente um c´ırculo. A classe deve ter um
//atributo indicando o seu raio e um m´etodo para calcular a sua ´area. Crie o
//diagrama de classe da UML e o c´odigo java correspondente. Crie alguns
//objetos da classe e calcule a sua ´area

public class Circulo {
    double raio;
    public double obterArea(){
        return Math.PI * Math.pow(raio, 2.0);
    }
}

//Modele uma classe que represente um dado de 6 faces. A classe deve ter
//um m´etodo que simule a a¸c˜ao de rolar um dado. Crie o diagrama de classe
//da UML e o c´odigo java correspondente. Crie alguns objetos da classe e
//execute a a¸c˜ao de rolar o dad
import java.util.Random;

public class Dado {

    Random random = new Random();

    public int rolar(){
        return random.nextInt(6) + 1;
    }

}
