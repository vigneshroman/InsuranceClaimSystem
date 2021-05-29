package test;

	import static org.junit.Assert.assertEquals;
	import static org.mockito.Mockito.times;
	import static org.mockito.Mockito.verify;
	import static org.mockito.Mockito.when;
	 
	import java.util.ArrayList;
	import java.util.List;
	 

	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;

	import org.mockito.junit.MockitoJUnitRunner;
	
	import com.cg.dao.*;
	import com.cg.model.*;

	import com.cg.service.*;
	
	
	@RunWith(MockitoJUnitRunner.class)
	public class TestClaimService {

	     
	    @InjectMocks
	     ViewClaimServiceImpl vclaim;
	     
	     
	    @Mock
	     ViewClaimDao vdao;
	     
	 
//	    @Before
//	    public void init() {
//	        MockitoAnnotations.initMocks(this);
//	    }
//	     
	    @Test
	    public void getAllClaims()
	    {
	    	List<Claim> list=new ArrayList<>();
	    	list.add(new Claim("accident","chn","chn","chn",12345,"vehicle",100,94566));
	    	list.add(new Claim("fire","chn","chn","chn",34561,"restaurant",101,34516));

	    	when(vdao.getClaims("downman", "User")).thenReturn(list);
	    	
	    	List<Claim> res=vclaim.retrieveClaims("downman", "User");
	    	assertEquals(2,res.size());
	    	verify(vdao, times(1)).getClaims("downman", "User");
	    	
	    }
}
