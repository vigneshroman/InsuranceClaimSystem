package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import com.cg.dao.PolicyDao;
import com.cg.model.Policy;
import com.cg.service.LoginService;
import com.cg.service.PolicyServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestPolicyService {
	
	@InjectMocks
	PolicyServiceImpl policy;
	
	@InjectMocks
	LoginService lService;
	
	@Mock
	PolicyDao pDao;
	

	
	@Test(expected=NullPointerException.class)
	public void testPolicy() {
		
		List<Policy> policyList =new ArrayList<>();
		policyList.add(new Policy(100,1500,4604));
		policyList.add(new Policy(101,2000,4604));
		
		
		
		List<Policy> output=policy.getPolicies("downman");
		assertEquals(2,output.size());
		verify(pDao, times(1)).retrieveAgentPolicies("downman");
	}

}
