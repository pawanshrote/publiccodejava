package day8.Encapsulation;

public class EncapsulationImplementaionThroughGetterSetter extends EncapsulationDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationDesign obj = new EncapsulationDesign();
				obj.setAbc(100000);
		        obj.setXyz("Pawan");
		        obj.setObc(10.25f);
		        
		        System.out.println(obj.getAbc());
		        System.out.println(obj.getXyz());
		        System.out.println(obj.getObc());
		
		
	}

}
