package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFormattedDate(Date date) {
        return sdf.format(date);
    }

    @Override
    public String getSpecificData() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto: ").append(name)
                .append("\nLocalización: ").append(this.getLocation())
                .append("\nCantidad: ").append(quantity)
                .append("\nCaducidad: ").append(getFormattedDate(this.getExpirationDate()));
        return sb.toString();
    }

    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }
}
