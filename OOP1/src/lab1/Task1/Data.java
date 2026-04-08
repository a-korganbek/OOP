package lab1.Task1;
class Data {
    private double sum;
    private int count;
    private double max;
    public Data(){
        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }
    public void addvalue(double value){
        sum+=value;
        count++;
        if(max<value){
            max = value;
        }
    }
    public double getmax(){
        if(count==0) return 0;
        return max;
    }
    public double getavg(){
        if(count==0) return 0;
        return sum/count;
    }

}