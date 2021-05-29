package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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

import com.cg.dao.LoginDao;

import com.cg.model.Users;
import com.cg.service.LoginService;

@RunWith(MockitoJUnitRunner.class)
public class TestLoginService {
	
	@InjectMocks
    LoginService lService;
    
    @Mock
    LoginDao lDao;
    
    @Test
    public void testLogin()
    
    {
    	List<Users> list=new ArrayList<>();
    	list.add(new Users("admin2","127","Admin"));
    	list.add(new Users("Bhavana","Bhav@jana","User"));list.add(new Users("downman","125","User"));
    	list.add(new Users("kirthiga","Qerxtjli~","User"));list.add(new Users("Manisha","zxcvBnm1","User"));
    	list.add(new Users("master","123","Admin"));list.add(new Users("middle","124","Agent"));
    	list.add(new Users("Monisa","Monidang#","User"));list.add(new Users("Naren","Nare@afg","Agent"));
    	list.add(new Users("newuser","Azcvbnml@","User"));list.add(new Users("vignesh","asdfGhjk!","User"));
    	list.add(new Users("downmanA","126","User"));
    	
    		
    	when(lDao.retrieveUsers()).thenReturn(list);
    	
    	Users u=lService.validateLogin("admin2", "127");
    	assertEquals(list.get(0).getUsername(),u.getUsername());

    	Users u1=lService.validateLogin("downmanA", "126");
    	assertEquals(list.get(11).getUsername(),u1.getUsername());
    	

    	Users u2=lService.validateLogin("kirthiga", "Qerxtjli~");
    	assertEquals(list.get(3).getUsername(),u2.getUsername());
    	
    	
    	Users u3=lService.validateLogin("master", "123");
    	assertNotEquals("vignesh",u3.getUsername());
    	verify(lDao,times(4)).retrieveUsers();
    	
    	
    }
    
  
}
