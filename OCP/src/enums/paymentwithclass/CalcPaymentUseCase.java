package enums.paymentwithclass;

public class CalcPaymentUseCase {
	public static int execute(int minutesWorked, int payRate, PayrollDay payrollDay) {
		CalcPayment calcPayment = payrollDay.getPayType().newInstance();
		return calcPayment.execute(minutesWorked, payRate);
	}
}
