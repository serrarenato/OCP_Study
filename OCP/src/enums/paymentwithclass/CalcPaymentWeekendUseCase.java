package enums.paymentwithclass;

public class CalcPaymentWeekendUseCase extends CalcPayment {
	public int execute(int minutesWorked, int payRate) {
		int overtimePayment = minutesWorked * payRate / 2;
		int payment = minutesWorked * payRate;
		return overtimePayment + payment;
	}
}
