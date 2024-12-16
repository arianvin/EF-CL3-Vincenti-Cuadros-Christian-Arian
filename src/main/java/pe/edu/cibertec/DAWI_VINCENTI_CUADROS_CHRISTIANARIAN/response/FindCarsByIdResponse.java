package pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.response;

import pe.edu.cibertec.DAWI_VINCENTI_CUADROS_CHRISTIANARIAN.dto.CarDetailDto;

public record FindCarsByIdResponse(String code,
                                   String error,
                                   CarDetailDto cars) {
}
