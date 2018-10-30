package enums.payment;

public enum PayrollDay {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
	private final PayType payType;

	PayrollDay() {
		this(PayType.WEEKDAY);
	}

	PayrollDay(PayType payType) {
		this.payType = payType;
	}
	int pay(int minutesWorked, int payRate) {
		return payType.pay(minutesWorked, payRate);
	}
}
