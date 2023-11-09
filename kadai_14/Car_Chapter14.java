package kadai_14;

public class Car_Chapter14 {
	private int gear = 1;
	private int speed = 10;
	
	public Car_Chapter14( int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange( int afterGear) {
		System.out.println("ギアを" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	}
	
	public void run() {
		
		if( this.gear > 5) {
			System.out.println("速度は時速10kmです");
			return;
		}
		
		this.speed = this.gear * 10;
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
