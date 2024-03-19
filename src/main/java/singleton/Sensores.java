package singleton;

public class Sensores {

    private Sensores() {}
    private static Sensores instance = new Sensores();

    public static Sensores getInstance() {
        return instance;
    }

    private String nomeRede;
    private int quantidadeSensores;
    private boolean ligada;

    public String getNomeRede() {
        return nomeRede;
    }

    public void setNomeRede(String nomeRede) {
        this.nomeRede = nomeRede;
    }

    public int getQuantidadeSensores() {
        return quantidadeSensores;
    }

    public void setQuantidadeSensores(int quantidadeSensores) {
        this.quantidadeSensores = quantidadeSensores;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Rede de sensores " + nomeRede + " ligada.");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Rede de sensores " + nomeRede + " desligada.");
    }

    // Outros métodos específicos para a rede de sensores...

}
