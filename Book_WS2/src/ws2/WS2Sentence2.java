
package ws2;

public class WS2Sentence2 {
    public String namOfTheBook;
    public String category;
    public String author;
    public String language;
    public String publicationDate;
    public String numberOfPages;
    public String bookCode;
    public String price;
    public String evaluate;

    public WS2Sentence2(String namOfTheBook, String category, String author, 
            String language, String publicationDate, String numberOfPages, 
            String bookCode, String price, String evaluate) {
        this.namOfTheBook = namOfTheBook;
        this.category = category;
        this.author = author;
        this.language = language;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.bookCode = bookCode;
        this.price = price;
        this.evaluate = evaluate;
    }

    public String getNamOfTheBook() {
        return namOfTheBook;
    }

    public void setNamOfTheBook(String namOfTheBook) {
        this.namOfTheBook = namOfTheBook;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }
    
    public void showInforBooks() {
    System.out.printf("|%-20s|%-40s|%-20s|%-10s|%-20s|%-10s|%-12s|%-8s|%-8s|\n", 
            namOfTheBook, category, author, language, publicationDate, numberOfPages, 
            bookCode, price, evaluate);
    }
}
