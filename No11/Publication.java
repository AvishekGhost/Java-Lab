public abstract class Publication {
    private int noOfPages;
    private float price;
    private String publisherName;
    private String type;

    public int getNoOfPages() {
        return noOfPages;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Publication(int noOfPages, float price, String publisherName, String type) {
        this.noOfPages = noOfPages;
        this.price = price;
        this.type = type;
        this.publisherName = publisherName;
    }
}
