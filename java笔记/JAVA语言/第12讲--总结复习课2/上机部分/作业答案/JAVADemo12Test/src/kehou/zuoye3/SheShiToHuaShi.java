package kehou.zuoye3;

/*
 * �����¶�=�����¶�*9/5+32
 */
public class SheShiToHuaShi extends ConvertTemperature {

	@Override
	public double convert(double wendu) {
		return wendu * 9 / 5 + super.C;
	}

}
