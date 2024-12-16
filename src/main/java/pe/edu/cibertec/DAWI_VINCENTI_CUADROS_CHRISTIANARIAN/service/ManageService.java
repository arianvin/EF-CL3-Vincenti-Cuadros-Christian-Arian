package pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.service;
import pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.dto.CarDetailDto;
import pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.dto.CarDto;
import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<CarDto> getAllCars() throws Exception;


    Optional<CarDto> getAllCarsById(int id) throws Exception;


    Optional<CarDetailDto> getCarById(int id) throws Exception;


    boolean updateCar(CarDto carDto) throws Exception;


    boolean deleteCarById(int id) throws Exception;


    boolean addCar(CarDetailDto carDetailDto) throws Exception;

}
