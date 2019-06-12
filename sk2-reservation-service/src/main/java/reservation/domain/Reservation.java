package reservation.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Table(name="reservation")
@Data
@NoArgsConstructor

public class Reservation {
	@Id
    @Column(name = "reservation_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@Column(name = "projekcija")
	private String projection;

    @NotNull
    @Column(name = "korisnik", unique = true)
    private String reserveUser;

    @NotNull
    @Positive
    private Integer numberOfReservedSeats;

    @NotNull
    @Positive
    private Integer finalPrice;

}
