
package ws2;


public class WS2Sentence1 {
    public String manufacturer;
    public String typeOfWatch;
    public String ropeMaterial;
    public String faceMaterial;
    public String shellMaterial;
    public String energyUsed;
    public String waterResistance;
    public String diameter;
    public String guarantee;
    public String trademark;
    public String consultationAndOrder;
    public String paymentMethods;
    public String productCode;
    public String price;

    public WS2Sentence1(String manufacturer, String typeOfWatch, String ropeMaterial, 
            String faceMaterial, String shellMaterial, String energyUsed, 
            String waterResistance, String diameter, String guarantee, String trademark, 
            String consultationAndOrder, String paymentMethods, String productCode, String price) {
        this.manufacturer = manufacturer;
        this.typeOfWatch = typeOfWatch;
        this.ropeMaterial = ropeMaterial;
        this.faceMaterial = faceMaterial;
        this.shellMaterial = shellMaterial;
        this.energyUsed = energyUsed;
        this.waterResistance = waterResistance;
        this.diameter = diameter;
        this.guarantee = guarantee;
        this.trademark = trademark;
        this.consultationAndOrder = consultationAndOrder;
        this.paymentMethods = paymentMethods;
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

    public String getRopeMaterial() {
        return ropeMaterial;
    }

    public void setRopeMaterial(String ropeMaterial) {
        this.ropeMaterial = ropeMaterial;
    }

    public String getFaceMaterial() {
        return faceMaterial;
    }

    public void setFaceMaterial(String faceMaterial) {
        this.faceMaterial = faceMaterial;
    }

    public String getShellMaterial() {
        return shellMaterial;
    }

    public void setShellMaterial(String shellMaterial) {
        this.shellMaterial = shellMaterial;
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

    public String getConsultationAndOrder() {
        return consultationAndOrder;
    }

    public void setConsultationAndOrder(String consultationAndOrder) {
        this.consultationAndOrder = consultationAndOrder;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
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
    public void showInfor() {
        System.out.printf("|%-15s|%-15s|%-15s|%-10s|%-20s|%-10s|%-10s|%-15s|"
                + "%-10s|%-15s|%-15s|%-17s|%-17s|%-15s|\n",
                manufacturer, typeOfWatch, ropeMaterial, faceMaterial, shellMaterial, 
                energyUsed, waterResistance, diameter, guarantee, trademark, 
                consultationAndOrder, paymentMethods, productCode, price);
    }
}