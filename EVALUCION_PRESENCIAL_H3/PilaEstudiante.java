package defensa_pilas_hito3;

public class PilaEstudiante {

    private int max;
    private int top;
    private Estudiante[] estudiantes;

    public PilaEstudiante(){
        this.max = 10;
        this.top = 0;
        this.estudiantes = new Estudiante[this.max +1];

    }
    public boolean EsVacio(){
        if(this.top == 0 ){
            return true;
        }else{
            return false;
        }
    }

    public boolean EsLleno(){
        if(this.top == this.max ){
            return true;
        }else{
            return false;
        }
    }

    public int NroElementos(){

        return top;
    }

    public void Adicionar(Estudiante nuevoEstudiante) {
        if(this.EsLleno()){
            System.out.println("Pila deestudiantes llena");
        }else{
            this.top = this.top +1;
            this.estudiantes[this.top] = nuevoEstudiante;
        }
    }

    public Estudiante eliminar(){
        Estudiante estudianteEliminado = null;

        if(!EsVacio()){
            estudianteEliminado = estudiantes[top];
            this.top = this.top -1;
        } else {
            System.out.println("Pila de libros vacia");
        }
        return estudianteEliminado;
    }

    public int eliminar_1(){
        return 0;
    }
    public void Vaciar(PilaEstudiante pila){
        while(!pila.EsVacio()){
            Adicionar(pila.eliminar());
        }
    }
    public void Mostrar(){
        Estudiante estudiante = null;
        if(this.EsVacio()){
            System.out.println("Pila vacia, no hay items que mostrar");
        }else{
            System.out.println("Mostrando la Pila de libros: ");
            PilaEstudiante aux = new PilaEstudiante();
            while(!EsVacio()){
                estudiante = eliminar();
                aux.Adicionar(estudiante);
                estudiante.motrarEstudiante();
            }
            Vaciar(aux);
        }
    }

    public int nroElem(){
        return top+1;
    }
}
