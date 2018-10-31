package enums.paymentwithclass;

public class CalcPaymentWeekDayUseCase extends CalcPayment {
	private static final int MINS_PER_SHIFT = 8 * 60;

	public int execute(int minutesWorked, int payRate) {
		int overtimePayment = minutesWorked <= MINS_PER_SHIFT ? 0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
		int payment = minutesWorked * payRate;
		return overtimePayment + payment;
	}
}
