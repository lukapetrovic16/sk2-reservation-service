package reservation.service.impl;


import reservation.domain.Reservation;
import reservation.repositorium.ReserveRepository;
import reservation.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {

    private final ReserveRepository repository;

    public ReservationServiceImpl(ReserveRepository repository) {
        this.repository = repository;
    }

}
