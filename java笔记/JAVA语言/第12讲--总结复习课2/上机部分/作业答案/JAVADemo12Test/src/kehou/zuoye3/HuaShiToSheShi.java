package kehou.zuoye3;

/*
 * �����¶�=(�����¶�-32)*5/9
 */
public class HuaShiToSheShi extends ConvertTemperature {

	@Override
	public double convert(double wendu) {
		return (wendu - super.C) * 5 / 9;
	}

}
