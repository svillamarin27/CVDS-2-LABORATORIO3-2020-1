package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

	 private Registry registry = new Registry();

	    @Test
	    public void validateRegistryResult() {

	        Person persona = new Person("Juan",10012,20,Gender.MALE,true);
	        
	        RegisterResult result = registry.registerVoter(persona);

	        Assert.assertEquals(RegisterResult.VALID, result);
	    }
		@Test
		public void mustValidateRegistryResultDead() {

	        Person person = new Person("Sebastian",1001,80,Gender.MALE,false);

	        RegisterResult result = registry.registerVoter(person);
			
	        Assert.assertEquals(RegisterResult.DEAD, result);
	    }
		
		@Test
		public void mustValidateRegistryResultUnderage(){
			Person person = new Person("Fonso",1,17,Gender.MALE,true);
			
			RegisterResult result = registry.registerVoter(person);
			
			Assert.assertEquals(RegisterResult.UNDERAGE, result);
		
		}
		 @Test
		    public void validateRegistryResultAge() {

		        Person persona = new Person("Juan",10012,-5,Gender.MALE,true);
		        
		        RegisterResult result = registry.registerVoter(persona);

		        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
		    }

		 
		 @Test
			public void mustValidateRegistryResultDuplicated(){
				Person person = new Person("Juan",1014299098,20,Gender.MALE,true);
				
				RegisterResult result = registry.registerVoter(person);
				
				Person person2 = new Person("Sebastian",1014299098,21,Gender.MALE,true);
				
				RegisterResult result2 = registry.registerVoter(person2);

				Assert.assertEquals(RegisterResult.DUPLICATED, result2);
			}
		
		
		

	    // TODO Complete with more test cases
	}