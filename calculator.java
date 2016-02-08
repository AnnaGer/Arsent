// Realization of calculation

public class calculator{

	public in result; //Result
	
	public void add(int ... params){ // Summarizing 
		for (Integer params:params){
			this.result += params;
		}
	}


	public int getResult(){ // Getting result
		return this.result;
	}

	public void cleanresult(){ // Cleaning result
		this.resul=0;
	}
}