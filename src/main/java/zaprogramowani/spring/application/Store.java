package zaprogramowani.spring.application;

public class Store {
    private Item item;


    public Store(Item item) {
        this.item = item;
    }

    public void itemPrint(){
        item.print();
    }
}