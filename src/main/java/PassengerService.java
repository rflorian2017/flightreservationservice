import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosu.flights.model.Passenger;
import com.rosu.flights.repository.PassengerRepository;

@Service
public class PassengerService {

	private PassengerRepository passengerRepository;

	@Autowired
	public PassengerService(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}
	
	public Passenger createPlane(long id, String firstName, String lastName, int age) {
		return passengerRepository.save( new Passenger(id, firstName, lastName, age));
	}
	
	public long total() {
		return this.passengerRepository.count();
	}
}
