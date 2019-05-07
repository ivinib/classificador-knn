package br.edu.uniopet.classificadorknn.model;

public class IrisVersicolor {

    Double ponto1;
    Double ponto2;
    Double ponto3;
    Double ponto4;

    public IrisVersicolor() {
    }

    public IrisVersicolor(Double ponto1, Double ponto2, Double ponto3, Double ponto4) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;
        this.ponto4 = ponto4;
    }

    public Double getPonto1() {
        return ponto1;
    }

    public void setPonto1(Double ponto1) {
        this.ponto1 = ponto1;
    }

    public Double getPonto2() {
        return ponto2;
    }

    public void setPonto2(Double ponto2) {
        this.ponto2 = ponto2;
    }

    public Double getPonto3() {
        return ponto3;
    }

    public void setPonto3(Double ponto3) {
        this.ponto3 = ponto3;
    }

    public Double getPonto4() {
        return ponto4;
    }

    public void setPonto4(Double ponto4) {
        this.ponto4 = ponto4;
    }

    @Override
    public String toString() {
        return "IrisSetosa{" +
                "ponto1=" + ponto1 +
                ", ponto2=" + ponto2 +
                ", ponto3=" + ponto3 +
                ", ponto4=" + ponto4 +
                '}';
    }
}
