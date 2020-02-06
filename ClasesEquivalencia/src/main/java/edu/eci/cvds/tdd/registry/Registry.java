package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {
	private ArrayList<Person> agenda = new ArrayList<Person>();
	
    public RegisterResult registerVoter(Person p) {

        // TODO Validate person and return real result.
    	
    	RegisterResult s=null;
    	for(Person k: agenda){
			if(p.getId() == k.getId()){
				return RegisterResult.DUPLICATED;
			}
			
		} 
    	if(p.getAge()>=18 && p.isAlive()) {
        	 s=RegisterResult.VALID;
        	 agenda.add(p);
        	
        }else if(p.getAge()<18 && p.getAge()>0) {
        	s=RegisterResult.UNDERAGE;
        }else if(p.getAge()<=0){
        	s=RegisterResult.INVALID_AGE;
        }else if(!p.isAlive()) {
        	s=RegisterResult.DEAD;
        }
    	
		return s;
    }
  
}
