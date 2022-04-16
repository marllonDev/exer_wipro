package ExerciciosPOO.Exer03;

public class Principal {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();


        System.out.println(retangulo.area(2.5, 10.5));
        System.out.println(circulo.area(2.5, 6.0));
        System.out.println(quadrado.area(1.7, 20.8));
        System.out.println(trianguloRetangulo.area(6.6, 4.7));

    }
}
