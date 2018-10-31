package enums.paymentwithclass;

public enum PayrollDay {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
	private final PayType payType;

	PayrollDay() {
		this(PayType.WEEKDAY);
	}

	PayrollDay(PayType payType) {
		this.payType = payType;
	}
	public PayType getPayType() {
		return payType;
	}
}
