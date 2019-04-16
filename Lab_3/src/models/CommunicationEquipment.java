package models;



public class CommunicationEquipment {
           private String brand;
           private String model;
           private double price;
           private   Currencies currency;
           private int rating;
           private TypeOfCommunication typeOfCommunication;
           
           
           public CommunicationEquipment(){   
           }
           
           public CommunicationEquipment(final String brandObj, final String modelObj, final double priceObj , final  Currencies currencyObj, final int ratingObj , final TypeOfCommunication typeOfCommunicationObj){
        	   this.brand = brandObj;
        	   this.model = modelObj;
        	   this.price = priceObj;
        	   this.rating = ratingObj;
        	   this.currency = currencyObj;
        	   this.typeOfCommunication = typeOfCommunicationObj;
           }
           public final String getBrand() {
               return brand;
           }

           public final void setBrand(final String brandObj) {
               this.brand = brandObj;
           }
           
           public final String getModel() {
               return model;
           }

           public final void setModel(final String modelObj) {
               this.model = modelObj;
           }
           public final double getPrice(){
        	   return   price;
           }
           public final void setPrice(final double priceObj){
        	   this.price = priceObj;
           }
           public final int getRating(){
        	   return rating;
           }
           public final void setRating(final int ratingObj){
        	   this.rating = ratingObj;
           }
           public final Currencies getCurrencies(){
        	   return 	currency;
           }
           public final void setCurrencies(final Currencies currencyObj){
        	   this.currency = currencyObj;
           }
           public final TypeOfCommunication getTypeOfCommunication(){
        	   return typeOfCommunication;
           }
           public final void setTypeOfCommunication(final TypeOfCommunication typeOfCommunicationObj){
        	   this.typeOfCommunication = typeOfCommunicationObj;
           }

           @Override
           public String toString() {
               return "ChemistryInstrument{" +
                       "brand='" + brand + '\'' +
                       ", model='" + model + '\'' +
                       ", price=" + price + '\'' +
                       ",rating=" + rating + '\''+
                       ",currency=" + currency + '\'' +
                       ", typeOfCommunication=" + typeOfCommunication +
                       '}';
           }
           
}
