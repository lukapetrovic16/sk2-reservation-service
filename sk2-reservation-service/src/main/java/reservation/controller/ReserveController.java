package reservation.controller;

import io.swagger.annotations.ApiOperation;
import reservation.domain.Reservation;
import reservation.service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("service/reservation")
public class ReserveController {
	private final ReservationService service;

    public ReserveController(ReservationService service) {
    	this.service = service;
	}
}
