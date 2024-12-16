package pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.response;

import pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.dto.CarDto;

public record FindCarsResponse(String code,
                               String error,
                               Iterable<CarDto> cars) {
}
