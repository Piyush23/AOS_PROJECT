package environment;

import java.time.Instant;

public class Car {
	private int status; // 1: ideal 2:wait 3:pass
	private Instant arrivalTimeStamp, timeOut;
	private int cid;

	public Car(int status, Instant timeStamp, Instant timeOut, int cid) {
		super();
		this.status = status;
		this.arrivalTimeStamp = timeStamp;
		this.timeOut = timeOut;
		this.cid = cid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Instant getTimeStamp() {
		return arrivalTimeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.arrivalTimeStamp = timeStamp;
	}

	public Instant getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Instant timeOut) {
		this.timeOut = timeOut;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void request() {
	}

	public void receive() {
	}

	public void reply() {
	}

}
