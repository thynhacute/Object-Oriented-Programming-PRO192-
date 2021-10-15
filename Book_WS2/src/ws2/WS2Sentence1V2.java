
package ws2;


public class WS2Sentence1V2 {
    public String manufacturer;
    public String typeOfWatch;
    public String faceMaterial;
    public String energyUsed;
    public String waterResistance;
    public String diameter;
    public String guarantee;
    public String trademark;
    public String productCode;
    public String price;

    public WS2Sentence1V2(String manufacturer, String typeOfWatch, String faceMaterial, 
            String energyUsed, String waterResistance, String diameter, String guarantee, 
            String trademark, String productCode, String price) {
        this.manufacturer = manufacturer;
        this.typeOfWatch = typeOfWatch;
        this.faceMaterial = faceMaterial;
        this.energyUsed = energyUsed;
        this.waterResistance = waterResistance;
        this.diameter = diameter;
        this.guarantee = guarantee;
        this.trademark = trademark;
        this.productCode = productCode;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTypeOfWatch() {
        return typeOfWatch;
    }

    public void setTypeOfWatch(String typeOfWatch) {
        this.typeOfWatch = typeOfWatch;
    }

    public String getFaceMaterial() {
        return faceMaterial;
    }

    public void setFaceMaterial(String faceMaterial) {
        this.faceMaterial = faceMaterial;
    }

    public String getEnergyUsed() {
        return energyUsed;
    }

    public void setEnergyUsed(String energyUsed) {
        this.energyUsed = energyUsed;
    }

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public void showInforV2() {
        System.out.printf("|%-15s|%-31s|%-31s|%-10s|%-10s|%-10s|%-10s|%-49s|%-15s|%-15s|\n",
                manufacturer, typeOfWatch, faceMaterial, energyUsed, waterResistance, 
                diameter, guarantee, trademark, productCode, price);
    }
}
