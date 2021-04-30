public class MultiItemSale {

    private Sale[] sales;
    private int curr;

    public MultiItemSale() {
        this.sales = new Sale[10];
        this.curr = 0;
    }

    public void insertSale(Sale insert) {
        if (this.curr > this.sales.length){
            this.resize();
        }
        this.sales[this.curr] = insert;
        this.curr ++;
    }

    public void resize(){
        int currsize = this.sales.length;
        currsize *= 2;

        Sale[] newSales = new Sale[currsize];
        for (int i = 0; i < this.curr; i++){
            newSales[i] = this.sales[i];
        }
        this.sales = newSales;
    }

    public double computeTotal(){
        double result = 0.0;
        for (int i = 0; i < this.curr; i ++){
            result += this.sales[i].bill();
        }
        return result;
    }

    public String toString(){
        String str = "";
        for (int i=0 ; i < this.curr;i++){
            str += this.sales[i] + " ";
        }
        return str;
    }
}
