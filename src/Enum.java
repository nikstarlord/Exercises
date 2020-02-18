 enum House {
    Olympius(2000),Mannat(5000),Galaxy(5000),Palace(4000);
    private int price;
    private House(int price){
        this.price = price;
    }
    int getPrice(){
        return price;
    }

}
