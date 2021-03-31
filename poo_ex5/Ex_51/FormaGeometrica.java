package poo_ex5.Ex_51;

/*
 */
public abstract class FormaGeometrica {
    
    private float area;
    private float perimetro;
    
    public FormaGeometrica(){}

    public FormaGeometrica(float area,float perimetro){
        this.area=area;
        this.perimetro=perimetro;
    }
    
    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setArea(float area) {
        this.area=area;
    }
    
    public void setPerimetro(float perimetro) {
        this.perimetro=perimetro;
    }
    
    abstract void calcularArea();
    
    abstract void calcularPerimetro();
    
}
