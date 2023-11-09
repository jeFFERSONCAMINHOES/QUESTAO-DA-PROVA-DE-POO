import java.util.ArrayList;

public class Tecnic {
    private String TecnicNa ;
    private String TecnicFu;
    private ArrayList<Integer> codigosServicos;

    public Tecnic(String TecnicNa , String TecnicFu) {
        this.TecnicNa  = TecnicNa ;
        this.TecnicFu= TecnicFu;
        this.codigosServicos = new ArrayList<>();
    }

    public String getTecnicNa () {
        return TecnicNa ;
    }

    public String getTecnicFu() {
        return TecnicFu;
    }

    public void setTecnicFu(String TecnicFu) {
        this.TecnicFu = TecnicFu;
    }
    public void adicionarServico(int codigoServico) {
        codigosServicos.add(codigoServico);
    }

    public ArrayList<Integer> getCodigosServicos() {
        return codigosServicos;
    }

    public String getTecniNa() {
        return TecnicNa;
    }
}
    
