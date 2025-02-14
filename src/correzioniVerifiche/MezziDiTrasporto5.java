package correzioniVerifiche;

/**
 * Verifica
 *
 * @author luca.negriolli 4INA
 * @version 1.0
 */
public class MezziDiTrasporto5 {

    private final Float COEFF_CONV_DA_CV_A_KW = 0.73f;
    private Integer cavalli;
    private Integer cilindrata;
    private String colore;
    private String marca;
    private static int numeroIstanze;

    public MezziDiTrasporto5() {
        numeroIstanze++;
    }

    public MezziDiTrasporto5(Integer cavalli, Integer cilindrata, String colore, String marca) throws Exception {
        setCavalli(cavalli);
        setCilindrata(cilindrata);
        setColore(colore);
        setMarca(marca);
        numeroIstanze++;
    }

    public MezziDiTrasporto5(MezziDiTrasporto5 m) throws Exception {
        setCavalli(m.cavalli);
        setCilindrata(m.cilindrata);
        setColore(m.colore);
        setMarca(m.marca);
        numeroIstanze++;
    }

    public Integer getCavalli() {
        return cavalli;
    }

    public void setCavalli(Integer cavalli) throws Exception {
        if (cavalli != null) {
            if (cavalli >= 6 && cavalli <= 1500) {
                this.cavalli = cavalli;
            } else {
                throw new Exception("Valore dei cavalli Errato!");
            }
        } else {
            throw new Exception("Cavalli Nulli!");
        }
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) throws Exception {
        if (cilindrata != null) {
            switch (cilindrata) {
                case 1000:
                    this.cilindrata = cilindrata;
                    break;
                case 1500:
                    this.cilindrata = cilindrata;
                    break;
                case 2000:
                    this.cilindrata = cilindrata;
                    break;
                default:
                    throw new Exception("Valore della cilindrata Errato!");
            }
        } else {
            throw new Exception("Cilindrata Nulla!");
        }
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) throws Exception {
        if (colore != null) {
            if (colore.equalsIgnoreCase("bianco") || colore.equalsIgnoreCase("rosso") || colore.equalsIgnoreCase("nero")) {
                this.colore = colore;
            } else {
                throw new Exception("Colore Errato!");
            }
        } else {
            throw new Exception("Colore Nullo!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Exception {
        if (marca != null) {
            if (marca.length() >= 3) {
                if (marca.equals(marca.toUpperCase())) {
                    this.marca = marca;
                } else {
                    throw new Exception("Marca non accettabile!");
                }
            } else {
                throw new Exception("Lunghezza della marca non accettabile");
            }
        } else {
            throw new Exception("Marca Nulla!");
        }
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer calcolaKw() throws Exception {
        Integer kw;

        if (cavalli != null) {
            kw = (int) (cavalli * COEFF_CONV_DA_CV_A_KW);
        } else {
            throw new Exception("Impossibile eseguire il calcolo!");
        }

        return kw;
    }

    public String info() {
        String testo = "";

        if (cavalli != null) {
            testo += "Cavalli: " + cavalli + "\n";
        }
        if (cilindrata != null) {
            testo += "Cilindrata: " + cilindrata + "\n";
        }
        if (colore != null) {
            testo += "Colore: " + colore + "\n";
        }
        if (marca != null) {
            testo += "Marca: " + marca + "\n";
        }

        return testo;
    }
}
