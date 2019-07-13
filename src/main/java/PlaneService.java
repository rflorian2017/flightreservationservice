import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosu.flights.model.Plane;
import com.rosu.flights.repository.PlaneRepository;

@Service
public class PlaneService {

	private PlaneRepository planeRepository;

	@Autowired
	public PlaneService(PlaneRepository planeRepository) {
		this.planeRepository = planeRepository;
	}
	
	public Plane createPlane(long id, String aircraftModel, int seatNo) {
		return planeRepository.save(new Plane(id, aircraftModel, seatNo));
	}
	
	public long total() {
		return this.planeRepository.count();
	}
}
