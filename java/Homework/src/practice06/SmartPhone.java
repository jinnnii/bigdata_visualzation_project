package practice06;

import java.util.Scanner;

public class SmartPhone extends Phone{
	


	public SmartPhone(String make, int price, String cmType, String osType, int osVer, int mSize, boolean camera, boolean blutooth) {
		super(make, price, cmType);
		this.osType = osType;
		this.osVer = osVer;
		this.mSize = mSize;
		this.camera = camera;
		this.blutooth = blutooth;
	}


	public SmartPhone() {}

	
	private String osType;
	private int osVer;
	private int mSize;
	private boolean camera;
	private boolean blutooth;
	public String getOsType() {
		return osType;
	}
	
	
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public int getOsVer() {
		return osVer;
	}
	public void setOsVer(int osVer) {
		this.osVer = osVer;
	}
	public int getmSize() {
		return mSize;
	}
	public void setmSize(int mSize) {
		this.mSize = mSize;
	}
	public boolean isCamera() {
		return camera;
	}
	public void setCamera(boolean camera) {
		this.camera = camera;
	}
	public boolean isBlutooth() {
		return blutooth;
	}
	public void setBlutooth(boolean blutooth) {
		this.blutooth = blutooth;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제조사 : ");
		String make = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("통신타입 : ");
		String cmType = sc.next();
		System.out.print("운영체제타입 : ");
		String osType = sc.next();
		System.out.print("운영체제버전 : ");
		int osVer = sc.nextInt();
		System.out.print("내부메모리크기 : ");
		int mSize = sc.nextInt();
		System.out.print("카메라장착여부 : ");
		
		boolean camera = sc.nextBoolean();
		System.out.print("블루투스지원여부 : ");
		boolean blutooth = sc.nextBoolean();
		
		SmartPhone sp = new SmartPhone(make,price,cmType,osType,osVer,mSize,camera,blutooth);
		System.out.println("제조사 : "+sp.getMake());
		System.out.println("가격 : "+sp.getPrice());
		System.out.println("통신타입 : "+sp.getCmType());
		System.out.println("운영체제타입 : "+sp.getOsType());
		System.out.println("운영체제버전 : "+sp.getOsVer());
		System.out.println("내부메모리크기 : "+sp.getmSize());
		System.out.println("카메라장착여부 : "+sp.isCamera());
		System.out.println("블루투스지원여부 : "+sp.isBlutooth()
		);
		sc.close();
	}
}
