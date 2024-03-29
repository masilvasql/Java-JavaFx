package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date finish;
	
	private Vehicle veiVehicle;
	private Invoice invoice;
	
	public CarRental() {
		
	}

	public CarRental(Date start, Date finish, Vehicle veiVehicle) {
		this.start = start;
		this.finish = finish;
		this.veiVehicle = veiVehicle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVeiVehicle() {
		return veiVehicle;
	}

	public void setVeiVehicle(Vehicle veiVehicle) {
		this.veiVehicle = veiVehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	

}
