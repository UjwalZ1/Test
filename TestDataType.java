package com.exponant;

public class TestDataType {
	String carName;
	byte carId;
	short EngId;
	int carMeterId;
	long cardistanceCover;
	float carGstPercentage;
	double carPrice;
	char cargrade;
	boolean carStatus;

	public void Tata() {
		String carName = "punch";
		byte carId = 101;
		short EngId = 3234;
		int carMeterId = 101023;
		long cardistanceCove = 10123;
		float carGstPercentage = 17.5f;
		double carPrice = 1754258;
		char cargrade = 'A';
		boolean carStatus = true;
		System.out.println(carName);
		System.out.println(carId);
		System.out.println(EngId);
		System.out.println(carMeterId);
		System.out.println(cardistanceCove);
		System.out.println(carGstPercentage);
		System.out.println(carPrice);
		System.out.println(cargrade);
		System.out.println(carStatus);
	}

	public static void main(String[] args) {
		System.out.println();
		TestDataType t = new TestDataType();
		System.out.println("-----Local variable");
		t.Tata();
		System.out.println("-----Global variable");
		System.out.println(t.carName);
		System.out.println(t.carId);
		System.out.println(t.EngId);
		System.out.println(t.carMeterId);
		// System.out.println(t.cardistanceCove);
		System.out.println(t.carGstPercentage);
		System.out.println(t.carPrice);
		System.out.println(t.cargrade);
		System.out.println(t.carStatus);

	}

}
