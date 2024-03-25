public class Categories{
    //menggunakan acces modifier private pada field atau atribut

    private int id;
    private String name;
    private boolean expensive;

    public Categories(int id, String name, boolean expensive) {
        super();
        this.id = id;
        this.name = name;
        this.expensive = expensive;
    }

    public Categories(){
        super();
    }

    //contih Getter dan Setter tipe data boolean

    //getter
    public boolean isExpensive(){
        return this.expensive;
    }

    //setter
    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }

    //contih Getter dan Setter tipe data object

    //getter
    public String getName(){
        return this.name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //contih Getter dan Setter tipe data primitif

    //getter
    public int getId(){
        return this.id;
    }
 
    //setter
    public void setId(int id){
        this.id = id;
    }
}