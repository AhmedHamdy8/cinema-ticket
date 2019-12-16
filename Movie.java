
package main;

public class Movie {
    protected String Name ="";
    protected String writer ="";
    protected String typeOfMovie ="";
    protected String productionDate ="";
    protected String director ="";
    protected String actors ="";
     protected String price ="";

    public Movie(String Name, String writer, String typeOfMovie, String productionDate, String director, String actors,String price) {
        this.Name = Name;
        this.writer = writer;
        this.typeOfMovie = typeOfMovie;
        this.productionDate = productionDate;
        this.director = director;
        this.actors = actors;
        this.price=price;
    }
    
    public void Movie(){
        
    }

    public String getName() {
        return Name;
    }

    public void setTitle(String Name) {
        this.Name = Name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(String typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPrice() {
        return price;
    }
    
    
    public String toString() {
        return "Movie{" + "title=" + Name + ", writer=" + writer + ", typeOfMovie=" + typeOfMovie + ", productionDate=" + productionDate + ", director=" + director + ", actors=" + actors + '}';
    }
    
    
    
}
