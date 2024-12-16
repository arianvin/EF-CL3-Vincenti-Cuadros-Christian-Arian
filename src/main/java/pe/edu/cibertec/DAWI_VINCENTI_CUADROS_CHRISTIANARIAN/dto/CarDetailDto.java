package pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.dto;
import java.util.Date;

public record CarDetailDto(
           Integer id,
           String make,
           String model,
           Integer year,
           String vin,
           String licensePlate,
           String ownerName,
           String ownerContact,
           Date purchaseDate,
           Integer mileage,
           String engineType,
           String color,
           String insuranceCompany,
           String insurancePolicyNumber,
           Date registrationExpirationDate,
           Date serviceDueDate) {
}
