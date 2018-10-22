import javax.swing.JOptionPane;
public class U1L07CalendarMath {

	public static void main(String[] args) {
		String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
		int i = 0;
		String numberDay = JOptionPane.showInputDialog("What day of the year is it? ex: 81 ");
		int numDay = Integer.parseInt(numberDay);
		int weekDayNum = numDay%7;
		String weekDay = daysOfWeek[weekDayNum-1];
		while(numDay > daysInMonths[i]) {
			numDay -= daysInMonths[i];
			i++;
		}
		JOptionPane.showMessageDialog(null, "The date is "+weekDay+", "+months[i]+" "+numDay+", 2018.");
		

	}

}
