package eu.rtakacs.chain;

public class DivideNumbers implements Chain {
	
	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		if(request.calculationWanted.equals("div")){
			System.out.println( request.number1 + " / " + request.number2 + " = " + (request.number1/request.number2) );
		} else{
			System.out.println("Only works for add, sub, mult, div.");
		}
	}

}
