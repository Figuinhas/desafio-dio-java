package desafio_poo_dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    
    private LocalDate data;

    
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }


    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }



    

    

}
