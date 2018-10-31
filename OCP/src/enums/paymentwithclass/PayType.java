package enums.paymentwithclass;

public enum PayType {
	WEEKDAY {
		public CalcPayment newInstance() {
			return new CalcPaymentWeekDayUseCase();
		}
	},
	WEEKEND {
		public CalcPayment newInstance() {
			return new CalcPaymentWeekendUseCase();
		}
	};
	public abstract CalcPayment newInstance();
}
