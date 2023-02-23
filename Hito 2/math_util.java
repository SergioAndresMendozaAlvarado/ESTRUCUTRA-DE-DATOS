public class math_util {
    private String nameApp;
    private String version;
    private int year;

    public math_util(String nameApp, String version, int year){
        this.nameApp = nameApp;
        this.version=version;
        this.year=year;
    }
    public void printApp(){
        System.out.println(
                this.nameApp+" - "+
                this.version+ "-"+
                this.year
        );
    }
    public void genNatNum(int limit){ //limit es una variable y el valor sera recibido
        for(int i = 0; i <= limit; i++){
            System.out.print(i);
        }
    }
    public void genNumPar(int limit){

    }
    public void getExtensionFromCI(int limit){

    }
}
