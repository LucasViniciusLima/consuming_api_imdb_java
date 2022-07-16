package domain;

public class Movie implements Content{
    private String title;
    private String year;
    private String image;
    private String ratting;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getYear() {
        return year;
    }

    public String getRatting() {
        return ratting;
    }

    public void setRatting(String ratting){
        this.ratting = ratting;
    }

    public void setYear(String year){
        this.year = year;
    }

    @Override
    public String toString(){
        return "{ Titulo: " + this.title + ", Imagem: "+this.image + ", nota: "+this.ratting+", ano: "+this.year+" }";
    }
}
