package ExerciciosPOO.Exer01;

public interface ControleRemoto {

    void mudarCanal(int canal);
    void aumentarVolume (int taxa);
    void diminuirVolume (int taxa);
    boolean ligar();
    boolean desligar();
}
