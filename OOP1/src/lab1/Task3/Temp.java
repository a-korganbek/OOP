package lab1.Task3;
class Temp{
    private double value;
    private char scale;
    public Temp(){
        this.value = 0;
        this.scale = 'C';
    }
    public Temp(double value){
        this.value = value;
        this.scale = 'C';
    }
    public Temp(char scale){
        this.value = 0;
        setScale(scale);
    }
    public Temp(double value,char scale){
        this.value = value;
        setScale(scale);
    }
     
    public void setScale(char scale){
        if(scale=='C' || scale=='F'){
            this.scale = scale;
        }
        else{
            System.out.println("Invalid scale");
        }
    }
    public double getc(){
        if(scale=='C'){
            return value;
        }
        else{
            return 5 * (value - 32) / 9;
        }
    }

    public double getf(){
        if(scale=='F'){
            return value;
        }
        else{
            return (9*(value/5))+32;
        }
    }

    public void setvalue(double value){
        this.value = value;
    }
    public void setvs(double value,char scale){
        this.value = value;
        setScale(scale);
    }
    public char getscale(){
        return scale;
    }
}