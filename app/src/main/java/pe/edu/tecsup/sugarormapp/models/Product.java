package pe.edu.tecsup.sugarormapp.models;

/**
 * Created by Alumno on 20/04/2018.
 */

public class Product {

    private String fullname;
    private String category;
    private Double precio;
    private String description;

    public Product(){

    }

    public Product(String fullname, String category, Double precio, String description ){
        this.setFullname(fullname);
        this.setCategory(category);
        this.setPrecio(precio);
        this.setDescription(description);
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                ", username='" + fullname + '\'' +
                ", fullname='" + category + '\'' +
                ", email='" + precio + '\'' +
                ", password='" + description + '\'' +
                '}';
    }

}

